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

import at.mukprojects.giphy4j.dao.HttpRequestSender;
import at.mukprojects.giphy4j.dao.RequestSender;
import at.mukprojects.giphy4j.entity.search.SearchFeed;
import at.mukprojects.giphy4j.entity.search.SearchGiphy;
import at.mukprojects.giphy4j.entity.search.SearchRandom;
import at.mukprojects.giphy4j.exception.GiphyException;
import at.mukprojects.giphy4j.http.Request;
import at.mukprojects.giphy4j.http.Response;
import at.mukprojects.giphy4j.util.UrlUtil;

/**
 * This class represents the main API.
 *
 * @author Mathias Markl
 */
public class Giphy {

    private static final Logger log = LoggerFactory.getLogger(Giphy.class);

    private static final String SearchEndpoint = "http://api.giphy.com/v1/gifs/search";
    private static final String IDEndpoint = "http://api.giphy.com/v1/gifs/";
    private static final String TranslateEndpoint = "http://api.giphy.com/v1/gifs/translate";
    private static final String RandomEndpoint = "http://api.giphy.com/v1/gifs/random";
    private static final String TrendingEndpoint = "http://api.giphy.com/v1/gifs/trending";

    private static final String SearchStickerEndpoint = "http://api.giphy.com/v1/stickers/search";
    private static final String TranslateStickerEndpoint = "http://api.giphy.com/v1/stickers/translate";
    private static final String TrendingStickerEndpoint = "http://api.giphy.com/v1/stickers/trending";

    private String apiKey;
    private RequestSender sender;
    private Gson gson;

    /**
     * Constructs a new Giphy object.
     * 
     * @param apiKey
     *            the GiphyAPI key
     */
    public Giphy(String apiKey) {
	this.apiKey = apiKey;

	sender = new HttpRequestSender();
	gson = new GsonBuilder().setPrettyPrinting().create();
    }

    /**
     * Constructs a new HttpRequestSender object.
     * 
     * <p>
     * It's recommended to use the simple constructor without a sender argument.
     * This one is just for testing purposes or in case you want to use the
     * sender with different settings.
     * 
     * @param apiKey
     *            the GiphyAPI key
     * @param sender
     *            the sender object
     * 
     */
    public Giphy(String apiKey, RequestSender sender) {
	this.apiKey = apiKey;
	this.sender = sender;

	gson = new GsonBuilder().setPrettyPrinting().create();
    }

    /**
     * Returns a SearchFeed object.
     * 
     * @param query
     *            the query parameters. Multiple parameters are separated by a
     *            space
     * @param offset
     *            the offset
     * @return the SearchFeed object
     * @throws GiphyException
     *             if an error occurs during the search
     */
    public SearchFeed search(String query, int offset) throws GiphyException {
	return search(query, 25, offset);
    }

    /**
     * Search all Giphy GIFs for a word or phrase and returns a SearchFeed
     * object.
     * 
     * @param query
     *            the query parameters. Multiple parameters are separated by a
     *            space
     * @param limit
     *            the result limit. The maximum is 100.
     * @param offset
     *            the offset
     * @return the SearchFeed object
     * @throws GiphyException
     *             if an error occurs during the search
     */
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

	Request request = new Request(UrlUtil.buildUrlQuery(SearchEndpoint, params));

	try {
	    Response response = sender.sendRequest(request);
	    feed = gson.fromJson(response.getBody(), SearchFeed.class);
	} catch (JsonSyntaxException | IOException e) {
	    log.error(e.getMessage(), e);
	    throw new GiphyException(e);
	}

