package it.epicode.be.model;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.logging.Logger;

import org.slf4j.LoggerFactory;

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

	public org.slf4j.Logger getLog() {
		return log;
	}

	public void setLog(org.slf4j.Logger log) {
		this.log = log;
	}

	public int getNumeroOrdine() {
		return numeroOrdine;
	}

	public void setNumeroOrdine(int numeroOrdine) {
		this.numeroOrdine = numeroOrdine;
	}

	public StatoOrdine getStato() {
		return stato;
	}

	public void setStato(StatoOrdine stato) {
		this.stato = stato;
	}

	public int getCoperti() {
		return coperti;
	}

	public void setCoperti(int coperti) {
		this.coperti = coperti;
	}

	public LocalDateTime getOra() {
		return ora;
	}

	public void setOra(LocalDateTime ora) {
		this.ora = ora;
	}

	public double getTotaleConto() {
		return totaleConto;
	}

	public void setTotaleConto(double totaleConto) {
		this.totaleConto = totaleConto;
	}

	public Tavolo getTavolo() {
		return tavolo;
	}

	public void setTavolo(Tavolo tavolo) {
		this.tavolo = tavolo;
	}

	public int getCostoCoperto() {
		return costoCoperto;
	}

	public void setCostoCoperto(int costoCoperto) {
		this.costoCoperto = costoCoperto;
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

		for (Entry<MenuItem, Integer> or : ordini.entrySet()) {
			log.info(or.getKey().getName() + " " + or.getValue() + " " + or.getKey().getPrezzo() * or.getValue());

		}
		totaleOrdine();

	}
	
	public void totaleOrdine () {
		double somma =0;
		for (MenuItem m : ordini.keySet()) {
			somma += m.getPrezzo() *ordini.get(m);
		}
		
		log.info("Il totale è:"+somma);
	}

}
