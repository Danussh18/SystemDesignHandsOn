package Handson2_2_DesignPrinciples.Factory;

import Handson2_2_DesignPrinciples.AbstractClasses.Headlight;
import Handson2_2_DesignPrinciples.AbstractClasses.Tire;
import Handson2_2_DesignPrinciples.AbstractClasses.Factory;
import Handson2_2_DesignPrinciples.Service.MercedesHeadlight;
import Handson2_2_DesignPrinciples.Service.MercedesTire;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class MercedesFactory extends Factory {
    private static final Logger logger = LoggerFactory.getLogger(AudiFactory.class.getName());

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
