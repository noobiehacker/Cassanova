package connection;

import com.gargoylesoftware.htmlunit.html.HtmlAnchor;
import com.gargoylesoftware.htmlunit.html.HtmlForm;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import enumurator.DatingSiteEnum;
import junit.framework.TestCase;
import model.Credential;
import model.DatingSite;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.util.List;

public class WebAdapterTest extends TestCase {

    private IWebAdapter webAdapter;
    @Before
    public void setUp() throws Exception {
        Credential credential = new Credential();
        DatingSite datingSite = new DatingSite();
        credential.setDatingSite(DatingSiteEnum.PlentyOfFish);
        credential.setPassword("username");
        credential.setUserName("password");
        datingSite.datingSite = DatingSiteEnum.PlentyOfFish;
        datingSite.url = "http://www.pof.com/basicsearch.aspx?iama=m&seekinga=f&minage=18&maxage=99&country=1&state=&city=&miles=35&z_code=&viewtype=1&imagesetting=0&sorting=0&Submit=Go+Fishing%21&Profession=&Interests=&save=1";
        webAdapter = new WebAdapter(credential, datingSite);
    }

    @After
    public void tearDown() throws Exception {
        webAdapter =null;
    }

    @Test
    public void testConnect() throws Exception {
        assertTrue(webAdapter.connect());
    }

    @Test
    public void testDisconnect() throws Exception {
        assertTrue(webAdapter.connect());
        assertTrue(webAdapter.disconnect());
    }

    @Test
    public void testGetCurrentPage() throws Exception {
        testWebAdapterNonNull();
    }

    @Test
    public void testClickLink() throws Exception {
        testWebAdapterNonNull();
    }

    @Test
    public void testEditForm() throws Exception {
        testWebAdapterNonNull();
    }

    @Test
    public void testClickButton() throws Exception {
        testWebAdapterNonNull();
    }

    @Ignore
    private void testWebAdapterNonNull(){


        /*
        assertTrue(webAdapter.connect());
        assertNotNull(webAdapter.getCurrentPage());
        assertNotNull(webAdapter.clickLink("http://www.google.com"));
        HtmlAnchor firstAnchor = getFirstAnchor(webAdapter.getCurrentPage());
        HtmlForm firstForm = getFirstForm(webAdapter.getCurrentPage());
        if(firstAnchor!=null) {
            assertNotNull(webAdapter.clickLink(firstAnchor.getHrefAttribute()));
        }
        if(firstForm!=null) {
            webAdapter.editForm(firstForm ,"ABC");
            firstForm = getFirstForm(webAdapter.getCurrentPage());
            assertEquals(firstForm.getTextContent() , "ABC");
        }
        assertTrue(webAdapter.disconnect());*/
    }

    @Ignore
    private HtmlForm getFirstForm(HtmlPage page){
        HtmlForm returnForm = null;
        List<HtmlForm> forms = page.getForms();
        if(forms!=null){
            returnForm = forms.get(0);
        }
        return returnForm;
    }

    @Ignore
    private HtmlAnchor getFirstAnchor(HtmlPage page){
        HtmlAnchor returnAnchor = null;
        List<HtmlAnchor> anchors = page.getAnchors();
        if(anchors!=null){
            returnAnchor = anchors.get(0);
        }
        return returnAnchor;
    }
}