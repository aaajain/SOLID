package Good;

public class Visa implements PaymentOptions {

	@Override
	public void makePayment() {
		//logic for VIsa payment
		System.out.println("Visa");
	}

}
