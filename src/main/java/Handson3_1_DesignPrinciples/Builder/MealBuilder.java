package Handson3_1_DesignPrinciples.Builder;

import Handson3_1_DesignPrinciples.Model.*;

public class MealBuilder {
    private Meal meal = new Meal();

    public Meal prepareMeal(int item, int quantity){
        switch (item){
            case 1:
                for(int i=0;i<quantity;i++)
                    meal.addItem(new VegBurger());
                break;
            case  2 :
                for (int i=0;i<quantity;i++)
                    meal.addItem(new ChickenBurger());
                break;
            case 3:
                for(int i=0;i<quantity;i++)
                    meal.addItem(new Coke());
                    break;
            case 4:
                for (int i=0;i<quantity;i++)
                    meal.addItem(new Pepsi());
                    break;
        }
        return meal;
    }
}
