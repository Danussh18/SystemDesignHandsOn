package PractiseCheck2.observer;

import PractiseCheck2.repository.INotificationObserver;

import java.util.logging.Logger;

public class SteveObserver implements INotificationObserver {

	private static final Logger LOGGER = Logger.getLogger(SteveObserver.class.getName());

	private String name = "Steve";

	@Override
	public void onServerDown() {
		LOGGER.info("Notification has been received by " + name + "!");
	}

	@Override
	public String toString() {
		return "SteveObserver [name=" + name + "]";
	}
}
