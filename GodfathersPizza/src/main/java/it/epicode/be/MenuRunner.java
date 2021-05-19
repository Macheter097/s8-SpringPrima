package it.epicode.be;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import it.epicode.be.model.Cheese;
import it.epicode.be.model.Drink;
import it.epicode.be.model.Menu;
import it.epicode.be.model.Mojito;
import it.epicode.be.model.Mug;
import it.epicode.be.model.Onion;
import it.epicode.be.model.Ordine;
import it.epicode.be.model.PizzaHawaii;
import it.epicode.be.model.PizzaMargherita;
import it.epicode.be.model.Salami;
import it.epicode.be.model.Shirt;
import it.epicode.be.model.StatoOrdine;
import it.epicode.be.model.StatoTavolo;
import it.epicode.be.model.Tavolo;
@Component
public class MenuRunner implements CommandLineRunner{
	@Autowired
	private  ApplicationContext ctx;
	
	@Autowired
	private Menu m;

	@Override
	public void run(String... args) throws Exception {
	
		System.out.println("mi trovo dentro il menu runner");
		
		// blocco Menu
		
		PizzaMargherita p = ctx.getBean(PizzaMargherita.class);
		Cheese c = (Cheese) ctx.getBean("getCheese");
		PizzaHawaii h = (PizzaHawaii) ctx.getBean("getHawaii");
		Mojito d = (Mojito) ctx.getBean("getDrink");
		Mug de = (Mug) ctx.getBean("getMug");
		Onion n = (Onion) ctx.getBean("getOnion");
		Salami s = (Salami) ctx.getBean("Salami");
		Shirt ns = (Shirt) ctx.getBean("getShirt");
		
		m.aggiungiFoodItem(s);
		m.aggiungiFoodItem(n);
		m.aggiungiFoodItem(d);
		m.aggiungiFoodItem(h);
		m.aggiungiFoodItem(c);
		m.aggiungiFoodItem(p);
		m.aggiungiItem(de);
		m.aggiungiItem(ns);
		
		m.stampa();
		
		//Blocco Ordine
		
		Tavolo t = (Tavolo) ctx.getBean("getTavolo");
		Ordine o = (Ordine) ctx.getBean("getOrdine");
		
		
		o.aggiungiItemOrdine(p);
		o.aggiungiItemOrdine(p);
		o.aggiungiItemOrdine(c);
		o.aggiungiItemOrdine(c);
		o.aggiungiItemOrdine(de);
		o.aggiungiItemOrdine(h);
		o.aggiungiItemOrdine(s);
		
	o.stampaOrdine();	
	
	//public void addToMap(MenuItem item) {
     //   MenuItem presente = null;
      //  for (MenuItem m : listaOrdini.keySet()) {
       //     if (m.equals(item))
        //        presente = m;
       // }
       // if (presente != null) {
        //    listaOrdini.put(presente, listaOrdini.get(presente) + 1);
         //   logger.info("ORDINE AGGIUNTO IF ");
       // } else {
        //    listaOrdini.put(item, 1);
         //   logger.info("ORDINE AGGIUNTO ELSE ");
       // }
   // }
		
		
		
		
		
		
		
	}

}
