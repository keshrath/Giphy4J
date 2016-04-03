package at.mukprojects.giphy4j.http;

public class Request {

    public Request(String url) {
	this.url = url;
    }
    
    private String url;
    
    public String getBuildURL() {
	// TODO Auto-generated method stub
	return url;
    }

}
