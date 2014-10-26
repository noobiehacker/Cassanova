package page;

import model.Message;

import java.util.List;

/**
 * Created by david on 10/24/2014.
 */
public abstract class InboxPage extends WebPage {

    private boolean hasNewMessage;
    private List<Message> messageList;

    public boolean isHasNewMessage() {
        return hasNewMessage;
    }

    public void setHasNewMessage(boolean hasNewMessage) {
        this.hasNewMessage = hasNewMessage;
    }

    public List<Message> getMessageList() {
        return messageList;
    }

    public void setMessageList(List<Message> messageList) {
        this.messageList = messageList;
    }
}
