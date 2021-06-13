package Handson2_2_DesignPrinciples.Service;

import Handson2_2_DesignPrinciples.AbstractClasses.Tire;

import java.util.logging.Logger;

public class MercedesTire extends Tire {
    private static final Logger logger = Logger.getLogger(MercedesTire.class.getName());

    public MercedesTire(){
        logger.info("-------Mercedes Tire is Fixed--------");
    }
}