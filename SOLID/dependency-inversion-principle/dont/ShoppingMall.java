public class ShoppingMall {

	// Depends upon low-level module but not on abstraction
	private DebitCard debitCard;

	public ShoppingMall(DebitCard debitCard) {
		this.debitCard = debitCard;
	}

	public void doPurchaseSomething(long amount) {
		debitCard.doTransaction(amount);
	}

	public static void main(String args[]) {
		DebitCard debitCard = new DebitCard();
		CreditCard creditCard = new CreditCard();
		ShoppingMall shoppingMall = new ShoppingMall(debitCard);
		// ShoppingMall shoppingMall2 = new ShoppingMall(creditCard); this line will not compile
		shoppingMall.doPurchaseSomething(5000);
	}

}
