package model;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

/**
 * Created by david on 10/28/2014.
 */
@Entity
public class ScriptMessage {

    public ScriptMessage(){
    }

    @Id
    private ObjectId id;

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    private String scriptMessage;

    public String getScriptMessage() {
        return scriptMessage;
    }

    public void setScriptMessage(String scriptMessage) {
        this.scriptMessage = scriptMessage;
    }
}
