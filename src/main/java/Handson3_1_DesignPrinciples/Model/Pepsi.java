package Handson3_1_DesignPrinciples.Model;

import Handson3_1_DesignPrinciples.AbstractClassImp_ItemInterface.ColdDrink;

public class Pepsi extends ColdDrink {
    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 30.0f;
    }
}
