package Handson2_1_DesignPrinciples.InterfaceImpl;

import Handson2_1_DesignPrinciples.Interfaces.IAddElement;
import Handson2_1_DesignPrinciples.SingletonClass.DBConn;

import java.util.logging.Logger;

public class AddElement implements IAddElement {

    private static Logger logger = Logger.getLogger(AddElement.class.getName());

    DBConn instance = DBConn.getInstance();

    @Override
    public void addElement() {
        logger.info("------Element Added-------");
        logger.info("hashcode of created object is "+instance.hashCode());
        logger.info("-----------addElement Ended-----------");
    }
}
