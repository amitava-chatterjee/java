public class Main {

	public static void main(String args[]) {
		Developer developer = DeveloperFactory.getDeveloper(new AndroidDeveloperFactory());
		developer.designation();
		developer = DeveloperFactory.getDeveloper(new WebDeveloperFactory());
		developer.designation();
		developer = DeveloperFactory.getDeveloper(new OSDeveloperFactory());
		developer.designation();
	}

}
