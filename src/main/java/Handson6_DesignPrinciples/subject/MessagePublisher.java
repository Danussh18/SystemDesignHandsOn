package Handson6_DesignPrinciples.subject;


import Handson6_DesignPrinciples.repository.Observer;
import Handson6_DesignPrinciples.repository.Subject;
import Handson6_DesignPrinciples.state.Message;

import java.util.ArrayList;
import java.util.List;

public class MessagePublisher implements Subject {

	private List<Observer> observers = new ArrayList<>();

	@Override
	public void attach(Observer o) {
		observers.add(o);
	}

	@Override
	public void detach(Observer o) {
		observers.remove(o);
	}

	@Override
	public void notifyUpdate(Message m) {

		for (Observer observer : observers) {
			observer.update(m);
		}
	}
}
