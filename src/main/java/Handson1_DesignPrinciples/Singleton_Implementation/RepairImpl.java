package Handson1_DesignPrinciples.Singleton_Implementation;

import Handson1_DesignPrinciples.Singleton_Principle.Repair;

public class RepairImpl implements Repair {
    @Override
    public void ProcessPhoneRepair(String modelName) {
        System.out.println("Repairing Accepted "+modelName);
    }

    @Override
    public void ProcessAccessoryRepair(String accessoryType) {
        System.out.println("repair Accepted! "+accessoryType);
    }
}
