public class Main {

	public static void main(String args[]) {
		OS os = OSFactory.getOS("windows");
		os.description();
		os = OSFactory.getOS("IOS");
		os.description();
		os = OSFactory.getOS("Android");
		os.description();
	}

}
