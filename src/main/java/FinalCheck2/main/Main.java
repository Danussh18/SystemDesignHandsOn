package FinalCheck2.main;

import FinalCheck2.observer.AdminTeam;
import FinalCheck2.repository.INotificationService;
import FinalCheck2.service.NotificationService;

import java.util.logging.Logger;

public class Main {

	private static final Logger LOGGER = Logger.getLogger(Main.class.getName());

	public static void main(String[] args) {

		LOGGER.info("-----STARTING NOTIFIER-----");

		AdminTeam adminTeam = new AdminTeam();

		INotificationService service = new NotificationService();

		service.addSubsriber(adminTeam);

		service.notifySubscriber();

		service.removeSubscriber(adminTeam);

		LOGGER.info("-----EXITING NOTIFIER-----");
	}
}
