package it.epicode.be.model;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.LoggerFactory;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Menu {
	org.slf4j.Logger log = LoggerFactory.getLogger(getClass());
	private List<MenuItem> elenco = new ArrayList<MenuItem>();
	private List<FoodItem> elencoOrdinabili = new ArrayList<FoodItem>();
	private List<Ordine> listaOrdini = new ArrayList<Ordine>();

	public String elencoMenuConsumabili() {
		String c = null;
		for (FoodItem m : elencoOrdinabili) {

			c = m.getName() + "\t\t" + m.getPrezzo() + "\t\t" + m.getCalories();
		}
		return c;

	}

	public void stampa() {
		log.info("---------------------Menu------------------------------------------");
		log.info("Nome" + "\t\t" + "\t\t" + "Prezzo" + "\t\t" + "Calorie" + "\n");
		for (FoodItem m : elencoOrdinabili) {

			log.info(m.getName() + "\t\t" + m.getPrezzo() + "\t\t" + m.getCalories());
		}

		log.info("Franchise");
		log.info("Nome" + "\t\t" + "\t\t" + "Prezzo" + "\n");
		for (MenuItem m : elenco) {
			log.info(m.getName() + "\t\t" + m.getPrezzo() + "\t\t");
		}
		log.info("-----------------------------------------------------------------------");

	}

	public void aggiungiFoodItem(FoodItem item) {
		elencoOrdinabili.add(item);
	}

	public void aggiungiItem(MenuItem item) {
		elenco.add(item);
	}

	public void registraOrdine(Ordine d) {
		listaOrdini.add(d);
	}

	public Ordine ordineDaId(int id) {
	return listaOrdini.get(id-1);
		
		

	}

}