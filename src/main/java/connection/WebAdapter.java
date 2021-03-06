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

    public WebAdapter(Credential credential, DatingSite datingSite)
    {
        this.credential=credential;
        this.datingSite = datingSite;
        this.webClient = new WebClient(BrowserVersion.FIREFOX_24);
        initializeWebClientOptions();
    }

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
        return currentPage;
    }

    @Override
    public HtmlPage clickLink(String link) {

        Boolean result = isConnected;
        try {
            currentPage = webClient.getPage(link);
            String temp = currentPage.asText();
            String xml =currentPage.asXml();
            isConnected = true;
        } catch(Exception e){
            System.out.println(e.toString());
        }
        return currentPage;
    }

    @Override
    public void editForm(HtmlForm form, String text) {
        form.setTextContent(text);
    }

    @Override
    public HtmlPage clickButton(HtmlButton button) {

        HtmlPage page = null;

        try{
            page = button.click();
        }
        catch(Exception e){
        }

        return page;
    }

    private void initializeWebClientOptions()
    {
        if(getWebClient()!=null)
        {
            getWebClient().setAjaxController(new NicelyResynchronizingAjaxController());
            getWebClient().getOptions().setUseInsecureSSL(true);
            getWebClient().getOptions().setThrowExceptionOnFailingStatusCode(false);
            getWebClient().getOptions().setThrowExceptionOnScriptError(false);
            getWebClient().getOptions().setJavaScriptEnabled(true);
            getWebClient().getOptions().setCssEnabled(true);
            getWebClient().getCookieManager().setCookiesEnabled(true);
            getWebClient().waitForBackgroundJavaScript(50000);
            getWebClient().waitForBackgroundJavaScriptStartingBefore(10000);

        }
    }

    private WebClient getWebClient() {
        return webClient;
    }

    private void setWebClient(WebClient webClient) {
        this.webClient = webClient;
    }

    private Credential getCredential() {
        return credential;
    }

    private void setCredential(Credential credential) {
        this.credential = credential;
    }

    private DatingSite getDatingSite() {
        return datingSite;
    }

    private void setDatingSite(DatingSite datingSite) {
        this.datingSite = datingSite;
    }

    private Boolean getIsConnected() {
        return isConnected;
    }

    private void setIsConnected(Boolean isConnected) {
        this.isConnected = isConnected;
    }

    private void setCurrentPage(HtmlPage currentPage) {
        this.currentPage = currentPage;
    }
}
