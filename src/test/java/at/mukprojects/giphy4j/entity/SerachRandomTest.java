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
import at.mukprojects.giphy4j.entity.search.SearchRandom;
import at.mukprojects.giphy4j.exception.GiphyException;
import at.mukprojects.giphy4j.http.Request;

public class SerachRandomTest {

    private final static String API_KEY = "dc6zaTOxFJmzC";
    private final static String RESFILE = "src/test/resources/search-random-response.json";

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
	SearchRandom searchRandom = gson.fromJson(jsonResponse, SearchRandom.class);

	assertTrue(searchRandom.getMeta().getStatus() == 200);
	assertTrue(searchRandom.getData() != null);
	assertTrue(searchRandom.getData().getId().equals("pZMX1O9D5LHJS"));
    }

    @Test
    public void testSearchFeedRequestSearchRandomSuccess() throws GiphyException {
	assertTrue(giphy.searchRandom("cat") != null);
	assertTrue(giphy.searchRandom("cat").getData() != null);
    }
    
    @Test
    public void testSearchFeedRequestSearchRandomStickerSuccess() throws GiphyException {
	assertTrue(giphy.searchRandomSticker("cat") != null);
	assertTrue(giphy.searchRandomSticker("cat").getData() != null);
    }


    @Test(expected = GiphyException.class)
    public void testSearchFeedRequestFailExceptionCode() throws GiphyException {
	giphyMockExceptionCode.searchRandom("");
    }
    
    @Test(expected = GiphyException.class)
    public void testSearchFeedRequestFailExceptionParse() throws GiphyException {
	giphyMockExceptionParse.searchRandomSticker("");
    }

}