	return feed;
    }

    /**
     * Returns a SerachGiphy object.
     * 
     * @param id
     *            the Giphy id
     * @return the SerachGiphy object
     * @throws GiphyException
     *             if an error occurs during the search
     */
    public SearchGiphy searchByID(String id) throws GiphyException {
	SearchGiphy giphy = null;

	HashMap<String, String> params = new HashMap<String, String>();

	params.put("api_key", apiKey);

	Request request = new Request(UrlUtil.buildUrlQuery(IDEndpoint + id, params));

	try {
	    Response response = sender.sendRequest(request);
	    giphy = gson.fromJson(response.getBody(), SearchGiphy.class);
	} catch (JsonSyntaxException | IOException e) {
	    log.error(e.getMessage(), e);
	    throw new GiphyException(e);
	}

	return giphy;
    }

    /**
     * The translate API draws on search, but also translates from one
     * vocabulary to another. In this case, words and phrases to GIFs.
     * 
     * @param query
     *            the query parameters
     * @return the SerachGiphy object
     * @throws GiphyException
     *             if an error occurs during the search
     */
    public SearchGiphy translate(String query) throws GiphyException {
	SearchGiphy giphy = null;

	HashMap<String, String> params = new HashMap<String, String>();

	params.put("api_key", apiKey);
	params.put("s", query);

	Request request = new Request(UrlUtil.buildUrlQuery(TranslateEndpoint, params));

	try {
	    Response response = sender.sendRequest(request);
	    giphy = gson.fromJson(response.getBody(), SearchGiphy.class);
	} catch (JsonSyntaxException | IOException e) {
	    log.error(e.getMessage(), e);
	    throw new GiphyException(e);
	}

	return giphy;
    }

    /**
     * Returns a random GIF, limited by tag.
     * 
     * @param tag
     *            the GIF tag to limit randomness
     * @return the SerachGiphy object
     * @throws GiphyException
     *             if an error occurs during the search
     */
    public SearchRandom searchRandom(String tag) throws GiphyException {
	SearchRandom random = null;

	HashMap<String, String> params = new HashMap<String, String>();

	params.put("api_key", apiKey);
	params.put("tag", tag);

	Request request = new Request(UrlUtil.buildUrlQuery(RandomEndpoint, params));

	try {
	    Response response = sender.sendRequest(request);
	    random = gson.fromJson(response.getBody(), SearchRandom.class);
	} catch (JsonSyntaxException | IOException e) {
	    log.error(e.getMessage(), e);
	    throw new GiphyException(e);
	}

	return random;
    }

    /**
     * Fetch GIFs currently trending online. Hand curated by the Giphy editorial
     * team. The data returned mirrors the GIFs showcased on the Giphy homepage.
     * Returns 25 results by default.
     * 
     * @return the SearchFeed object
     * @throws GiphyException
     *             if an error occurs during the search
     */
    public SearchFeed trend() throws GiphyException {
	SearchFeed feed = null;

	HashMap<String, String> params = new HashMap<String, String>();

	params.put("api_key", apiKey);

	Request request = new Request(UrlUtil.buildUrlQuery(TrendingEndpoint, params));

	try {
	    Response response = sender.sendRequest(request);
	    feed = gson.fromJson(response.getBody(), SearchFeed.class);
	} catch (JsonSyntaxException | IOException e) {
	    log.error(e.getMessage(), e);
	    throw new GiphyException(e);
	}

	return feed;
    }

    /**
     * Returns a SearchFeed object.
     * 
     * @param query
     *            The query parameters. Multiple parameters are separated by a
     *            space.
     * @param offset
     *            The offset.
     * @return Returns a SearchFeed object.
     * @throws GiphyException
     *             If an error occurs a exception is thrown.
     */
    public SearchFeed searchSticker(String query, int offset) throws GiphyException {
	return searchSticker(query, 25, offset);
    }

    /**
     * Returns a SearchFeed object.
     * 
     * @param query
     *            The query parameters. Multiple parameters are separated by a
     *            space.
     * @param limit
     *            The result limit. The maximum is 100.
     * @param offset
     *            The offset.
     * @return Returns a SearchFeed object.
     * @throws GiphyException
     *             If an error occurs a exception is thrown.
     */
    public SearchFeed searchSticker(String query, int limit, int offset) throws GiphyException {
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

	String url = UrlUtil.buildUrlQuery(SearchStickerEndpoint, params);

	try {
	    feed = gson.fromJson(HttpUtil.sendRequest(url), SearchFeed.class);
	} catch (JsonSyntaxException | IOException e) {
	    try {
		log.debug(url);
		log.debug(HttpUtil.sendRequest(url));
	    } catch (IOException e1) {
	    }
	    log.error(e.getMessage(), e);
	    throw new GiphyException(e);
	}

	return feed;
    }

    /**
     * Returns a SerachGiphy object.
     * 
     * @param query
     *            The query parameters.
     * @return Returns a SerachGiphy object.
     * @throws GiphyException
     *             If an error occurs a exception is thrown.
     */
    public SearchGiphy translateSticker(String query) throws GiphyException {
	SearchGiphy giphy = null;

	HashMap<String, String> params = new HashMap<String, String>();

	params.put("api_key", apiKey);
	params.put("s", query);

	String url = UrlUtil.buildUrlQuery(TranslateStickerEndpoint, params);

	try {
	    giphy = gson.fromJson(HttpUtil.sendRequest(url), SearchGiphy.class);
	} catch (JsonSyntaxException | IOException e) {
	    try {
		log.debug(url);
		log.debug(HttpUtil.sendRequest(url));
	    } catch (IOException e1) {
	    }
	    log.error(e.getMessage(), e);
	    throw new GiphyException(e);
	}

	return giphy;
    }

    /**
     * Returns a SearchFeed object.
     * 
     * @return Returns a SearchFeed object.
     * @throws GiphyException
     *             If an error occurs a exception is thrown.
     */
    public SearchFeed trendSticker() throws GiphyException {
	SearchFeed feed = null;

	HashMap<String, String> params = new HashMap<String, String>();

	params.put("api_key", apiKey);

	String url = UrlUtil.buildUrlQuery(TrendingStickerEndpoint, params);

	try {
	    feed = gson.fromJson(HttpUtil.sendRequest(url), SearchFeed.class);
	} catch (JsonSyntaxException | IOException e) {
	    try {
		log.debug(url);
		log.debug(HttpUtil.sendRequest(url));
	    } catch (IOException e1) {
	    }
	    log.error(e.getMessage(), e);
	    throw new GiphyException(e);
	}

	return feed;
    }

}
