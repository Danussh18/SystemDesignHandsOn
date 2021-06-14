package Handson2_2_DesignPrinciples.Service;

import Handson2_2_DesignPrinciples.AbstractClasses.Headlight;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class MercedesHeadlight extends Headlight {
    private static final Logger logger = LoggerFactory.getLogger(MercedesHeadlight.class.getName());

    public MercedesHeadlight(){
        logger.info("-------Mercedes HeadLight is Fixed--------");
    }
}
