package FinalCheck2.repository;

public interface INotificationService {

	public void addSubsriber(INotificationObserver observer);
	public void removeSubscriber(INotificationObserver observer);
	public void notifySubscriber();
}
