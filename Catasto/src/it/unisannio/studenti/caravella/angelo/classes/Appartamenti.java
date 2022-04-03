package it.unisannio.studenti.caravella.angelo.classes;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

import it.unisannio.studenti.caravella.angelo.utils.Constants;

public class Appartamenti extends Abitazioni{

	public Appartamenti(String id, String via, int num, String comune, double valore, String collocazione, int num_st,int m_q) {
		super(id, via, num, comune, valore, collocazione);
		// TODO Auto-generated constructor stub
		this.num_st=num_st;
		this.m_q=m_q;
	}
	
	public static Appartamenti read (Scanner sc) throws ParseException {
		
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
		String n_s= sc.nextLine();
		
		int nums= Integer.parseInt(n_s);
	
		if(!sc.hasNextLine())return null;
		String m= sc.nextLine();
		
		int num_m= Integer.parseInt(m);
	
		return new Appartamenti(id, via ,  num, c,  va, col ,  nums,  num_m);
	}
	
	
	
	@Override
	public String toString() {
		return "Appartamenti [num_st=" + num_st + ", m_q=" + m_q + "]";
	}

	/**
	 * @return the num_st
	 */
	public int getNum_st() {
		return num_st;
	}

	/**
	 * @param num_st the num_st to set
	 */
	public void setNum_st(int num_st) {
		this.num_st = num_st;
	}

	/**
	 * @return the m_q
	 */
	public int getM_q() {
		return m_q;
	}

	/**
	 * @param m_q the m_q to set
	 */
	public void setM_q(int m_q) {
		this.m_q = m_q;
	}



	private int num_st;
	private int m_q;
	@Override
	public int compareTo(Abitazioni o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	 
}
