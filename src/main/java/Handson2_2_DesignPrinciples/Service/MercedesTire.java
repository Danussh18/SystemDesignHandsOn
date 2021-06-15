package Handson2_2_DesignPrinciples.Service;

import Handson2_2_DesignPrinciples.AbstractClasses.Tire;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MercedesTire extends Tire {
    private static final Logger logger = LoggerFactory.getLogger(MercedesTire.class);

    public MercedesTire(){
        logger.info("-------Mercedes Tire is Fixed to the car--------");
    }
}
