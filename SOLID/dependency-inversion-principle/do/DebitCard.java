public class DebitCard implements BankCard {

    @Override
	public void doTransaction(long amount) {
		System.out.println("Payment using debit card");
    }

}
