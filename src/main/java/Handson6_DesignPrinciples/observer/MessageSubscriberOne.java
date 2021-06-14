package Handson6_DesignPrinciples.observer;
import Handson6_DesignPrinciples.repository.Observer;
import Handson6_DesignPrinciples.state.Message;

import java.util.logging.Logger;

public class MessageSubscriberOne implements Observer {

	private static final Logger LOGGER = Logger.getLogger(MessageSubscriberOne.class.getName());

	@Override
	public void update(Message m) {
		LOGGER.info("MessageSubscriberOne :: " + m.getMessageContent());
	}
}
