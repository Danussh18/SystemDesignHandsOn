package FinalCheck2.observer;

import FinalCheck2.repository.INotificationObserver;

import java.util.logging.Logger;

public class AdminTeam implements INotificationObserver {

	private static final Logger LOGGER = Logger.getLogger(AdminTeam.class.getName());

	@Override
	public void onHundredTicketsBooked() {
		LOGGER.info("***HUNDRED TICKETS BOOKED***");
	}
}
