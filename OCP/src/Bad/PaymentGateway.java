package Bad;

public class PaymentGateway {
	Payment payment = new Payment();
	public void pay(String provider)
	{
		if(provider == "MasterCard")
		{
			payment.makeMasterCardPayment();
		}
		if(provider == "Visa")
		{
			payment.makeVisaPayment();
		}
		if(provider == "rupay")
		{
			payment.makeRupayPayment();
		}
	}
}
