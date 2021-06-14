package Handson3_1_DesignPrinciples.Model;

import Handson3_1_DesignPrinciples.AbstractClassImp_ItemInterface.ColdDrink;

public class Coke extends ColdDrink {
    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 30.0f;
    }
}
