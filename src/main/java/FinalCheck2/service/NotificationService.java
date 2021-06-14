package FinalCheck2.service;

import FinalCheck2.observer.AdminTeam;
import FinalCheck2.repository.INotificationObserver;
import FinalCheck2.repository.INotificationService;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class NotificationService implements INotificationService {

	private static final Logger LOGGER = Logger.getLogger(AdminTeam.class.getName());

	List<INotificationObserver> list = new ArrayList<>();

	@Override
	public void addSubsriber(INotificationObserver observer) {

		list.add(observer);
		LOGGER.info("New Subscriber added!");
	}

	@Override
	public void removeSubscriber(INotificationObserver observer) {

		list.remove(observer);
		LOGGER.info("Someone unsubscribed!");
	}

	@Override
	public void notifySubscriber() {

		LOGGER.info("Sending Notification...");
		for (INotificationObserver iNotificationObserver : list) {
			iNotificationObserver.onHundredTicketsBooked();
		}
		LOGGER.info("Notification Sent!");
	}
}
