package it.unisannio.caravella.angelo.utils;

import it.unisannio.caravella.angelo.classes.Archivio_di_clienti;

public class TesterClientById implements Tester {
	
	public TesterClientById(String id) {
		this.id=id;
	}
	
	@Override
	public boolean verify(Object o) {
		// TODO Auto-generated method stub
		Archivio_di_clienti a=null;
		if( o instanceof Archivio_di_clienti) {
			
			a = ( Archivio_di_clienti) o; 
			if( a.getIdentificativo().equals(id))
				return true ;	
		}
		return false;
	}

	
	private String id;
}
