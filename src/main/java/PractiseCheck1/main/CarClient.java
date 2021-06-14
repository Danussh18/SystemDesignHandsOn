package PractiseCheck1.main;

import PractiseCheck1.factory.CarFactory;
import PractiseCheck1.repository.CarType;
import PractiseCheck1.repository.Location;

import java.util.Scanner;
import java.util.logging.Logger;

public class CarClient {

	private static final Logger LOGGER = Logger.getLogger(CarClient.class.getName());

	public static void main(String[] args) {

		LOGGER.info("-----WELCOME TO AD MOTORS-----");

		Scanner sc = new Scanner(System.in);
		LOGGER.info("Which type of car would you like to purchase?\nLUXURY\tMINI\tMICRO");
		String carType = sc.nextLine();
		LOGGER.info("Please enter your preferred location:\nINDIA\tUSA");
		String carLocation = sc.nextLine();

		CarType model = null;
		Location location = null;

		if (carType.equalsIgnoreCase("LUXURY"))
			model = CarType.LUXURY;
		else if (carType.equalsIgnoreCase("MINI"))
			model = CarType.MINI;
		else
			model = CarType.MICRO;

		if (carLocation.equalsIgnoreCase("INDIA"))
			location = Location.INDIA;
		else if (carLocation.equalsIgnoreCase("USA"))
			location = Location.USA;
		else
			location = Location.DEFAULT;

		LOGGER.info(CarFactory.buildCar(model, location).toString());

		LOGGER.info("-----THANK YOU | VISIT AGAIN-----");
	}
}
