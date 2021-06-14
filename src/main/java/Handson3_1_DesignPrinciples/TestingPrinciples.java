package Handson3_1_DesignPrinciples;

import Handson3_1_DesignPrinciples.Builder.MealBuilder;
import Handson3_1_DesignPrinciples.Model.Meal;

import java.util.Scanner;
import java.util.logging.Logger;

public class TestingPrinciples {
    private static final Logger logger = Logger.getLogger(TestingPrinciples.class.getName());
    public static void main(String[] args){
        logger.info("Welcome to the Restaurant");

        Scanner scanner = new Scanner(System.in);
        MealBuilder mealBuilder = new MealBuilder();
        Meal meal = null;

        boolean flag = true;
        boolean loop = true;

        while (loop == true){
            if (flag == true){
                logger.info("What would you like to have?" + "\n1. VegBurger(Rs. 25)" + "\n2. ChickenBurger(Rs. 35)"
                        + "\n3. Coke(Rs. 30)" + "\n4. Pepsi(Rs. 30)" + "\nPress any other key if not required!");
                flag = false;
            }
            else
                logger.info("Anything else?" + "\nPress any other key if not required!");

            char choice = scanner.next().charAt(0);

            int quantity;

            switch (choice){
                case '1':
                    logger.info("Quantity : ");
                    quantity = scanner.nextInt();
                    meal = mealBuilder.prepareMeal(1,quantity);
                    break;
                case '2':
                    logger.info("Quantity : ");
                    quantity = scanner.nextInt();
                    meal = mealBuilder.prepareMeal(2,quantity);
                    break;
                case '3':
                    logger.info("Quantity : ");
                    quantity = scanner.nextInt();
                    meal = mealBuilder.prepareMeal(3,quantity);
                    break;
                case '4':
                    logger.info("Quantity : ");
                    quantity = scanner.nextInt();
                    meal = mealBuilder.prepareMeal(4,quantity);
                    break;
                default:
                    logger.info("Thanks for ordering");
                    loop = false;
                    break;
            }
            logger.info("Order Details :");
            meal.showItems();
            logger.info("Total cost : "+ meal.getCost());
            logger.info("Thank You ||| Visit Again");
        }
    }
}
