package at.mukprojects.giphy4j.http;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

import org.apache.commons.io.IOUtils;

public class HttpUtil {

    public static final String ENCODING = "UTF-8";

    public static String sendRequest(String urlString) throws IOException {
	String response = null;
	
	IOException exception = null;
	InputStream in = null;

	try {
	    URL url = new URL(urlString);
	    URLConnection con = url.openConnection();

	    in = con.getInputStream();

	    String encoding = con.getContentEncoding();
	    encoding = encoding == null ? ENCODING : encoding;

	    response = IOUtils.toString(in, encoding);
	} catch (IOException e) {
	    exception = e;
	} finally {
	    if (in != null) {
		in.close();
	    }
	}

	if (exception != null) {
	    throw exception;
	}

	return response;
    }
    
}
