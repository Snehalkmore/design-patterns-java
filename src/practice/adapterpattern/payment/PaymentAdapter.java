package practice.adapterpattern.payment;

public class PaymentAdapter {
	
	public void paymentadapter(int rupees) {
		double amountInDollar = rupees*0.012;
		PaymentProcessor paymentProcessor = new PaymentProcessorImpl();
		paymentProcessor.pay(amountInDollar);
	}

}
