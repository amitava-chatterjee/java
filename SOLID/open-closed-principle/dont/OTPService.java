public class OTPService {

	public void sendOTP(String medium) {
        if (medium.equalsIgnoreCase("email")) {
            //write email related logic
            //use JavaMailSenderAPI
        } else if(medium.equalsIgnoreCase("mobile")){
            //write logic using twillio API
        } else {
			//write something else
		}
    }

}
