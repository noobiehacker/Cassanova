package connection;

import com.gargoylesoftware.htmlunit.html.HtmlAnchor;
import com.gargoylesoftware.htmlunit.html.HtmlForm;
import com.gargoylesoftware.htmlunit.html.HtmlLink;
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

import static org.junit.Assert.*;

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
        datingSite.url = "http://www.pof.com";
        webAdapter = new WebAdapter(credential, datingSite);
    }

    @After
    public void tearDown() throws Exception {
        webAdapter =null;
    }

    @Test
    public void testConnect() throws Exception {
        testAdapter();
    }

    @Test
    public void testDisconnect() throws Exception {
        testAdapter();
    }

    @Test
    public void testGetCurrentPage() throws Exception {
        testAdapter();
    }

    @Test
    public void testClickLink() throws Exception {
        testAdapter();
    }

    @Test
    public void testEditForm() throws Exception {
        testAdapter();
    }

    @Test
    public void testClickButton() throws Exception {
        testAdapter();
    }

    @Ignore
    private void testAdapter(){
        assertTrue(webAdapter.connect());
        assertNotNull(webAdapter.getCurrentPage());
        assertNotNull(webAdapter.clickLink("http://www.google.com"));
        assertNotNull(webAdapter.clickLink());
        assertTrue(webAdapter.disconnect());
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
    private HtmlAnchor getFirstLink(HtmlPage page){
        HtmlAnchor returnAnchor = null;
        List<HtmlAnchor> anchors = page.getAnchors();
        if(anchors!=null){
            returnAnchor = anchors.get(0);
        }
        return returnAnchor;
    }
}