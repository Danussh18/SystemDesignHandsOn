package Handson5_DesignPrinciples.model;

import Handson5_DesignPrinciples.repository.IChatMediator;
import Handson5_DesignPrinciples.repository.IUser;

import java.util.logging.Logger;

public class PremiumUser implements IUser {

	private static final Logger LOGGER = Logger.getLogger(PremiumUser.class.getName());

	private IChatMediator chatMediator;
	private String name;

	public PremiumUser(IChatMediator chatMediator, String name) {
		super();
		this.chatMediator = chatMediator;
		this.name = name;
	}

	@Override
	public void receiveMessage(String msg) {
		LOGGER.info("Name:" + this.name + "\t" + "Message:" + msg);
	}

	@Override
	public void sendMessage(String msg) {
		chatMediator.sendMessage(msg);
	}
}
