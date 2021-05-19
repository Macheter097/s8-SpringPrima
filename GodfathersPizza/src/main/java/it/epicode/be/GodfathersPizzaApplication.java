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
	
	public static  ApplicationContext ctx;

	public static void main(String[] args) {
		SpringApplication.run(GodfathersPizzaApplication.class, args);
		
		ctx = new AnnotationConfigApplicationContext(MenuConigurazione.class);
		
	
		
	//	PizzaMargherita p = ctx.getBean(PizzaMargherita.class);
		//Cheese c = ctx.getBean(Cheese.class);
		//PizzaHawaii h = ctx.getBean(PizzaHawaii.class);
		//Mojito d = (Mojito) ctx.getBean(Drink.class);
		//Mug de = ctx.getBean(Mug.class);
		//Onion n = ctx.getBean(Onion.class);
		//Salami s = (Salami) ctx.getBean("Salami");
		
	//	m.aggiungiFoodItem(s);
	//	m.aggiungiFoodItem(p);
	//	m.aggiungiFoodItem(c);
	//	m.aggiungiFoodItem(n);
	//	m.aggiungiFoodItem(h);
	//	m.aggiungiFoodItem(d);
	//	m.aggiungiItem(de);
	//	m.stampa();
			
		
}
}
