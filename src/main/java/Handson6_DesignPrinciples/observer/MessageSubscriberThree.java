package Handson6_DesignPrinciples.observer;

import Handson6_DesignPrinciples.repository.Observer;
import Handson6_DesignPrinciples.state.Message;

import java.util.logging.Logger;

public class MessageSubscriberThree implements Observer {

	private static final Logger LOGGER = Logger.getLogger(MessageSubscriberThree.class.getName());

	@Override
	public void update(Message m) {
		LOGGER.info("MessageSubscriberThree :: " + m.getMessageContent());
	}
}
