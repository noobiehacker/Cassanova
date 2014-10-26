package Factories;

import com.gargoylesoftware.htmlunit.html.HtmlPage;
import page.*;
/**
 * Created by david on 10/24/2014.
 */
public class OkcupidPageFactory extends AbstractFactory {
    @Override
    public InboxPage getInboxPage(HtmlPage page) {
        return null;
    }

    @Override
    public ListingPage getListingPage(HtmlPage page) {
        return null;
    }

    @Override
    public LoginPage getLoginPage(HtmlPage page) {
        return null;
    }

    @Override
    public UserPage getUserPage(HtmlPage page) {
        return null;
    }
}
