package it.studenti.unisannio.caravella.angelo.utils;

import it.studenti.unisannio.caravella.angelo.classes.Student;

public class TesterStudent implements Tester {

	public TesterStudent (String matricola) {
		
		this.matricola=matricola;
	}
	
	@Override
	public boolean verify(Object o) {
		// TODO Auto-generated method stub
		Student t=null;
		
		if( o instanceof Student) {
			t= ( Student)o;
			if(t.getId().equals(matricola))
				return true;
			
		}
	
		return false;
		
		
	}

	
	private String matricola; 
}
