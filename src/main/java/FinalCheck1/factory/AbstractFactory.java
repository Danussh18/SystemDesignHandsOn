package FinalCheck1.factory;

import FinalCheck1.repository.Order;

public class AbstractFactory {

	public static Order getOrder(String productType, String channel) {

		if (channel.equals("1"))
			return new ECommerce().getOrder(productType);
		else if (channel.equals("2"))
			return new TeleCallerAgents().getOrder(productType);

		return null;
	}
}
