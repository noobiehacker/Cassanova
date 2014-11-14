package cassanovaSystem;

import com.gargoylesoftware.htmlunit.html.HtmlElement;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import connection.IWebAdapter;
import model.Rose;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by david on 14-11-14.
 */
public class SiteScrapper implements ISiteScrapper{
    private IWebAdapter adapter;

    public SiteScrapper(IWebAdapter adapter){
        this.adapter=adapter;
    }

    public List<Rose> getAllUsers(){
        //1)Load in Base Site
        //2)Find first listing page
        //3)Given a listing page, scrape out all user info from one listing page
        //3a)Find Divs that has the user information
        //3b)Scrape out each Div iteratively
        //4)Iterate to other listing pages(1,2,3,4) etc
        //5)If we hit a listing page that doesn't have a next listing page, we stop
        return null;
    }

    private List<Rose> getUserFromListingPage(HtmlPage page){
        return null;
    }

    private List<HtmlElement> getDivs(HtmlPage page){
        List<HtmlElement> returnDivs = new ArrayList<HtmlElement>();
        returnDivs.addAll((List) page.getByXPath("//span[@class='white-row1']"));
        returnDivs.addAll((List) page.getByXPath("//span[@class='white-row2']"));
        returnDivs.addAll((List) page.getByXPath("//span[@class='white-serious']"));
        return returnDivs;
    }

    private List<HtmlElement> getDivFromClass(String className , HtmlPage page){
        String xpath = String.format("//div[@class=\'%s\']", className);
        List<?> divs =(List) page.getByXPath("//span[@class='white-row1']");
        return (List<HtmlElement>)divs;
    }
}
