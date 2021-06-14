package PractiseCheck2.observer;

import PractiseCheck2.repository.INotificationObserver;

import java.util.logging.Logger;

public class JohnObserver implements INotificationObserver {

	private static final Logger LOGGER = Logger.getLogger(JohnObserver.class.getName());

	private String name = "John";

	@Override
	public void onServerDown() {
		LOGGER.info("Notification has been received by " + name + "!");
	}

	@Override
	public String toString() {
		return "JohnObserver [name=" + name + "]";
	}
}
