public class BankService {

    public long deposit(long amount, String accountNo) {
        //deposit amount
        return 0;
    }

    public long withDraw(long amount, String pin) {
        //withdraw amount
        return 0;
    }

	public void getLoanInterestInfo(String loanType) {
        if (loanType.equalsIgnoreCase("home")) {
            //do some job
        } else if (loanType.equalsIgnoreCase("personal")) {
            //do some job
        } else if (loanType.equalsIgnoreCase("car")) {
            //do some job
        } else {
			//do some job
		}
    }

	public void sendNotification(String medium) {
        if (medium.equalsIgnoreCase("email")) {
            //write email related logic
            //use JavaMailSenderAPI
        } else if(medium.equalsIgnoreCase("mobile")){
            //write logic using twillio API
        } else {
			//write something else
		}
    }

	public void printPassbook() {
        //update transaction info in passbook
    }

}
