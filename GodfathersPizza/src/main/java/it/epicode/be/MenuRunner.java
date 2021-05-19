package it.epicode.be;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import it.epicode.be.model.Cheese;
import it.epicode.be.model.Menu;
import it.epicode.be.model.Ordine;
import it.epicode.be.model.PizzaMargherita;
import it.epicode.be.model.StatoOrdine;
import it.epicode.be.model.StatoTavolo;
import it.epicode.be.model.Tavolo;
@Component
public class MenuRunner implements CommandLineRunner{
	private static ApplicationContext ctx;
	
	@Autowired
	private Menu m;

	@Override
	public void run(String... args) throws Exception {
		System.out.println("mi trovo dentro il menu runner");
		
		
		PizzaMargherita p = new PizzaMargherita();
		Cheese c = new Cheese(new PizzaMargherita());
	//	Cheese c = ctx.getBean(Cheese.class);
	//	PizzaHawaii h = ctx.getBean(PizzaHawaii.class);
	//	Mojito d = (Mojito) ctx.getBean(Drink.class);
	//	Mug de = ctx.getBean(Mug.class);
	//	Onion n = ctx.getBean(Onion.class);
	//	Salami s = (Salami) ctx.getBean("Salami");
		
		
		
		Tavolo t = new Tavolo(20, 20, StatoTavolo.LIBERO);
		Ordine o = new Ordine(10,StatoOrdine.IN_CORSO,t);
		
		
		o.aggiungiItemOrdine(p);
		o.aggiungiItemOrdine(p);
		o.aggiungiItemOrdine(c);
		o.aggiungiItemOrdine(c);
		
	o.stampaOrdine();	
		
		
		
		
		
		
		
	}

}
