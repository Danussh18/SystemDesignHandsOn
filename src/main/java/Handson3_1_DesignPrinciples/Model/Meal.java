package Handson3_1_DesignPrinciples.Model;

import Handson3_1_DesignPrinciples.PackingInterfaces.Item;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class Meal extends Pepsi {
    private static final Logger logger = Logger.getLogger(Meal.class.getName());

    private List<Item> items = new ArrayList<>();

    public void addItem(Item item){
        items.add(item);
    }

    public float getCost(){
        float cost = 0.0f;
        for(Item item : items)
            cost = cost + item.price();
        return cost;
    }

    public void showItems(){
        for(Item item : items)
            logger.info("Item : " + item.name() + ", Price : "+ item.price() + ", Pacing :"+item.packing());
    }
}
