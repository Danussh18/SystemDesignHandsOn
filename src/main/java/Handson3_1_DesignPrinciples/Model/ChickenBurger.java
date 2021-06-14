package Handson3_1_DesignPrinciples.Model;

import Handson3_1_DesignPrinciples.AbstractClassImp_ItemInterface.Burger;

public class ChickenBurger extends Burger {
    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public float price() {
        return 35.0f;
    }
}
