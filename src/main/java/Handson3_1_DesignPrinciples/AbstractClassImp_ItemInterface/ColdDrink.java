package Handson3_1_DesignPrinciples.AbstractClassImp_ItemInterface;

import Handson3_1_DesignPrinciples.ConcretePacking.Bottle;
import Handson3_1_DesignPrinciples.PackingInterfaces.Item;
import Handson3_1_DesignPrinciples.PackingInterfaces.Packing;

public abstract class ColdDrink implements Item {
    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
