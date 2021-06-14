package Handson3_1_DesignPrinciples.AbstractClassImp_ItemInterface;

import Handson3_1_DesignPrinciples.PackingInterfaces.Item;
import Handson3_1_DesignPrinciples.PackingInterfaces.Packing;
import Handson3_1_DesignPrinciples.ConcretePacking.Wrapper;

public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price() ;
}
