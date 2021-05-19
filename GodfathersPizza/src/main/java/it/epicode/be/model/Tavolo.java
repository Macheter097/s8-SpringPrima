package it.epicode.be.model;

import java.util.List;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
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

	

	

	public List<Ordine> getListaOrdini() {
		return listaOrdini;
	}

	public void setListaOrdini(List<Ordine> listaOrdini) {
		this.listaOrdini = listaOrdini;
	}

}
