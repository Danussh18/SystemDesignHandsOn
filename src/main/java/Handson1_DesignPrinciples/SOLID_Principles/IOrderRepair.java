package Handson1_DesignPrinciples.SOLID_Principles;

public interface IOrderRepair {
    void ProcessOrder(String modelName);
    void ProcessPhoneRepair(String modelName);
    void ProcessAccessoryRepair(String accessoryType);
}
