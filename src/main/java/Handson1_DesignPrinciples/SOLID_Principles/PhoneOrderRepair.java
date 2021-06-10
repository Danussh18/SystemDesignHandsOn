package Handson1_DesignPrinciples.SOLID_Principles;

import Handson1_DesignPrinciples.SOLID_Principles.IOrderRepair;

public class PhoneOrderRepair implements IOrderRepair {
    @Override
    public void ProcessOrder(String modelName) {
        System.out.println("Order Accepted "+modelName);
    }

    @Override
    public void ProcessPhoneRepair(String modelName) {
        System.out.println("Repairing Accepted "+modelName);
    }

    @Override
    public void ProcessAccessoryRepair(String accessoryType) {
        System.out.println("repair Accepted! "+accessoryType);
    }
}
