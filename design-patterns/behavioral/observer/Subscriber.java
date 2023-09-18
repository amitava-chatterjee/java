public class Subscriber implements Observer {

	public String name;

	public Subscriber(String name) {
		this.name = name;
	}

	@Override
	public void notified(String title) {
		System.out.println(name + ": New video uploaded: " + title);
	}

}
