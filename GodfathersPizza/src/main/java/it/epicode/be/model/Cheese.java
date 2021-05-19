package it.epicode.be.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Cheese implements PizzaBase{
	
	private PizzaBase pizza;
	
	public Cheese (PizzaBase pizza) {
		this.pizza=pizza;
	}

	@Override
	public double getCalories() {
		return pizza.getCalories() + 1.20;
		
	}

	@Override
	public double getPrezzo() {
		// TODO Auto-generated method stub
		return pizza.getPrezzo() + 2.00;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return pizza.getName() + "Cheese";
	}

}
