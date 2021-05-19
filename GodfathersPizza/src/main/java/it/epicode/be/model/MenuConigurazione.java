package it.epicode.be.model;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MenuConigurazione {

	@Bean
	public PizzaMargherita getPizza() {
		PizzaMargherita c = new PizzaMargherita();
		return c;

	}

	@Bean
	public Menu getmenu() {
		return new Menu();
	}

	@Bean
	public PizzaBase getCheese() {
		return new Cheese(new PizzaMargherita());

	}

	@Bean
	PizzaBase getHawaii() {
		return new PizzaHawaii(new PizzaMargherita());
	}

	@Bean
	PizzaBase getHam() {
		return new Ham(new PizzaMargherita());
	}

	@Bean
	PizzaBase getOnion() {
		return new Onion(new PizzaMargherita());
	}

	@Bean
	PizzaBase getPineapple() {
		return new Pineapple(new PizzaMargherita());
	}

	@Bean
	PizzaBase getSalami() {
		return new Salami(new PizzaMargherita());

	}
	@Bean("Salami")
	PizzaBase getSoloSalami() {
		return new Salami();
	}
	@Bean
	Drink getDrink() {
		return new Mojito();
	}

	@Bean
	FranchiseItem getShirt() {
		return new Shirt();
	}

	@Bean
	FranchiseItem getMug() {
		return new Mug();
	}
}