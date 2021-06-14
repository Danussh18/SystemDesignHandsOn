package PractiseCheck1.model;

import PractiseCheck1.repository.Car;
import PractiseCheck1.repository.CarType;
import PractiseCheck1.repository.Location;

import java.util.logging.Logger;

public class MicroCar extends Car {

	private static final Logger LOGGER = Logger.getLogger(MicroCar.class.getName());

	public MicroCar(Location location) {
		super(CarType.MICRO, location);
		construct();
	}

	@Override
	public void construct() {
		LOGGER.info("***PURCHASED MICRO CAR***");
	}
}
