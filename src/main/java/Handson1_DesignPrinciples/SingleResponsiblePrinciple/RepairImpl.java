package Handson1_DesignPrinciples.SingleResponsiblePrinciple;

import Handson1_DesignPrinciples.InterfaceSegregation.IAccessoryRepair;
import Handson1_DesignPrinciples.InterfaceSegregation.IPhoneRepair;

import java.util.logging.Logger;

public class RepairImpl implements IPhoneRepair, IAccessoryRepair {

    Logger logger = Logger.getLogger(RepairImpl.class.getName());

    @Override
    public void ProcessPhoneRepair(String modelName) {
//        System.out.println("Repairing Accepted "+modelName);
        logger.info("Repair Accepted! "+modelName);
    }

    @Override
    public void ProcessAccessoryRepair(String accessoryType) {
//        System.out.println("repair Accepted! "+accessoryType);
        logger.info("Repair Accepted! "+accessoryType);
    }
}
