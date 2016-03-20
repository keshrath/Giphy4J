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
import java.util.HashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;

import at.mukprojects.giphy4j.entity.search.SearchFeed;
import at.mukprojects.giphy4j.entity.search.SerachGiphy;
import at.mukprojects.giphy4j.exception.GiphyException;
import at.mukprojects.giphy4j.http.HttpUtil;
import at.mukprojects.giphy4j.http.UrlUtil;

/**
 * This class represents the main API class.
 *
 * @author Mathias Markl
 */
public class Giphy {

    private static final Logger log = LoggerFactory.getLogger(Giphy.class);
    
    private static final String SearchEndpoint = "http://api.giphy.com/v1/gifs/search";
    private static final String IDEndpoint = "http://api.giphy.com/v1/gifs/";

    private String apiKey;
    private Gson gson;

    public Giphy(String apiKey) {
	this.apiKey = apiKey;

	gson = new GsonBuilder().setPrettyPrinting().create();
    }

    public SearchFeed search(String query, int offset) throws GiphyException {
	return search(query, 25, offset);
    }

    public SearchFeed search(String query, int limit, int offset) throws GiphyException {
	SearchFeed feed = null;

	HashMap<String, String> params = new HashMap<String, String>();

	params.put("api_key", apiKey);
	params.put("q", query);
	if (limit > 100) {
	    params.put("limit", "100");
	} else {
	    params.put("limit", limit + "");
	}
	params.put("offset", offset + "");

	String url = UrlUtil.buildUrlQuery(SearchEndpoint, params);

	try {
	    feed = gson.fromJson(HttpUtil.sendRequest(url), SearchFeed.class);
	} catch (JsonSyntaxException | IOException e) {
	    log.debug(url);
	    log.debug(gson.toJson(feed));
	    log.error(e.getMessage(), e);
	    throw new GiphyException(e);
	}
	
	return feed;
    }

    public SerachGiphy searchByID(String id) throws GiphyException {
	SerachGiphy giphy = null;

	HashMap<String, String> params = new HashMap<String, String>();

	params.put("api_key", apiKey);

	String url = UrlUtil.buildUrlQuery(IDEndpoint + id, params);

	try {
	    giphy = gson.fromJson(HttpUtil.sendRequest(url), SearchFeed.class);
	} catch (JsonSyntaxException | IOException e) {
	    log.debug(url);
	    try {
		log.debug(HttpUtil.sendRequest(url));
	    } catch (IOException e1) {
	    }
	    log.error(e.getMessage(), e);
	    throw new GiphyException(e);
	}
	
	return giphy;
    }
    
}
