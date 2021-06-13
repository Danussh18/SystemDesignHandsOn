package Handson1_DesignPrinciples.SingleResponsiblePrinciple;

import Handson1_DesignPrinciples.InterfaceSegregation.Order;

import java.util.logging.Logger;

public class PhoneOrderImpl implements Order {

    Logger logger = Logger.getLogger(PhoneOrderImpl.class.getName());

    @Override
    public void ProcessOrder(String modelName) {
        System.out.println("Order Accepted "+modelName);
        logger.info("Order Accepted! "+modelName);
    }
}
