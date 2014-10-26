package unitTest

import connection.WebAdapter
import model.Credential

/**
 * Created by david on 9/15/2014.
 */
class OKCupidWebAdapterTest extends GroovyTestCase {

    private WebAdapter adapter;

    void setUp() {
        super.setUp();
        Credential credential = new Credential();
        credential.setDomain("https://www.okcupid.com");
        credential.setUserName("Xiva1013");
        credential.setPassword("computer1013");
        this.adapter = new WebAdapter(credential);
    }

    void tearDown() {

    }
    void testDisconnect() {
        assertTrue(true);
    }
    void testConnect() {
        assertTrue(this.adapter.connect());
    }

    void testLogin() {
        assertTrue(true);
    }

    void testLogout() {
        assertTrue(true);
    }

    void testCrawlAndSend() {
        assertTrue(true);
    }

    void testReplyInbox() {
        assertTrue(true);
    }
}
