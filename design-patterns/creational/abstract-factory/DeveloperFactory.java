public class DeveloperFactory {

	public static Developer getDeveloper(DeveloperAbstractFactory factory) {
		return factory.createDeveloper();
	}

}
