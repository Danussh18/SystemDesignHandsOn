package Handson6_DesignPrinciples.repository;

import Handson6_DesignPrinciples.state.Message;

public interface Observer {

	public void update(Message m);
}
