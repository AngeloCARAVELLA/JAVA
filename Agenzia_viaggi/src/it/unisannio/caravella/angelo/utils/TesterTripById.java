package it.unisannio.caravella.angelo.utils;

import it.unisannio.caravella.angelo.classes.Pacchetti_viaggio;

public class TesterTripById implements Tester {

	public TesterTripById(String id) {
		this.id=id;
	}
	
	@Override
	public boolean verify(Object o) {
		// TODO Auto-generated method stub
		
		Pacchetti_viaggio p= null;
		if( o instanceof Pacchetti_viaggio)
		{	
			p= (Pacchetti_viaggio) o;
			if(p.getIdentificativo().equals(id))
				return true;
			
		}
		return false;
	}

	
	private String id; 
}
