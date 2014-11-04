package cassanovaSystem;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by david on 10/27/2014.
 */
public class ErrorHandlingManager {

    private Exception e;

    public ErrorHandlingManager(Exception e){
        this.e =e ;
    }

    public void logException(){
        if(e==null){
            System.out.println("Exception has not been set");
        }else{
            Logger logger = Logger.getLogger(ErrorHandlingManager.class.getName());
            logger.log( Level.SEVERE, e.toString(), e );
        }
    }

}
