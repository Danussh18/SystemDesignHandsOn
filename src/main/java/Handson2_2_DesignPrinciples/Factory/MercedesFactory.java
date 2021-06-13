package Handson2_2_DesignPrinciples.Factory;

import Handson2_2_DesignPrinciples.AbstractClasses.Headlight;
import Handson2_2_DesignPrinciples.AbstractClasses.Tire;
import Handson2_2_DesignPrinciples.Factory.AudiFactory;
import Handson2_2_DesignPrinciples.Factory.Factory;
import Handson2_2_DesignPrinciples.Service.MercedesHeadlight;
import Handson2_2_DesignPrinciples.Service.MercedesTire;

import java.util.logging.Logger;

public class MercedesFactory extends Factory {
    private static final Logger logger = Logger.getLogger(AudiFactory.class.getName());

    public MercedesFactory(){
        logger.info("----Mercedes Object is Created------");
    }

    @Override
    public Headlight makeHeadLight() {
        return new MercedesHeadlight();
    }

    @Override
    public Tire makeTire() {
        return new MercedesTire();
    }
}
