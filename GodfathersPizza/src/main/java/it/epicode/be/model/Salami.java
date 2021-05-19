package it.epicode.be.model;

public class Salami implements PizzaBase {
	
	private PizzaBase pizza;
	
	public Salami() {
		
	}

	public Salami(PizzaBase pizza) {
		this.pizza = pizza;
	}

	@Override
	public double getCalories() {
		if (pizza == null) {
			return 4.0;
		}
		return pizza.getCalories() + 4.0;

	}

	@Override
	public double getPrezzo() {
		if (pizza == null) {
			return 1.80;
		}
		return pizza.getPrezzo() + 1.80;
	}

	@Override
	public String getName() {
		if (pizza == null) {
			return "Salami" + "\t\t";
		}
		return pizza.getName() + "Salami" + "\t";
	}

}
