package PractiseCheck2.subject;


import PractiseCheck2.repository.INotificationObserver;
import PractiseCheck2.repository.INotificationService;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class NotificationService implements INotificationService {

	List<INotificationObserver> list = new ArrayList<INotificationObserver>();

	private static final Logger LOGGER = Logger.getLogger(NotificationService.class.getName());

	@Override
	public void addSubscriber(INotificationObserver observer) {

		list.add(observer);
		LOGGER.info("UPDATED SUBSCRIBERS LIST:");
		for (INotificationObserver iNotificationObserver : list) {
			LOGGER.info(iNotificationObserver.toString());
		}
	}

	@Override
	public void removeSubscriber(INotificationObserver observer) {

		list.remove(observer);
		LOGGER.info("UPDATED SUBSCRIBERS LIST:");
		for (INotificationObserver iNotificationObserver : list) {
			LOGGER.info(iNotificationObserver.toString());
		}
	}

	@Override
	public void notifySubscriber() {

		for (INotificationObserver iNotificationObserver : list) {
			iNotificationObserver.onServerDown();
		}
	}
}
