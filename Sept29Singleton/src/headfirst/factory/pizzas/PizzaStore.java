package headfirst.factory.pizzas;

public class PizzaStore {
//  SimplePizzaFactory factory;

  public PizzaStore() {
    
  }

  public Pizza orderPizza(String type) {
	SimplePizzaFactory factory = SimplePizzaFactory.getInstance();
    Pizza pizza;
    pizza = factory.createPizza(type);
    pizza.prepare();
    pizza.bake();
    pizza.cut();
    pizza.box();
    
    return pizza;
  }

}
