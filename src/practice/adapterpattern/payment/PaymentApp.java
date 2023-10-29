package practice.adapterpattern.payment;

public class PaymentApp {
	
	public void payment(int amountInRupees) {
		PaymentAdapter adapter = new PaymentAdapter();
		adapter.paymentadapter(amountInRupees);
	}
	
	public static void main(String[] args) {
		PaymentApp app = new PaymentApp();
		app.payment(100);
	}

}
