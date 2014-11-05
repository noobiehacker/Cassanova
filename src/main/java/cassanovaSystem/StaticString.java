package cassanovaSystem;

import java.io.InputStream;
import java.util.Properties;

/**
 * Created by david on 10/27/2014.
 */
public class StaticString {

    private static StaticString singleton_staticString;
    private Properties properties;

    public static String getString(String key){
        String result;
        try{
            result = StaticString.getSingleTon_staticString().getProperties().getProperty(key);
        }
        catch(Exception e){
            result =  "No Key Found";
        }
        return result;
    }

    private static StaticString getSingleTon_staticString() {
        if(StaticString.singleton_staticString==null)
            StaticString.singleton_staticString = new StaticString();
        return StaticString.singleton_staticString;
    }

    private Properties getProperties() {
        if(properties==null)
            initializeProperties();
        return properties;
    }

    private void initializeProperties(){
        try{
            properties = new Properties();
            InputStream in = this.getClass().getResourceAsStream("String.properties");
            properties.load(in);
        }
        catch(Exception e)
        {

        }
    }
}
