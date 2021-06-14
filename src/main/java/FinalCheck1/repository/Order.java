package FinalCheck1.repository;

public abstract class Order {

	private Channel channel;
	private ProductType productType;

	public abstract void processOrder();
}
