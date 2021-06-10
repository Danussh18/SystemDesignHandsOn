package Handson1_DesignPrinciples.Singleton_Implementation;

import Handson1_DesignPrinciples.Singleton_Principle.Order;

public class PhoneOrderImpl implements Order {
    @Override
    public void ProcessOrder(String modelName) {
        System.out.println("Order Accepted "+modelName);
    }
}
