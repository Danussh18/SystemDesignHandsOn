package Handson2_1_DesignPrinciples.InterfaceImpl;

import Handson2_1_DesignPrinciples.Interfaces.IUpdateElement;
import Handson2_1_DesignPrinciples.SingletonClass.DBConn;

import java.util.logging.Logger;

public class UpdateElement implements IUpdateElement {

    private static final Logger logger = Logger.getLogger(UpdateElement.class.getName());

    DBConn instance = DBConn.getInstance();

    @Override
    public void updateElement() {
        logger.info("------Element Updated-------");
        logger.info("Instance Hashcode is"+instance.hashCode());
        logger.info("--------ended UpdateElement Method--------");
    }
}
