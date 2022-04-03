package it.unisannio.studenti.caravella.angelo.classes;

import java.text.ParseException;
import java.util.Scanner;

public class Soluzioni extends Abitazioni {

	public Soluzioni(String id, String via, int num, String comune, double valore, String collocazione, boolean presenza_giardino) {
		super(id, via, num, comune, valore, collocazione);
		this.presenza_giardino=presenza_giardino;
	}
	

	
	
	
	/**
	 * @return the presenza_giardino
	 */
	public boolean isPresenza_giardino() {
		return presenza_giardino;
	}





	/**
	 * @param presenza_giardino the presenza_giardino to set
	 */
	public void setPresenza_giardino(boolean presenza_giardino) {
		this.presenza_giardino = presenza_giardino;
	}

	



	@Override
	public String toString() {
		return "Soluzioni [presenza_giardino=" + presenza_giardino + "]";
	}





	public static Soluzioni read (Scanner sc) throws ParseException {
		
		if(!sc.hasNextLine())return null;
		String id= sc.nextLine();
		
		if(!sc.hasNextLine())return null;
		String via= sc.nextLine();
		
		if(!sc.hasNextLine())return null;
		String n= sc.nextLine();
		int num= Integer.parseInt(n);
	
		if(!sc.hasNextLine())return null;
		String c= sc.nextLine();
		
		if(!sc.hasNextLine())return null;
		String v= sc.nextLine();
		Double va= Double.parseDouble(v);
		
		if(!sc.hasNextLine())return null;
		String col= sc.nextLine();
		

	
		if(!sc.hasNextLine())return null;
		String m= sc.nextLine();
		
		boolean p= Boolean.parseBoolean(m);
	
		return new Soluzioni(id, via ,  num, c,  va, col , p);
	}
	
	boolean presenza_giardino;

	@Override
	public int compareTo(Abitazioni o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
