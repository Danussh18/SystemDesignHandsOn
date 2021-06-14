package PractiseCheck1.factory;


import PractiseCheck1.repository.Car;
import PractiseCheck1.repository.CarType;
import PractiseCheck1.repository.Location;

public class CarFactory {

	public static Car buildCar(CarType carType, Location location) {

		if (location.equals(Location.DEFAULT))
			return new DefaultFactory().buildCar(carType);
		else if (location.equals(Location.USA))
			return new USAFactory().buildCar(carType);
		else if (location.equals(Location.INDIA))
			return new IndiaFactory().buildCar(carType);
		return null;
	}
}
