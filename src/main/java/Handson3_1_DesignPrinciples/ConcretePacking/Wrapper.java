package Handson3_1_DesignPrinciples.ConcretePacking;

import Handson3_1_DesignPrinciples.PackingInterfaces.Packing;

public class Wrapper implements Packing {
    @Override
    public String pack() {
        return "Wrapper";
    }
}
