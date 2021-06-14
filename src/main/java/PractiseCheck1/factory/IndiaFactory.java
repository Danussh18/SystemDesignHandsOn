package PractiseCheck1.factory;


import PractiseCheck1.model.LuxuryCar;
import PractiseCheck1.model.MicroCar;
import PractiseCheck1.model.MiniCar;
import PractiseCheck1.repository.Car;
import PractiseCheck1.repository.CarType;
import PractiseCheck1.repository.Location;

public class IndiaFactory {

	public Car buildCar(CarType carType) {

		if (carType.equals(CarType.LUXURY))
			return new LuxuryCar(Location.INDIA);
		else if (carType.equals(CarType.MICRO))
			return new MicroCar(Location.INDIA);
		else if (carType.equals(CarType.MINI))
			return new MiniCar(Location.INDIA);

		return null;
	}
}
