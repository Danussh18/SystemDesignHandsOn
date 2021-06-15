package Handson2_2_DesignPrinciples.Factory;

import Handson2_2_DesignPrinciples.AbstractClasses.Factory;
import Handson2_2_DesignPrinciples.AbstractClasses.Headlight;
import Handson2_2_DesignPrinciples.AbstractClasses.Tire;
import Handson2_2_DesignPrinciples.Service.AudiHeadlight;
import Handson2_2_DesignPrinciples.Service.AudiTire;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class AudiFactory extends Factory {

    private static final Logger logger = LoggerFactory.getLogger(AudiFactory.class.getName());

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
