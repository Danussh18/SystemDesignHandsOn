package Handson2_2_DesignPrinciples.AbstractClasses;

import Handson2_2_DesignPrinciples.AbstractClasses.Headlight;
import Handson2_2_DesignPrinciples.AbstractClasses.Tire;

public abstract class Factory {
    public abstract Headlight makeHeadLight();
    public abstract Tire makeTire();
}
