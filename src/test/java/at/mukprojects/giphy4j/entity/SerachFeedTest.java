/** 
 * This code is copyright (c) Mathias Markl 2016
 * 
 * This program is free software: you can redistribute it and/or modify it under
 * the terms of the GNU General Public License as published by the Free Software
 * Foundation, either version 3 of the License, or (at your option) any later
 * version.
 * 
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU General Public License for more
 * details.
 * 
 * You should have received a copy of the GNU General Public License along with
 * this program. If not, see <http://www.gnu.org/licenses/>.
 */

package at.mukprojects.giphy4j.entity;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.StringWriter;

import org.apache.commons.io.IOUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import at.mukprojects.giphy4j.Giphy;
import at.mukprojects.giphy4j.dao.HttpRequestSender;
import at.mukprojects.giphy4j.dao.RequestSender;
import at.mukprojects.giphy4j.entity.search.SearchFeed;
import at.mukprojects.giphy4j.exception.GiphyException;
import at.mukprojects.giphy4j.http.Request;

public class SerachFeedTest {

    private final static String API_KEY = "dc6zaTOxFJmzC";
    private final static String RESFILE = "src/test/resources/search-feed-response.json";

    private StringWriter writer;
    private FileInputStream inputStream;

    private Gson gson;
    private String jsonResponse;

    private Giphy giphy;
    private Giphy giphyMockExceptionCode;
    private Giphy giphyMockExceptionParse;

    @Before
    public void setUp() throws Exception {
	File inputFile = new File(RESFILE);

	inputStream = new FileInputStream(inputFile);
	writer = new StringWriter();

	IOUtils.copy(inputStream, writer, "UTF-8");
	jsonResponse = writer.toString();

	gson = new GsonBuilder().create();
	giphy = new Giphy(API_KEY);

	RequestSender senderCode = Mockito.mock(HttpRequestSender.class);
	when(senderCode.sendRequest(any(Request.class))).thenThrow(new IOException("Bad response! Code: 401"));
	giphyMockExceptionCode = new Giphy(API_KEY, senderCode);

	RequestSender senderParse = Mockito.mock(HttpRequestSender.class);
	when(senderParse.sendRequest(any(Request.class)))
		.thenThrow(new IOException("Unparseable response body! \n { '' }"));
	giphyMockExceptionParse = new Giphy(API_KEY, senderCode);

    }

    @After
    public void tearDown() throws Exception {
	writer.close();
	inputStream.close();
    }

    @Test
    public void testSearchFeedModel() {
	SearchFeed searchFeed = gson.fromJson(jsonResponse, SearchFeed.class);

	assertTrue(searchFeed.getMeta().getStatus() == 200);
	assertTrue(searchFeed.getPagination().getCount() == 2);
	assertTrue(searchFeed.getDataList().size() >= 1);
	assertEquals(searchFeed.getDataList().get(0).getId(), "QgcQLZa6glP2w");
	assertEquals(searchFeed.getDataList().get(0).getImages().getOriginal().getUrl(),
		"http://media2.giphy.com/media/QgcQLZa6glP2w/giphy.gif");

    }

    @Test
    public void testSearchFeedRequestSearchSuccess() throws GiphyException {
	assertTrue(giphy.search("cat", 1, 0) != null);
	assertFalse(giphy.search("cat", 1, 0).getDataList().isEmpty());
    }
    
    @Test
    public void testSearchFeedRequestSearchLimit() throws GiphyException {
	assertTrue(giphy.search("cat", 101, 0) != null);
	assertFalse(giphy.search("cat", 1, 0).getDataList().isEmpty());
	assertTrue(giphy.search("cat", 1, 0).getDataList().size() <= 100);
    }


    @Test
    public void testSearchFeedRequestTrendSuccess() throws GiphyException {
	assertTrue(giphy.trend() != null);
	assertFalse(giphy.trend().getDataList().isEmpty());
    }

    @Test
    public void testSearchFeedRequestSearchStickerSuccess() throws GiphyException {
	assertTrue(giphy.searchSticker("cat", 1, 0) != null);
	assertFalse(giphy.searchSticker("cat", 1, 0).getDataList().isEmpty());
    }
    
    @Test
    public void testSearchFeedRequestSearchStickerLimit() throws GiphyException {
	assertTrue(giphy.searchSticker("cat", 101, 0) != null);
	assertFalse(giphy.searchSticker("cat", 1, 0).getDataList().isEmpty());
	assertTrue(giphy.searchSticker("cat", 1, 0).getDataList().size() <= 100);
    }

    @Test
    public void testSearchFeedRequestTrendStickerSuccess() throws GiphyException {
	assertTrue(giphy.trendSticker() != null);
	assertFalse(giphy.trendSticker().getDataList().isEmpty());
    }

    @Test(expected = GiphyException.class)
    public void testSearchFeedRequestFailExceptionCode() throws GiphyException {
	giphyMockExceptionCode.search("", 1);
    }
    
    @Test(expected = GiphyException.class)
    public void testSearchFeedRequestFailExceptionParse() throws GiphyException {
	giphyMockExceptionParse.trend();
    }

}
