public class Main {

	public static void main(String args[]) {
		IPhoneCharger iPhoneCharger = new IPhone13Charger();
		AndroidCharger androidCharger = new XiaomiCharger();

		IPhone13 p1 = new IPhone13(iPhoneCharger);
		p1.charge();

		// IPhone13 p2 = new IPhone13(xiaomiCharger); // it won't work
		// p2.charge();

		IPhoneChargerAdapter iPhoneChargerAdapter = new IPhoneChargerAdapter(androidCharger);
		IPhone13 p3 = new IPhone13(iPhoneChargerAdapter);
		p3.charge();
	}

}
