package it.epicode.be.model;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class MenuConigurazione {

	@Bean
	@Scope("prototype")
	public PizzaMargherita getPizza() {
		PizzaMargherita c = new PizzaMargherita();
		return c;

	}

	@Bean
	@Scope("singleton")
	public Menu getmenu() {
		return new Menu();
	}

	@Bean
	@Scope("prototype")
	public PizzaBase getCheese() {
		return new Cheese(new PizzaMargherita());

	}

	@Bean@Scope("prototype")
	PizzaBase getHawaii() {
		return new PizzaHawaii(new PizzaMargherita());
	}

	@Bean
	@Scope("prototype")
	PizzaBase getHam() {
		return new Ham(new PizzaMargherita());
	}

	@Bean
	@Scope("prototype")
	PizzaBase getOnion() {
		return new Onion(new PizzaMargherita());
	}

	@Bean
	@Scope("prototype")
	PizzaBase getPineapple() {
		return new Pineapple(new PizzaMargherita());
	}

	@Bean
	@Scope("prototype")
	PizzaBase getSalami() {
		return new Salami(new PizzaMargherita());

	}
	@Bean("soloSalami")
	@Scope("prototype")
	PizzaBase getSoloSalami() {
		return new Salami();
	}
	@Bean
	@Scope("prototype")
	Drink getDrink() {
		return new Mojito();
	}

	@Bean
	@Scope("prototype")
	FranchiseItem getShirt() {
		return new Shirt();
	}

	@Bean
	@Scope("prototype")
	FranchiseItem getMug() {
		return new Mug();
	}
	@Bean
	@Scope("prototype")
	Tavolo getTavolo() {
		return new Tavolo("1",4,StatoTavolo.LIBERO);
	}
	
	@Bean
	@Scope("prototype")
	Ordine getOrdine() {
		return new Ordine(1, StatoOrdine.IN_CORSO, getTavolo());
	}
	
	
	
	
	
	
}