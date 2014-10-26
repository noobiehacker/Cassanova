package controller;


import model.Rose;
import page.InboxPage;
import page.ListingPage;
import page.LoginPage;
import page.UserPage;

/**
 * Created by david on 10/24/2014.
 */
public class Cassanova implements Player{

    private int rosePickedInThisSession;
    private int messagesReplied;

    @Override
    public boolean login() {
        return false;
    }

    @Override
    public UserPage getUserPage(Rose rose) {
        return null;
    }

    @Override
    public InboxPage getInboxPage() {
        return null;
    }

    @Override
    public LoginPage getLoginPage() {
        return null;
    }

    @Override
    public ListingPage getNextListingPage() {
        return null;
    }

    public int getRosePickedInThisSession() {
        return rosePickedInThisSession;
    }

    public void setRosePickedInThisSession(int rosePickedInThisSession) {
        this.rosePickedInThisSession = rosePickedInThisSession;
    }

    public int getMessagesReplied() {
        return messagesReplied;
    }

    public void setMessagesReplied(int messagesReplied) {
        this.messagesReplied = messagesReplied;
    }
}
