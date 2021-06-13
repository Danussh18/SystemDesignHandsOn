package Handson2_2_DesignPrinciples.Factory;

import Handson2_2_DesignPrinciples.AbstractClasses.Headlight;
import Handson2_2_DesignPrinciples.AbstractClasses.Tire;
import Handson2_2_DesignPrinciples.Service.*;

import java.util.logging.Logger;

public class AudiFactory extends Factory {
    private static final Logger logger = Logger.getLogger(AudiFactory.class.getName());

    public AudiFactory(){
        logger.info("----Audi Object is Created------");
    }


    @Override
    public Headlight makeHeadLight() {
        return new AudiHeadlight();
    }

    @Override
    public Tire makeTire() {
        return new AudiTire();
    }
}
