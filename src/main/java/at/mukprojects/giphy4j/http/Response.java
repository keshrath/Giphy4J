package at.mukprojects.giphy4j.http;

import java.util.Map;

public class Response {
    
    private Map<String, String> headers;
    private String body;
    
    public Response(Map<String, String> headers, String body) {
	this.headers = headers;
	this.body = body;
    }

    public Map<String, String> getHeaders() {
        return headers;
    }

    public String getBody() {
        return body;
    }
    
    
}
