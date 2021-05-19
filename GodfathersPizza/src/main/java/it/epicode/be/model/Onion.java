package it.epicode.be.model;

public class Onion implements PizzaBase {

	private PizzaBase pizza;
	
	public Onion (PizzaBase pizza) {
		this.pizza=pizza;
	}
	
	@Override
	public double getCalories() {
		return pizza.getCalories() + 3.20;
		
	}

	@Override
	public double getPrezzo() {
		// TODO Auto-generated method stub
		return pizza.getPrezzo() + 1.00;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return pizza.getName() + "Onion";
	}


}
