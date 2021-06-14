package Handson6_DesignPrinciples.repository;

import Handson6_DesignPrinciples.state.Message;

public interface Subject {

	public void attach(Observer o);

	public void detach(Observer o);

	public void notifyUpdate(Message m);
}
