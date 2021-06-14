package Handson3_1_DesignPrinciples.ConcretePacking;

import Handson3_1_DesignPrinciples.PackingInterfaces.Packing;

public class Bottle implements Packing {
    @Override
    public String pack() {
        return "Bottle";
    }
}
