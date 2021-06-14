package PractiseCheck1.model;


import PractiseCheck1.repository.Car;
import PractiseCheck1.repository.CarType;
import PractiseCheck1.repository.Location;

import java.util.logging.Logger;

public class LuxuryCar extends Car {

	private static final Logger LOGGER = Logger.getLogger(LuxuryCar.class.getName());

	public LuxuryCar(Location location) {
		super(CarType.LUXURY, location);
		construct();
	}

	@Override
	public void construct() {
		LOGGER.info("***PURCHASED LUXURY CAR***");
	}
}
