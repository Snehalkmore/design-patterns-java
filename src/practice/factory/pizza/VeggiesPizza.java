package practice.factory.pizza;

public class VeggiesPizza implements Pizza{

	@Override
	public void preparePizza() {
		System.out.println("Preparing Veggies Pizza.");
	}

	@Override
	public void bakePizza() {
		System.out.println("Baking Veggies Pizza.");
	}

	@Override
	public void cutPizza() {
		System.out.println("Cutting Veggies Pizza.");
	}
}
