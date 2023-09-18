public class OSDeveloperFactory extends DeveloperAbstractFactory {

	@Override
	public Developer createDeveloper() {
		return new OSDeveloper();
	}

}
