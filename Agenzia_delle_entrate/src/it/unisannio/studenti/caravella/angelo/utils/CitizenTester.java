package it.unisannio.studenti.caravella.angelo.utils;

import it.unisannio.studenti.caravella.angelo.classes.Cittadino;

public class CitizenTester implements Tester {
	public CitizenTester(String nome, String cognome) {
		this.nome=nome;
		this.cognome=cognome;
		
	}
	@Override
	public boolean Verify(Object o) {
		// TODO Auto-generated method stub
		Cittadino ct= null;
		
		if( o instanceof Cittadino) {
			ct= (Cittadino)o;
			if( ct.getNome().equals(nome) && ct.getCognome().equals(cognome))
				return true;
			
		}
		return false;
	}
	
	
	private String nome;
	private String cognome;

}
