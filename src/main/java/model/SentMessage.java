package model;

/**
 * Created by david on 10/24/2014.
 */
public class SentMessage extends Message {

    private boolean recievedReply;

    public boolean isRecievedReply() {
        return recievedReply;
    }

    public void setRecievedReply(boolean recievedReply) {
        this.recievedReply = recievedReply;
    }

}
