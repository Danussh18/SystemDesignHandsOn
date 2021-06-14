package PractiseCheck2;

import PractiseCheck2.observer.JohnObserver;
import PractiseCheck2.observer.SteveObserver;
import PractiseCheck2.repository.INotificationObserver;
import PractiseCheck2.repository.INotificationService;
import PractiseCheck2.subject.NotificationService;

import java.util.logging.Logger;

public class Main {

	private static final Logger LOGGER = Logger.getLogger(Main.class.getName());

	public static void main(String[] args) {

		LOGGER.info("-----STARTING E-SHOP NOTIFIER-----");

		INotificationObserver steve = new SteveObserver();
		INotificationObserver john = new JohnObserver();

		INotificationService service = new NotificationService();

		service.addSubscriber(steve);

		service.addSubscriber(john);

		service.notifySubscriber();

		service.removeSubscriber(john);

		service.notifySubscriber();

		LOGGER.info("-----EXITING E-SHOP NOTIFIER-----");
	}
}