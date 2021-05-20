package it.epicode.be.model;

import java.util.List;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class Tavolo {
	
	private String numero;
	private int numCoperti;
	private StatoTavolo statoTavolo;
	private List<Ordine> listaOrdini;
	
	public Tavolo (String i, int numComperti, StatoTavolo statoTavolo) {
		this.numero=i;
		this.numCoperti=numComperti;
		this.statoTavolo=StatoTavolo.OCCUPATO;
	}

	

	

	public List<Ordine> getListaOrdini() {
		return listaOrdini;
	}

	public void setListaOrdini(List<Ordine> listaOrdini) {
		this.listaOrdini = listaOrdini;
	}
	

		
	@Override
	public String toString() {
		
		return numero;
	}
		

}
