package Handson2_2_DesignPrinciples.Service;

import Handson2_2_DesignPrinciples.AbstractClasses.Headlight;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class AudiHeadlight extends Headlight {
    private static final Logger logger = LoggerFactory.getLogger(AudiHeadlight.class.getName());

    public AudiHeadlight(){
        logger.info("-------Audi HeadLight is Fixed--------");
    }
}
