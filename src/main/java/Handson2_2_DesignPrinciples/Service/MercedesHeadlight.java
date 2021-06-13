package Handson2_2_DesignPrinciples.Service;

import Handson2_2_DesignPrinciples.AbstractClasses.Headlight;

import java.util.logging.Logger;

public class MercedesHeadlight extends Headlight {
    private static final Logger logger = Logger.getLogger(MercedesHeadlight.class.getName());

    public MercedesHeadlight(){
        logger.info("-------Mercedes HeadLight is Fixed--------");
    }
}
