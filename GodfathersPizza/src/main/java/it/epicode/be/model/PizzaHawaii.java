package it.epicode.be.model;

public class PizzaHawaii implements PizzaBase {
	
	private PizzaBase pizza;
	
	public PizzaHawaii (PizzaBase pizza) {
		this.pizza=pizza;
	}

	@Override
	public double getPrezzo() {
		return pizza.getPrezzo() + 4.5;
	}

	@Override
	public double getCalories() {
		
		return pizza.getCalories() + 1.95;
	}

	@Override
	public String getName() {
		
		return "PizzaHawaii" + "\t";
	}

}
