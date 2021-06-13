package Handson2_1_DesignPrinciples.SingletonClass;

import java.util.logging.Logger;

public class DBConn {

    Logger logger = Logger.getLogger(DBConn.class.getName());

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
