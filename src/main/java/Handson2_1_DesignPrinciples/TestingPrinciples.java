package Handson2_1_DesignPrinciples;

import Handson2_1_DesignPrinciples.InterfaceImpl.AddElement;
import Handson2_1_DesignPrinciples.InterfaceImpl.UpdateElement;

import java.util.logging.Logger;

public class TestingPrinciples {
    private static final Logger logger = Logger.getLogger(TestingPrinciples.class.getName());

    public static void main(String[] args){
        logger.info("------Started Main---------");
        AddElement addElementObj = new AddElement();
        addElementObj.addElement();

        UpdateElement updateElementObj = new UpdateElement();
        updateElementObj.updateElement();
        logger.info("---------Exiting Main---------");
    }
}
