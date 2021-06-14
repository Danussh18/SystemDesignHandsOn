package Handson5_DesignPrinciples;

import Handson5_DesignPrinciples.mediator.ChatMediator;
import Handson5_DesignPrinciples.model.BasicUser;
import Handson5_DesignPrinciples.model.PremiumUser;
import Handson5_DesignPrinciples.repository.IChatMediator;
import Handson5_DesignPrinciples.repository.IUser;

import java.util.Scanner;
import java.util.logging.Logger;

public class Main {

	private static final Logger LOGGER = Logger.getLogger(Main.class.getName());

	public static void main(String[] args) {

		LOGGER.info("-----STARTING CHAT BROADCASTER-----");

		Scanner sc = new Scanner(System.in);
		IChatMediator chatMediator = new ChatMediator();

		boolean loop = true;

		LOGGER.info("***ENTER USER DETAILS***");
		while (loop == true) {
			LOGGER.info("Enter user? (Press Y to continue)");
			String choice = sc.nextLine();

			if (choice.equalsIgnoreCase("Y")) {

				LOGGER.info("Enter user name:");
				String uName = sc.nextLine();
				LOGGER.info("Enter user membership type (Press P for PREMIUM else BASIC):");
				String uType = sc.nextLine();

				if (uType.equalsIgnoreCase("P")) {
					IUser user = new PremiumUser(chatMediator, uName);
					chatMediator.addUser(user);
				} else {
					IUser user = new BasicUser(chatMediator, uName);
					chatMediator.addUser(user);
				}
			} else {
				LOGGER.info("User details have been registered!");
				loop = false;
			}
		}

		LOGGER.info("***ENTER SENDER DETAILS***");
		LOGGER.info("Enter sender name:");
		String sName = sc.nextLine();
		IUser user = new BasicUser(chatMediator, sName);
		LOGGER.info("Enter sender message:");
		String sMsg = sc.nextLine();
		LOGGER.info("***BROADCASTING " + sName.toUpperCase() + "'S MESSAGE***");
		user.sendMessage(sMsg);

		LOGGER.info("-----EXITING CHAT BROADCASTER-----");
	}
}
