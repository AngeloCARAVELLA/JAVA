package it.unisannio.studenti.caravella.utils;


import it.unisannio.studenti.caravella.angelo.classes.Opera;

public class Opera_tester implements Tester {

	
	public Opera_tester(String col) {
		this.col=col;
		
	}
	
	public boolean verify(Object o) {
		// TODO Auto-generated method stub
	
		Opera op= null; 
		if( o instanceof Opera) {
			
			op = (Opera) o;
			
			if( op.getNome_stanza().equals(col))
				return true; 
			
		}
		return false;
	}
	private String col;
	
}
