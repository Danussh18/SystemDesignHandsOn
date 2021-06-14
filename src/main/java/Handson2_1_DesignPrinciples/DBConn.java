package Handson2_1_DesignPrinciples;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class DBConn {

    private static Logger logger = LoggerFactory.getLogger(DBConn.class);

    private DBConn(){
        logger.info("--------Instance Created----------");
    }

    private static DBConn instance = null;

    public static DBConn getInstance(){
        if(instance == null)
            instance = new DBConn();
        return instance;
    }

}
