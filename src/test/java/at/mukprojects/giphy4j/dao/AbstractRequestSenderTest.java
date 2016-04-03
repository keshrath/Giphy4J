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

package at.mukprojects.giphy4j.dao;

import static org.junit.Assert.assertFalse;

import java.io.IOException;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import at.mukprojects.giphy4j.http.Request;
import at.mukprojects.giphy4j.http.Response;

public abstract class AbstractRequestSenderTest {
    
    private static final Logger log = LoggerFactory.getLogger(AbstractRequestSenderTest.class);
    
    private RequestSender sender;
    
    protected void setSender(RequestSender sender) {
	this.sender = sender;
    }
    
    private static final String SIMPLE_URL = "http://www.google.at";
    private static final String RANDOM_URL_SUCCESS = "http://api.giphy.com/v1/gifs/random?api_key=dc6zaTOxFJmzC&tag=cat";
    private static final String RANDOM_URL_FORBIDDEN = "http://api.giphy.com/v1/gifs/random?api_key=noKey&tag=cat";
    
    @Test
    public void testSimpleUrl() throws IOException {
	log.info("Test: SimpleUrl - URL: " + SIMPLE_URL);
	
	Response response = sender.sendRequest(new Request(SIMPLE_URL));
	
	assertFalse(response.getHeaders().isEmpty());
	assertFalse(response.getBody().isEmpty());
    }
    
    @Test
    public void testRandomUrlSuccess() throws IOException {
	log.info("Test: RandomUrlSuccess - URL: " + RANDOM_URL_SUCCESS);
	
	Response response = sender.sendRequest(new Request(RANDOM_URL_SUCCESS));
	
	assertFalse(response.getHeaders().isEmpty());
	assertFalse(response.getBody().isEmpty());
    }
    
    @Test(expected = IOException.class)
    public void testRandomUrlForbidden() throws IOException {
	log.info("Test: RandomUrlForbidden - URL: " + RANDOM_URL_FORBIDDEN);
	
	sender.sendRequest(new Request(RANDOM_URL_FORBIDDEN));
    }
}
