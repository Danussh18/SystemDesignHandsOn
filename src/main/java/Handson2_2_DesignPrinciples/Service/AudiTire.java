package Handson2_2_DesignPrinciples.Service;

import Handson2_2_DesignPrinciples.AbstractClasses.Tire;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class AudiTire extends Tire {
    private static final Logger logger = LoggerFactory.getLogger(AudiTire.class.getName());

    public AudiTire(){
        logger.info("-------Audi Tire is Fixed to the car--------");
    }
}
