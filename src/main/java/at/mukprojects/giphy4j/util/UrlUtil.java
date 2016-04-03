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

package at.mukprojects.giphy4j.util;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Map;

import at.mukprojects.giphy4j.Giphy4JConstants;

/**
 * This class provides methods to build an URL String.
 * 
 * @author Mathias Markl
 */
public class UrlUtil {

    private static final String PAIR_SEPARATOR = "=";

    private static final String PARAM_SEPARATOR = "&";

    private static final char QUERY_STRING_SEPARATOR = '?';

    /**
     * Builds the URL String.
     * 
     * @param baseUrl
     *            the base URL.
     * @param params
     *            the URL parameter.
     * @return the URL as String.
     */
    public static String buildUrlQuery(String baseUrl, Map<String, String> params) {
	if (baseUrl.isEmpty() || params.isEmpty()) {
	    return baseUrl;
	} else {
	    String query = baseUrl;
	    query += QUERY_STRING_SEPARATOR;

	    for (String key : params.keySet()) {
		query += key;
		query += PAIR_SEPARATOR;
		query += encodeString(params.get(key));
		query += PARAM_SEPARATOR;
	    }

	    return query.substring(0, query.length() - 1);
	}
    }

    private static String encodeString(String text) {
	try {
	    return URLEncoder.encode(text, Giphy4JConstants.ENCODING);
	} catch (UnsupportedEncodingException e) {
	}
	return text;
    }
}
