package FinalCheck1.model;

import FinalCheck1.repository.Order;

import java.util.logging.Logger;

public class ElectronicOrder extends Order {

	private static final Logger LOGGER = Logger.getLogger(ElectronicOrder.class.getName());

	@Override
	public void processOrder() {
		LOGGER.info("Your Electronics order is placed!");
	}
}
