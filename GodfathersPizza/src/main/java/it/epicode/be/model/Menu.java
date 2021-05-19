package it.epicode.be.model;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.LoggerFactory;

public class Menu {
	org.slf4j.Logger log = LoggerFactory.getLogger(getClass());
	private List<MenuItem> elenco = new ArrayList<MenuItem>();
	private List<FoodItem> elencoOrdinabili = new ArrayList<FoodItem>();

	public void stampa() {
		log.info("---------------------Menu------------------------------------------");
		log.info("Nome"+ "\t\t" + "\t\t" + "Prezzo" + "\t\t"+  "Calorie" + "\n");
		for (FoodItem m : elencoOrdinabili) {
			
			log.info(m.getName()+ "\t\t" + m.getPrezzo()+ "\t\t" + m.getCalories());
		}	
		
		log.info("Franchise");
		log.info("Nome"+ "\t\t" + "\t\t" + "Prezzo" + "\n" );
		for (MenuItem m : elenco) {
			log.info(m.getName()+ "\t\t" + m.getPrezzo()+ "\t\t" );
		}
		log.info("-----------------------------------------------------------------------");
			
		
		
	}
	
	public void aggiungiFoodItem (FoodItem item) {
		elencoOrdinabili.add(item);
	}
	public void aggiungiItem (MenuItem item) {
		elenco.add(item);
	}
}