package Good;

public  class PaymentFactory {
	public static PaymentOptions getPaymentType(String type)
	{
		if(type == "Master")
		{
			return new MasterCard();	
		}
		if(type == "Visa")
		{
			return new Visa();	
		}
		if(type == "Rupay")
		{
			return new Rupay();	
		}
		else
			return null;
		
	}
}
