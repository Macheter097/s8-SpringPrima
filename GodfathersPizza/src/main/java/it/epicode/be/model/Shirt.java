package it.epicode.be.model;

public class Shirt implements FranchiseItem{

	@Override
	public double getPrezzo() {
		
		return 15;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Shirt Ufficiale";
	}
	

}
