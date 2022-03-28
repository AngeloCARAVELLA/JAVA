package it.studenti.unisannio.caravella.angelo.utils;

import it.studenti.unisannio.caravella.angelo.classes.Training;

public class TesterTrainings implements Tester {
	
	public TesterTrainings(String id) {
		this.id=id;
		
	}
	
	@Override
	public boolean verify(Object o) {
		// TODO Auto-generated method stub
		Training t= null;
		if( o instanceof Training )
		{
			t= (Training)o;
			if(t.getId().equals(id))
				return true;
		}
		
		return false;
	}

	
	
	private String id;
}
