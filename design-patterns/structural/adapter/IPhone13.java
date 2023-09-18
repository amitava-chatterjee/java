public class IPhone13 {

	private IPhoneCharger iPhoneCharger;

	public IPhone13(IPhoneCharger iPhoneCharger) {
		this.iPhoneCharger = iPhoneCharger;
	}

	public void charge() {
		iPhoneCharger.chargeIPhone();
	}

}
