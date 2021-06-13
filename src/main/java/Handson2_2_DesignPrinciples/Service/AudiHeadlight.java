package Handson2_2_DesignPrinciples.Service;

import Handson2_2_DesignPrinciples.AbstractClasses.Headlight;

import java.util.logging.Logger;

public class AudiHeadlight extends Headlight {
    private static final Logger logger = Logger.getLogger(AudiHeadlight.class.getName());

    public AudiHeadlight(){
        logger.info("-------Audi HeadLight is Fixed--------");
    }
}
