public class WebDeveloperFactory extends DeveloperAbstractFactory {

	@Override
	public Developer createDeveloper() {
		return new WebDeveloper();
	}

}
