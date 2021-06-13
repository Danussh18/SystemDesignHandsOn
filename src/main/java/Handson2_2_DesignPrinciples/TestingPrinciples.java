package Handson2_2_DesignPrinciples;

import Handson2_2_DesignPrinciples.Factory.Factory;
import Handson2_2_DesignPrinciples.FactoryController.FactoryController;

import java.util.Locale;
import java.util.Scanner;
import java.util.logging.Logger;

public class TestingPrinciples {
    private static final Logger logger = Logger.getLogger(TestingPrinciples.class.getName());

    public static void main(String[] args){
        logger.info("------Started Main---------");
        Scanner scanner = new Scanner(System.in);
        logger.info("Audi or Mercedes?");
        String car = scanner.nextLine().toLowerCase(Locale.ROOT);

        FactoryController factoryController = new FactoryController();

        Factory factory = factoryController.getFactory(car);

        factory.makeHeadLight();
        factory.makeTire();
        logger.info("your CAR Brand is Ready "+car);
        logger.info("---------Exiting Main---------");

    }
}
