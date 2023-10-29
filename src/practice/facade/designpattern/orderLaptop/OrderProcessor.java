package practice.facade.designpattern.orderLaptop;

public class OrderProcessor {
	
	public boolean stockAvalibility(String str) {
		System.out.println(str +" available in warehouse");
		return true;
	}
	
	public String placeOrder(String name,int qty) {
		System.out.println("order placed for "+name+" qty: "+qty);
		return "ord1234";
	}
	
	public void ShipOrder(String orderId) {
		System.out.println("product is shipped: "+orderId);
	}

}
