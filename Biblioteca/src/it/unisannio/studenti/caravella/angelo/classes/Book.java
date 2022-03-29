package it.unisannio.studenti.caravella.angelo.classes;

import java.text.ParseException;
import java.util.*;

import it.unisannio.studenti.caravella.angelo.utils.Constants;

public class Book extends PhysicalMedium {

	
	/**
	 * @param id
	 * @param autore
	 * @param titolo
	 * @param anno_p
	 * @param n_p
	 */
	public Book(String id, String autore, String titolo, Date anno_p, int n_p) {
		super(id, autore, titolo, anno_p);
		this.n_p = n_p;
	}

	
	/**
	 * @return the n_p
	 */
	public int getN_p() {
		return n_p;
	}


	/**
	 * @param n_p the n_p to set
	 */
	public void setN_p(int n_p) {
		this.n_p = n_p;
	}

	public static Book read(String id, Scanner sc) throws ParseException {
		
	
		if(!sc.hasNextLine())return null;
		String autore= sc.nextLine().strip();
		
		if(!sc.hasNextLine())return null;
		String titolo= sc.nextLine().strip();
		
		if(!sc.hasNextLine())return null;
		String anno= sc.nextLine();
		Date anno_p= Constants.yyyy.parse(anno);
		
		if(!sc.hasNextLine())return null;
		String n= sc.nextLine();
		int n_p= Integer.parseInt(n);
		
		return new Book(id, autore, titolo, anno_p,  n_p);
		
	}
	

	@Override
	public String toString() {
		return "Book [n_p=" + n_p + "]";
	}


	private int n_p;
}
