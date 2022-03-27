package it.unisannio.studenti.caravella.angelo.utils;

import java.text.ParseException;
import java.util.*;

import it.unisannio.studenti.caravella.angelo.classes.Persona;

public class TesterPeriod implements Tester{

	
	public TesterPeriod(String city) {
		this.city = city;

	}
	@Override
	public boolean Verify(Object o) throws ParseException {
		// TODO Auto-generated method stub
		
		Persona p= null;
		
		Date d_i= Constants.ssMMyyyy.parse(Constants.d_i);
		Date d_f= Constants.ssMMyyyy.parse(Constants.d_f);
		if( o instanceof Persona) {
			p= (Persona)o;
			
			
			if(p.getL_n().equals(city)&& p.getD_b().after(d_i) && p.getD_b().before(d_f))
			return true;
		}
		
		
		return false;
		
	}

	
	private String city;
	
}
