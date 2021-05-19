package it.epicode.be.model;

import java.util.ArrayList;
import java.util.List;

public class Menu {

	private List<MenuItem> elenco = new ArrayList<MenuItem>();
	private List<FoodItem> elencoOrdinabili = new ArrayList<FoodItem>();

	public void stampa() {
		System.out.println("Nome"+ "\t\t" + "\t\t" + "Prezzo" + "\t\t"+  "Calorie");
		for (FoodItem m : elencoOrdinabili) {
			
			System.out.println(m.getName()+ "\t\t" + m.getPrezzo()+ "\t\t" + m.getCalories());
		}	
		
		System.out.println("Franchise");
		for (MenuItem m : elenco) {
			System.out.println(m.getName()+ "\t\t" + m.getPrezzo()+ "\t\t" );
		}
		
			
		
		
	}
	
	public void aggiungiFoodItem (FoodItem item) {
		elencoOrdinabili.add(item);
	}
	public void aggiungiItem (MenuItem item) {
		elenco.add(item);
	}
}