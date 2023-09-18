public class IPhoneChargerAdapter implements IPhoneCharger {

	private AndroidCharger androidCharger;

	public IPhoneChargerAdapter(AndroidCharger androidCharger) {
		this.androidCharger = androidCharger;
	}

	@Override
	public void chargeIPhone() {
		System.out.println();
		androidCharger.chargeAndroid();
		System.out.println("Charging IPhone using Adapter...");
	}

}
