package Handson2_1_DesignPrinciples;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestingPrinciples {
    private static final Logger logger = LoggerFactory.getLogger(TestingPrinciples.class);

    public static void main(String[] args){
        logger.info("------Started Main---------");
        DBConn dbConn = DBConn.getInstance();

        DBConn dbConn1 = DBConn.getInstance();

        logger.info("HashCode of 1st Object is "+dbConn.hashCode());
        logger.info("HashCode of 1st Object is "+dbConn1.hashCode());

        if(dbConn == dbConn1)
            logger.info("Singleton Class");
        else
            logger.info("Not a Singleton Class");

        logger.info("---------Exiting Main---------");
    }
}
