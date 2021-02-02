package Good;

public class MasterCard implements PaymentOptions{

	@Override
	public void makePayment() {
		// logic for master card payemtn
		System.out.println("MasterCard");
		
	}

}
