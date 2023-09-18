import java.util.*;

public class Channel implements Subject {

	public List<Observer> observers = new ArrayList<>();

	@Override
	public void subscribe(Observer observer) {
		this.observers.add(observer);
	}

	@Override
	public void unsubscribe(Observer observer) {
		this.observers.remove(observer);
	}

	@Override
	public void notifyAll(String title) {
		for (Observer observer : this.observers) {
			observer.notified(title);
		}
	}

}
