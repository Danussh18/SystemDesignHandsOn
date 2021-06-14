package FinalCheck1.main;

import FinalCheck1.factory.AbstractFactory;
import FinalCheck1.repository.Order;

import java.util.Scanner;
import java.util.logging.Logger;

public class Main {

	private static final Logger LOGGER = Logger.getLogger(Main.class.getName());

	public static void main(String[] args) {

		LOGGER.info("-----WELCOME TO AD STORES-----");

		Scanner sc = new Scanner(System.in);
		LOGGER.info("What would you like to purchase?\n1. Electronics\n2. Toys\n3. Furnitures");
		String productType = sc.nextLine();
		LOGGER.info("Please enter your preferred channel of ordering:\n1. E-Commerce\n2. Tele Caller Agents");
		String channel = sc.nextLine();

		Order order = AbstractFactory.getOrder(productType, channel);
		order.processOrder();

		LOGGER.info("-----THANK YOU | VISIT AGAIN-----");
	}
}
