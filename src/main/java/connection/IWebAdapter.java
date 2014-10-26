package connection;

import com.gargoylesoftware.htmlunit.html.*;

/**
 * Created by david on 9/15/2014.
 */
public interface IWebAdapter {

    public HtmlPage getCurrentPage();
    public HtmlPage clickLink(String link);
    public void editForm(HtmlForm form, String text);
    public void clickButton(HtmlButton button);
    public boolean disconnect();
    public boolean connect();
}

