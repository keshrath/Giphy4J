package at.mukprojects.giphy4j.http;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Map;

public class UrlUtil {

    private static final String PAIR_SEPARATOR = "=";

    private static final String PARAM_SEPARATOR = "&";

    private static final char QUERY_STRING_SEPARATOR = '?';

    public static final String ENCODING = "UTF-8";

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

	    return query.substring(0, query.length() - 2);
	}
    }

    private static String encodeString(String text) {
	try {
	    return URLEncoder.encode(text, ENCODING);
	} catch (UnsupportedEncodingException e) {
	}
	return text;
    }
}
