package PractiseCheck1.model;

import PractiseCheck1.repository.Car;
import PractiseCheck1.repository.CarType;
import PractiseCheck1.repository.Location;

import java.util.logging.Logger;

public class MiniCar extends Car {

	private static final Logger LOGGER = Logger.getLogger(MiniCar.class.getName());

	public MiniCar(Location location) {
		super(CarType.MINI, location);
		construct();
	}

	@Override
	public void construct() {
		LOGGER.info("***PURCHASED MINI CAR***");
	}
}
