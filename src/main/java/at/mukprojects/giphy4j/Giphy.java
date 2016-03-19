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

package at.mukprojects.giphy4j;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

import org.apache.commons.io.IOUtils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import at.mukprojects.giphy4j.entity.SearchFeed;

/**
 * This class represents the main API class.
 *
 * @author Mathias Markl
 */
public class Giphy {

    private static final String searchQuery = "http://api.giphy.com/v1/gifs/search?";

    private String apiKey;
    private Gson gson;

    public Giphy(String apiKey) {
	this.apiKey = apiKey;
	gson = new GsonBuilder().create();
    }

    public SearchFeed search(String query, int offset) throws IOException {
	return search(query, 25, offset);
    }

    public SearchFeed search(String query, int limit, int offset) throws IOException {
	SearchFeed feed = null;

	if (limit > 100) {
	    limit = 100;
	}

	String formattedQuery = query.replace(" ", "+");
	String queryString = searchQuery;

	queryString += "q=" + formattedQuery;
	queryString += "&";
	queryString += "limit=" + limit;
	queryString += "&";
	queryString += "offset=" + offset;
	queryString += "&";
	queryString += "api_key=" + apiKey;

	URL url = new URL(queryString);
	URLConnection con = url.openConnection();
	InputStream in = con.getInputStream();

	String encoding = con.getContentEncoding();
	encoding = encoding == null ? "UTF-8" : encoding;

	String body = IOUtils.toString(in, encoding);

	try {
	    feed = gson.fromJson(body, SearchFeed.class);
	} catch (Exception e) {
	    e.printStackTrace(); // TODO
	} finally {
	    in.close();
	}

	return feed;
    }

}
