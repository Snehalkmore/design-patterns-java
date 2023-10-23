package practice.factory.pizza;

public class PizzaStore {
	
	
	public Pizza orderPizza(String type) {
		Pizza p = PizzaFactory.createPizza(type);
		p.preparePizza();
		p.bakePizza();
		p.cutPizza();
		
		return p;
		
	}

}
