package practice.factory.pizza;

public class ChickenPizza implements Pizza{

	@Override
	public void preparePizza() {
		System.out.println("Preparing Chicken Pizza.");
	}

	@Override
	public void bakePizza() {
		System.out.println("Baking Chicken Pizza.");
	}

	@Override
	public void cutPizza() {
		System.out.println("Cutting Chicken Pizza.");
	}

}
