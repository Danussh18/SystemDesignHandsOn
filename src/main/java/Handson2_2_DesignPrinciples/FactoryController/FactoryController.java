package Handson2_2_DesignPrinciples.FactoryController;

import Handson2_2_DesignPrinciples.AbstractClasses.Factory;
import Handson2_2_DesignPrinciples.Factory.AudiFactory;
import Handson2_2_DesignPrinciples.Factory.MercedesFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class FactoryController {

    private static final Logger logger =LoggerFactory.getLogger(FactoryController.class.getName());
    public Factory getFactory(String factory){
        if (factory == null || factory.isEmpty())
            logger.warn("Factory is not Selected");
        else if (factory.equalsIgnoreCase("Mercedes"))
            return new MercedesFactory();
        else if (factory.equalsIgnoreCase("Audi"))
            return new AudiFactory();
        else
            logger.warn("Invalid Input");
        return null;
    }
}
