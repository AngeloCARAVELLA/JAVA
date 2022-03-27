package it.unisannio.studenti.caravella.angelo.utils;

import it.unisannio.studenti.caravella.angelo.classes.Persona;

public class TesterCity implements Tester {

	public TesterCity(String city) {
		this.city = city;

	}
	
	@Override
	public boolean Verify(Object o) {
		// TODO Auto-generated method stub
		Persona p= null;
		
		if( o instanceof Persona) {
			
			p= (Persona ) o;
			
			if(p.getL_n().equals(city))
				return true;
		}
		
		return false;
	}

	
	public boolean Verify2(Object o) {
		// TODO Auto-generated method stub
		Persona p= null;
		
		if( o instanceof Persona) {
			
			p= (Persona ) o;
			
			if(p.getL_r().equals(city))
				return true;
		}
		
		return false;
	}
	private String city;
	
}
