package it.epicode.be.model;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.logging.Logger;

import org.slf4j.LoggerFactory;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Ordine {
	org.slf4j.Logger log = LoggerFactory.getLogger(getClass());

	private int numeroOrdine;
	private StatoOrdine stato;
	private int coperti;
	private LocalDateTime ora;
	private double totaleConto;
	private Map<MenuItem, Integer> ordini = new HashMap<>();
	private Tavolo tavolo;

	private int costoCoperto;

	public Ordine(int numeroOrdine, StatoOrdine stato, Tavolo tavolo) {
		this.numeroOrdine = numeroOrdine;
		this.stato = stato;
		this.tavolo = tavolo;
	}

	public void aggiungiItemOrdine(MenuItem m) {
		if (ordini.containsKey(m)) {
			int quantita = ordini.get(m);
			quantita++;
			ordini.put(m, quantita);
		} else {
			ordini.put(m, 1);
		}

	}

	public void stampaOrdine() {
		
		log.info("---------------------------Ordine----------------------------------------------------------");
		log.info("Nome" + "\t\t\t\t" + "Quantità "+"\t"+ "Prezzo");
		for (Entry<MenuItem, Integer> or : ordini.entrySet()) {
			log.info(or.getKey().getName() + "\t\t " + or.getValue() + "\t\t " + or.getKey().getPrezzo() * or.getValue());

		}
		log.info("---------------------------TotaleOrdine----------------------------------------------------");
		totaleOrdine();
		log.info("-------------------------------------------------------------------------------------------");

	}

	public void totaleOrdine() {
		double somma = 0;
		for (MenuItem m : ordini.keySet()) {
			somma += m.getPrezzo() * ordini.get(m);
		}

		log.info("\t\t\t\t\t" + "Il numero degli elementi è:" + " " + ordini.size() + "\n"+ "\t\t\t\t\t\t\t"+ "Il totale è:"+ " " + somma);
	}

}
