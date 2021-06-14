package Handson5_DesignPrinciples.mediator;


import Handson5_DesignPrinciples.repository.IChatMediator;
import Handson5_DesignPrinciples.repository.IUser;

import java.util.ArrayList;
import java.util.List;

public class ChatMediator implements IChatMediator {

	List<IUser> users = new ArrayList<>();

	public ChatMediator() {
	}

	@Override
	public void addUser(IUser user) {
		users.add(user);
	}

	@Override
	public void sendMessage(String msg) {

		for (IUser user : users) {
			user.receiveMessage(msg);
		}
	}
}
