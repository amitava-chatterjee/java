public class AndroidDeveloperFactory extends DeveloperAbstractFactory {

	@Override
	public Developer createDeveloper() {
		return new AndroidDeveloper();
	}

}
