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
