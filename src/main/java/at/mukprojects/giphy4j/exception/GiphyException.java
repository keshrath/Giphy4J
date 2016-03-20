package at.mukprojects.giphy4j.exception;

public class GiphyException extends Exception {

    private static final long serialVersionUID = -2564399168708610588L;

    public GiphyException() {
	super();
    }

    public GiphyException(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
	super(arg0, arg1, arg2, arg3);
    }

    public GiphyException(String arg0, Throwable arg1) {
	super(arg0, arg1);
    }

    public GiphyException(String arg0) {
	super(arg0);
    }

    public GiphyException(Throwable arg0) {
	super(arg0);
    }

}
