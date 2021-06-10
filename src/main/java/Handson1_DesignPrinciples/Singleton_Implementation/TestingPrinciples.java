package Handson1_DesignPrinciples.Singleton_Implementation;

import Handson1_DesignPrinciples.Singleton_Implementation.PhoneOrderImpl;
import Handson1_DesignPrinciples.Singleton_Implementation.RepairImpl;

import java.util.Scanner;

public class TestingPrinciples {

    public static void main(String[] args){
        System.out.println("Welcome to our site. Would you like to order or repair?");
        Scanner scanner = new Scanner(System.in);
        String processOption = scanner.next();
        String productDetails;
        switch (processOption){
            case "order":
            {
                System.out.println("Please provide the Phone Model Name");
                PhoneOrderImpl phoneOrderImpl = new PhoneOrderImpl();
                productDetails = scanner.next();
                phoneOrderImpl.ProcessOrder(productDetails);
                break;
            }
            case "repair":
            {
                RepairImpl repairImpl = new RepairImpl();
                System.out.println("Is it the phone or the accessory that you want to be repaired?");
                String productType = scanner.next();
                if (productType.equalsIgnoreCase("phone")){
                    System.out.println("Please provide the phone model name");
                    productDetails = scanner.next();
                    repairImpl.ProcessPhoneRepair(productDetails);
                }
                else {
                    System.out.println("Please provide the accessory detail, like headphone, tempered glass");
                    productDetails = scanner.next();
                    repairImpl.ProcessAccessoryRepair(productDetails);
                }
                break;
            }
            default :
                System.out.println("Default is Executed");
                break;
        }
    }

}
