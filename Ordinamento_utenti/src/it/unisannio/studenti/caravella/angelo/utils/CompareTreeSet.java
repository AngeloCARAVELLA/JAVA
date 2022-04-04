package it.unisannio.studenti.caravella.angelo.utils;

import java.util.Comparator;

import it.unisannio.studenti.caravella.angelo.classes.Utente;

public class CompareTreeSet implements Comparator {

	public CompareTreeSet() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		
		Utente u1= null;
		Utente u2= null;
		
		if(o1 instanceof Utente && o2 instanceof Utente ) {
			
			u1=(Utente) o1;
			u2=(Utente) o2;
			
			if( u1.getData_di_nascita().compareTo(u2.getData_di_nascita()) >0 )
				return 1;
			else if ( u1.getData_di_nascita().compareTo(u2.getData_di_nascita()) <0)
				return -1;
			else return 0;
			
		}
				
		return 0;
	}

}
