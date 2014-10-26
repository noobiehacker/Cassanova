package Factories;


import com.gargoylesoftware.htmlunit.html.HtmlPage;
import page.*;

/**
 * Created by david on 10/23/2014.
 */
public abstract class AbstractFactory {
    public abstract InboxPage getInboxPage(HtmlPage page);
    public abstract ListingPage getListingPage(HtmlPage page);
    public abstract LoginPage getLoginPage(HtmlPage page);
    public abstract UserPage getUserPage(HtmlPage page);
}
