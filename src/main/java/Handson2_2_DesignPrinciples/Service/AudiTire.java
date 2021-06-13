package Handson2_2_DesignPrinciples.Service;

import Handson2_2_DesignPrinciples.AbstractClasses.Tire;

import java.util.logging.Logger;

public class AudiTire extends Tire {
    private static final Logger logger = Logger.getLogger(AudiTire.class.getName());

    public AudiTire(){
        logger.info("-------Audi Tire is Fixed--------");
    }
}
