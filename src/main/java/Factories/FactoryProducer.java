package Factories;


import enumurator.FactoryEnum;

/**
 * Created by david on 10/23/2014.
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(FactoryEnum factory) {
        switch (factory) {
            case OkcupidFactory:
                return new OkcupidPageFactory();
            default:
                return null;
        }
    }
}
