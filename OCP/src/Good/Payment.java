package Good;

public class Payment {

	public static void main(String[] args) {
		pay("Rupay");

	}
	
	public static void pay(String type)
	{
		PaymentFactory.getPaymentType(type).makePayment();
	}

}
