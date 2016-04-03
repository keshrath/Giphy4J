package at.mukprojects.giphy4j.util;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UrlUtilTest {

    private static final Logger log = LoggerFactory.getLogger(UrlUtilTest.class);

    private static final String BASE_URL = "http://www.base.at";

    @Test
    public void testUrlUtilNoParams() {
	assertEquals("http://www.base.at", UrlUtil.buildUrlQuery(BASE_URL, new HashMap<String, String>()));
    }

    @Test
    public void testUrlUtilWithParams() {
	HashMap<String, String> params = new HashMap<String, String>();

	params.put("api_key", "key");
	params.put("q", "cat funny");
	params.put("limit", "100");
	params.put("offset", "1");

	assertEquals("http://www.base.at?q=cat+funny&offset=1&api_key=key&limit=100",
		UrlUtil.buildUrlQuery(BASE_URL, params));
    }
}
