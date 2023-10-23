package practice.factory.pizza;

public class CheesePizza implements Pizza{

	@Override
	public void preparePizza() {
		System.out.println("Preparing Cheese Pizza.");
	}

	@Override
	public void bakePizza() {
		System.out.println("Baking Cheese Pizza.");
	}

	@Override
	public void cutPizza() {
		System.out.println("Cutting Cheese Pizza.");
	}

}
