package it.epicode.be.model;

import java.util.List;

public class Tavolo {
	
	private int numero;
	private int numCoperti;
	private StatoTavolo statoTavolo;
	private List<Ordine> listaOrdini;
	
	public Tavolo (int numero, int numComperti, StatoTavolo statoTavolo) {
		this.numero=numero;
		this.numCoperti=numComperti;
		this.statoTavolo=StatoTavolo.OCCUPATO;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getNumCoperti() {
		return numCoperti;
	}

	public void setNumCoperti(int numCoperti) {
		this.numCoperti = numCoperti;
	}

	public StatoTavolo getStatoTavolo() {
		return statoTavolo;
	}

	public void setStatoTavolo(StatoTavolo statoTavolo) {
		this.statoTavolo = statoTavolo;
	}

	public List<Ordine> getListaOrdini() {
		return listaOrdini;
	}

	public void setListaOrdini(List<Ordine> listaOrdini) {
		this.listaOrdini = listaOrdini;
	}

}
