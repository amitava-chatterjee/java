public class Phone {

	private String os;
	private int ram;
	private String processor;
	private double screen;
	private int battery;

	@Override
	public String toString() {
		return "[" + os + ", " + ram + ", " + processor + ", " + screen + ", " + battery + "]";
	}

	public Phone(PhoneBuilder phoneBuilder) {
		this.os = phoneBuilder.os;
		this.ram = phoneBuilder.ram;
		this.processor = phoneBuilder.processor;
		this.screen = phoneBuilder.screen;
		this.battery = phoneBuilder.battery;
	}

	public static PhoneBuilder builder() {
		return new Phone.PhoneBuilder();
	}

	// Inner class to create object

	static class PhoneBuilder {

		private String os;
		private int ram;
		private String processor;
		private double screen;
		private int battery;

		public PhoneBuilder os(String os) {
			this.os = os;
			return this;
		}

		public PhoneBuilder ram(int ram) {
			this.ram = ram;
			return this;
		}

		public PhoneBuilder processor(String processor) {
			this.processor = processor;
			return this;
		}

		public PhoneBuilder screen(double screen) {
			this.screen = screen;
			return this;
		}

		public PhoneBuilder battery(int battery) {
			this.battery = battery;
			return this;
		}

		public Phone build() {
			return new Phone(this);
		}

	}

}
