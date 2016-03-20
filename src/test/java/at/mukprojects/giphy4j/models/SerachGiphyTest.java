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

package at.mukprojects.giphy4j.models;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.FileInputStream;
import java.io.StringWriter;

import org.apache.commons.io.IOUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import at.mukprojects.giphy4j.Giphy;
import at.mukprojects.giphy4j.entity.search.SearchFeed;
import at.mukprojects.giphy4j.entity.search.SerachGiphy;
import at.mukprojects.giphy4j.exception.GiphyException;

/**
 * SerachFeed test class.
 *
 * @author Mathias Markl
 */
public class SerachGiphyTest {

    private final static String API_KEY = "dc6zaTOxFJmzC";
    private final static String RESFILE = "src/test/resources/search-id-response.json";

    private StringWriter writer;
    private FileInputStream inputStream;

    private Gson gson;
    private String jsonResponse;

    private Giphy giphy;

    @Before
    public void setUp() throws Exception {
	File inputFile = new File(RESFILE);

	inputStream = new FileInputStream(inputFile);
	writer = new StringWriter();

	IOUtils.copy(inputStream, writer, "UTF-8");
	jsonResponse = writer.toString();

	gson = new GsonBuilder().create();
	giphy = new Giphy(API_KEY);
    }

    @After
    public void tearDown() throws Exception {
	writer.close();
	inputStream.close();
    }

    /**
     * Tests the construction of the SerachGiphy model by parsing a sample API
     * response. The sample Json String is taken from the search-id-response
     * file.
     */
    @Test
    public void testSearchFeedModel() {
	SerachGiphy serachGiphy = gson.fromJson(jsonResponse, SerachGiphy.class);

	assertTrue(serachGiphy.getMeta().getStatus() == 200);
	assertEquals(serachGiphy.getData().getId(), "feqkVgjJpYtjy");
	assertEquals(serachGiphy.getData().getImages().getOriginal().getUrl(),
		"http://media0.giphy.com/media/feqkVgjJpYtjy/giphy.gif");

    }

    @Test
    public void testSearchFeedRequest() throws GiphyException {
	assertTrue(giphy.searchByID("feqkVgjJpYtjy") != null);
    }
}
