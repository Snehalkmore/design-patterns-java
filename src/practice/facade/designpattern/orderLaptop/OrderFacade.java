package practice.facade.designpattern.orderLaptop;

public class OrderFacade {
	
	OrderProcessor ordProcessor = new OrderProcessor();
	
	public void placeOrder(String productName,int qty) {
		if(ordProcessor.stockAvalibility(productName)) {
			String orderId = ordProcessor.placeOrder(productName, qty);
			ordProcessor.ShipOrder(orderId);
			
		}
	}

}
