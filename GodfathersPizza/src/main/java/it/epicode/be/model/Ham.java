package it.epicode.be.model;

public class Ham implements PizzaBase {
	
	private PizzaBase pizza;
	
	public Ham(PizzaBase pizzaMargherita) {
		this.pizza=pizza;
	}


	@Override
	public double getCalories() {
		return pizza.getCalories() + 2.20;
		
	}

	@Override
	public double getPrezzo() {
		// TODO Auto-generated method stub
		return pizza.getPrezzo() + 3.00;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return pizza.getName() + "Ham";
	}

}
