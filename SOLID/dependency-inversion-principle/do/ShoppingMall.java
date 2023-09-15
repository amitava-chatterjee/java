public class ShoppingMall {

	// Depends upon low-level module but not on abstraction
	private BankCard bankCard;

	public ShoppingMall(BankCard bankCard) {
		this.bankCard = bankCard;
	}

	public void doPurchaseSomething(long amount) {
		bankCard.doTransaction(amount);
	}

	public static void main(String args[]) {
		BankCard bankCard = new CreditCard();
		ShoppingMall shoppingMall = new ShoppingMall(bankCard);
		shoppingMall.doPurchaseSomething(3000);
		bankCard = new DebitCard();
		shoppingMall = new ShoppingMall(bankCard);
		shoppingMall.doPurchaseSomething(5000);
	}

}
