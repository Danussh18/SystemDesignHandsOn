package FinalCheck1.model;

import FinalCheck1.repository.Order;

import java.util.logging.Logger;

public class ToyOrder extends Order {

	private static final Logger LOGGER = Logger.getLogger(ToyOrder.class.getName());

	@Override
	public void processOrder() {
		LOGGER.info("Your Toys order is placed!");
	}
}
