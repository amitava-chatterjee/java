public class Main {

	public static void main(String args[]) {
		Phone phone = Phone.builder().os("ios").ram(4).processor("QualComm").screen(7.1).battery(5000).build();
		System.out.println(phone);
	}

}
