package page;

/**
 * Created by david on 10/24/2014.
 */
public abstract class WebPage {

    private int statusCode;

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }
}
