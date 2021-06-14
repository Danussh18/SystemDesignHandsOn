package Handson5_DesignPrinciples.repository;

public interface IChatMediator {

	void addUser(IUser user);

	void sendMessage(String msg);
}
