package connection;

import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.NicelyResynchronizingAjaxController;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlButton;
import com.gargoylesoftware.htmlunit.html.HtmlForm;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import model.Credential;
import model.DatingSite;

public class WebAdapter implements IWebAdapter {

    private WebClient webClient;
    private Credential credential;
    private DatingSite datingSite;
    private Boolean isConnected = false;
    private HtmlPage currentPage;

    @Override
    public boolean connect() {
        Boolean result = isConnected;
        try {
            this.clickLink(this.datingSite.url);
        } catch(Exception e){
            System.out.println(e.toString());
        }
        return result;
    }

    public WebAdapter(Credential credential)
    {
        this.credential=credential;
        this.webClient = new WebClient(BrowserVersion.CHROME);
        this.setWebClientOptions(this.webClient);
    }

    @Override
    public boolean disconnect()
    {
        Boolean result = false;
        try {
            webClient.closeAllWindows();
            isConnected = true;
            result = !isConnected;
        } catch(Exception e){
            System.out.println(e.toString());
        }
        return result;
    }

    @Override
    public HtmlPage getCurrentPage()
    {
        HtmlPage pageObject = null;
        if(isConnected && currentPage!= null)
        {

        }
        return pageObject;
    }

    @Override
    public HtmlPage clickLink(String link) {

        Boolean result = isConnected;
        try {
            currentPage = webClient.getPage(link);
            isConnected = true;
        } catch(Exception e){
            System.out.println(e.toString());
        }
        return currentPage;
    }

    @Override
    public void editForm(HtmlForm form, String text) {

    }

    @Override
    public void clickButton(HtmlButton button) {

    }

    private void setWebClientOptions(WebClient webClient)
    {
        webClient.setAjaxController(new NicelyResynchronizingAjaxController());
        webClient.getOptions().setUseInsecureSSL(true);
        webClient.getOptions().setThrowExceptionOnFailingStatusCode(false);
        webClient.getOptions().setThrowExceptionOnScriptError(false);
        webClient.waitForBackgroundJavaScript(50000);
        webClient.waitForBackgroundJavaScriptStartingBefore(10000);
    }

    public WebClient getWebClient() {
        return webClient;
    }

    public void setWebClient(WebClient webClient) {
        this.webClient = webClient;
    }

    public Credential getCredential() {
        return credential;
    }

    public void setCredential(Credential credential) {
        this.credential = credential;
    }

    public DatingSite getDatingSite() {
        return datingSite;
    }

    public void setDatingSite(DatingSite datingSite) {
        this.datingSite = datingSite;
    }

    public Boolean getIsConnected() {
        return isConnected;
    }

    public void setIsConnected(Boolean isConnected) {
        this.isConnected = isConnected;
    }

    public void setCurrentPage(HtmlPage currentPage) {
        this.currentPage = currentPage;
    }
}
