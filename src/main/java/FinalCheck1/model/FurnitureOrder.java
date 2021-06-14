package FinalCheck1.model;

import FinalCheck1.repository.Order;

import java.util.logging.Logger;

public class FurnitureOrder extends Order {

	private static final Logger LOGGER = Logger.getLogger(FurnitureOrder.class.getName());

	@Override
	public void processOrder() {
		LOGGER.info("Your Furnitures order is placed!");
	}
}
