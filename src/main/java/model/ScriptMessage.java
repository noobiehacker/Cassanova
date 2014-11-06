package model;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

/**
 * Created by david on 10/28/2014.
 */
@Entity
public class ScriptMessage {

    @Id
    private ObjectId id;
    private String scriptMessage;
}
