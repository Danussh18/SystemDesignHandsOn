package FinalCheck1.factory;


import FinalCheck1.model.ElectronicOrder;
import FinalCheck1.model.FurnitureOrder;
import FinalCheck1.model.ToyOrder;
import FinalCheck1.repository.Order;

public class ECommerce {

	public Order getOrder(String orderType) {

		if (orderType.equals("1"))
			return new ElectronicOrder();
		else if (orderType.equals("2"))
			return new ToyOrder();
		else if (orderType.equalsIgnoreCase("3"))
			return new FurnitureOrder();

		return null;
	}
}
