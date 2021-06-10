package Handson1_DesignPrinciples.SOLID_Principles;

import Handson1_DesignPrinciples.SOLID_Principles.PhoneOrderRepair;

import java.util.Scanner;

public class TestingPrinciples {
    public static void main(String[] args){
        System.out.println("Welcome to our site. Would you like to order or repair?");
        Scanner scanner = new Scanner(System.in);
        String processOption = scanner.next();

        PhoneOrderRepair phoneOrderRepair = new PhoneOrderRepair();
        String productDetails = null;

        switch (processOption){
            case "order":
            {
                System.out.println("Please provide the Phone Model Name");
                productDetails = scanner.next();
                phoneOrderRepair.ProcessOrder(productDetails);
                break;
            }
            case "repair":
            {
                System.out.println("Is it the phone or the accessory that you want to be repaired?");
                String productType = scanner.next();
                if (productType.equalsIgnoreCase("phone")){
                    System.out.println("Please provide the phone model name");
                    productDetails = scanner.next();
                    phoneOrderRepair.ProcessPhoneRepair(productDetails);
                }
                else {
                    System.out.println("Please provide the accessory detail, like headphone, tempered glass");
                    productDetails = scanner.next();
                    phoneOrderRepair.ProcessAccessoryRepair(productDetails);
                }
                break;
            }
            default :
                    System.out.println("Default is Executed");
                    break;
        }
    }
}
