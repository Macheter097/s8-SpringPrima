package it.epicode.be.model;

public class Pineapple implements PizzaBase {
	private PizzaBase pizza;

	public Pineapple(PizzaBase pizza) {
		this.pizza = pizza;
	}

	@Override
	public double getCalories() {
		return pizza.getCalories() + 5.0;

	}

	@Override
	public double getPrezzo() {
		// TODO Auto-generated method stub
		return pizza.getPrezzo() + 1.50;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return pizza.getName() + "Pineapple";
	}
}
