package Handson2_2_DesignPrinciples;

import Handson2_2_DesignPrinciples.AbstractClasses.Factory;
import Handson2_2_DesignPrinciples.FactoryController.FactoryController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Locale;
import java.util.Scanner;

public class Client {
    private static final Logger logger = LoggerFactory.getLogger(Client.class);

    public static void main(String[] args){
        logger.info("------Started Main---------");
        Scanner scanner = new Scanner(System.in);
        logger.info("Audi or Mercedes?");
        String car = scanner.nextLine().toLowerCase(Locale.ROOT);

        FactoryController factoryController = new FactoryController();

        try {
            Factory factory = factoryController.getFactory(car);

            factory.makeHeadLight();
            factory.makeTire();
            logger.info("your CAR Brand is "+car);
        } catch (Exception e) {
            logger.info("we only manufacture Audi or Mercedes");
            e.printStackTrace();
        }
        finally {
            logger.info("---------Exiting Main---------");
        }
    }
}