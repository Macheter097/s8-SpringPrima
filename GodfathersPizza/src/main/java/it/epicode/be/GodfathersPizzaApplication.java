package it.epicode.be;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.AbstractXmlApplicationContext;

import it.epicode.be.model.Cheese;
import it.epicode.be.model.Drink;
import it.epicode.be.model.Menu;
import it.epicode.be.model.MenuConigurazione;
import it.epicode.be.model.Mojito;
import it.epicode.be.model.Mug;
import it.epicode.be.model.Onion;
import it.epicode.be.model.PizzaHawaii;
import it.epicode.be.model.PizzaMargherita;
import it.epicode.be.model.Salami;

@SpringBootApplication
public class GodfathersPizzaApplication {

	public static ApplicationContext ctx;

	public static void main(String[] args) {
		SpringApplication.run(GodfathersPizzaApplication.class, args);

		ctx = new AnnotationConfigApplicationContext(MenuConigurazione.class);

	}
}
