package it.epicode.be.model;

public class PizzaMargherita implements PizzaBase {

	@Override
	public double getPrezzo() {
		return 5.00;
	}

	@Override
	public double getCalories() {
		return 11.30;
	}

	@Override
	public String getName() {
		return "Pizza Margherita" + "\t";
	}

}
