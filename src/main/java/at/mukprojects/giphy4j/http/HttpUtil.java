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

package at.mukprojects.giphy4j.http;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

import org.apache.commons.io.IOUtils;

/**
 * This class has methods to send request to the web.
 * 
 * @author Mathias Markl
 */
public class HttpUtil {

    public static final String ENCODING = "UTF-8";

    /**
     * Sends an request to the web and returns the response as String.
     * 
     * @param urlString
     *            The web URL.
     * @return Returns the response as String.
     * @throws IOException
     *             An exception is thrown if an error occurs.
     */
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
