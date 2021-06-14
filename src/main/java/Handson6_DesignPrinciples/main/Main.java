package Handson6_DesignPrinciples.main;

import Handson6_DesignPrinciples.observer.MessageSubscriberOne;
import Handson6_DesignPrinciples.observer.MessageSubscriberThree;
import Handson6_DesignPrinciples.observer.MessageSubscriberTwo;
import Handson6_DesignPrinciples.state.Message;
import Handson6_DesignPrinciples.subject.MessagePublisher;

import java.util.logging.Logger;

public class Main {

	private static final Logger LOGGER = Logger.getLogger(Main.class.getName());

	public static void main(String[] args) {

		LOGGER.info("-----STARTING MESSAGE PUBLISHER-----");

		MessageSubscriberOne s1 = new MessageSubscriberOne();
		MessageSubscriberTwo s2 = new MessageSubscriberTwo();
		MessageSubscriberThree s3 = new MessageSubscriberThree();

		MessagePublisher p = new MessagePublisher();

		p.attach(s1);

		p.attach(s2);

		p.notifyUpdate(new Message("First Message!")); // s1 and s2 will receive the update

		p.detach(s1);

		p.attach(s3);

		p.notifyUpdate(new Message("Second Message!")); // s2 and s3 will receive the update

		LOGGER.info("-----EXITING MESSAGE PUBLISHER-----");
	}
}
