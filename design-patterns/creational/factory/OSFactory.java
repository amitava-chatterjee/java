public class OSFactory {

	public static OS getOS(String osName) {
		if (osName.trim().equalsIgnoreCase("ios"))
			return new IPhoneOS();
		else if (osName.trim().equalsIgnoreCase("android"))
			return new AndroidOS();
		else if (osName.trim().equalsIgnoreCase("windows"))
			return new WindowsOS();
		else
			return null;
	}

}
