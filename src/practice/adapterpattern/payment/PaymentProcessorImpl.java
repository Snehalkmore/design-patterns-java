package practice.adapterpattern.payment;

public class PaymentProcessorImpl implements PaymentProcessor{

	@Override
	public void pay(double amountInDollar) {
		System.out.println("amt paid : "+amountInDollar);
	}

}
