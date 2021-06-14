package Handson3_1_DesignPrinciples.Model;

import Handson3_1_DesignPrinciples.AbstractClassImp_ItemInterface.Burger;

public class VegBurger extends Burger {
    @Override
    public String name() {
        return "Veg Burger";
    }

    @Override
    public float price() {
        return 25.0f;
    }
}
