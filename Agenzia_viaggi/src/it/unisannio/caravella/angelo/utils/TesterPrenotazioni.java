package it.unisannio.caravella.angelo.utils;

import it.unisannio.caravella.angelo.classes.Pacchetti_viaggio;

public class TesterPrenotazioni implements Tester {
	
	public TesterPrenotazioni(double durata, double importo) {
		
		this.durata=durata;
		this.importo=importo;
	}
	
	@Override
	public boolean verify(Object o) {
		// TODO Auto-generated method stub
		
		Pacchetti_viaggio p= null;
		
		if( o instanceof Pacchetti_viaggio) {
			p= (Pacchetti_viaggio)o;
			
		if( p.getCost_p()<= this.importo && p.getNumero_di_giorni()>= this.durata )
			return true;
		}
		
		
		return false;
	}
	
	
	private double durata;
	
	private double importo;

}
