public interface Subject {

	void subscribe(Observer observer);
	void unsubscribe(Observer observer);
	void notifyAll(String title);

}
