package at.mukprojects.giphy4j.dao;

import org.junit.After;
import org.junit.Before;

public class HttpRequestSenderTest extends AbstractRequestSenderTest {
    
    @Before
    public void setUp() throws Exception {
	setSender(new HttpRequestSender());
    }

    @After
    public void tearDown() throws Exception {
	
    }
}
