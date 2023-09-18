public class Main {

	public static void main(String args[]) {
		Subject cwh = new Channel();
		Observer sayan = new Subscriber("Sayan");
		Observer utsav = new Subscriber("Utsav");

		cwh.subscribe(sayan);
		cwh.notifyAll("Angular JS tutorial");

		cwh.subscribe(utsav);
		cwh.notifyAll("React Redux Toolkit tutorial");

		cwh.unsubscribe(sayan);
		cwh.notifyAll("Python Django tutorial");
	}

}
