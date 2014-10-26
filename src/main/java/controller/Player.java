package controller;


import model.Rose;
import page.InboxPage;
import page.ListingPage;
import page.LoginPage;
import page.UserPage;

/**
 * Created by david on 10/24/2014.
 */
public interface Player {

    boolean login();
    UserPage getUserPage(Rose rose);
    InboxPage getInboxPage();
    LoginPage getLoginPage();
    ListingPage getNextListingPage();
}
