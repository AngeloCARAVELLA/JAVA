package it.unisannio.studenti.caravella.angelo.classes;
import java.text.ParseException;
import java.util.*;

import it.unisannio.studenti.caravella.angelo.utils.Constants;

public class Persona {

	
	
	/**
	 * @param cf
	 * @param n
	 * @param c
	 * @param d_b
	 * @param l_n
	 * @param l_r
	 */
	public Persona(String cf, String n, String c, Date d_b, String l_n, String l_r) {
		this.cf = cf;
		this.n = n;
		this.c = c;
		this.d_b = d_b;
		this.l_n = l_n;
		this.l_r = l_r;
	}
	
	
	public static Persona read(Scanner sc) throws ParseException {
		
		 if(!sc.hasNextLine())return null;
	     String cf= sc.nextLine().strip();
		 
	     if(!sc.hasNextLine())return null;
	     String n= sc.nextLine().strip();
	     
	     if(!sc.hasNextLine())return null;
	     String c= sc.nextLine().strip();
		 
	     if(!sc.hasNextLine())return null;
	     String d= sc.nextLine();
	     Date d_b= Constants.ssMMyyyy.parse(d);
	     
	     if(!sc.hasNextLine())return null;
		 String l_n= sc.nextLine().strip();
		 
		 if(!sc.hasNextLine())return null;
		 String l_r= sc.nextLine().strip();
		
		
		 return new Persona ( cf, n, c, d_b, l_n , l_r);
	}
	
	
	
	/**
	 * @return the cf
	 */
	public String getCf() {
		return cf;
	}


	/**
	 * @param cf the cf to set
	 */
	public void setCf(String cf) {
		this.cf = cf;
	}


	/**
	 * @return the n
	 */
	public String getN() {
		return n;
	}


	/**
	 * @param n the n to set
	 */
	public void setN(String n) {
		this.n = n;
	}


	/**
	 * @return the c
	 */
	public String getC() {
		return c;
	}


	/**
	 * @param c the c to set
	 */
	public void setC(String c) {
		this.c = c;
	}


	/**
	 * @return the d_b
	 */
	public Date getD_b() {
		return d_b;
	}


	/**
	 * @param d_b the d_b to set
	 */
	public void setD_b(Date d_b) {
		this.d_b = d_b;
	}


	/**
	 * @return the l_n
	 */
	public String getL_n() {
		return l_n;
	}


	/**
	 * @param l_n the l_n to set
	 */
	public void setL_n(String l_n) {
		this.l_n = l_n;
	}


	/**
	 * @return the l_r
	 */
	public String getL_r() {
		return l_r;
	}


	/**
	 * @param l_r the l_r to set
	 */
	public void setL_r(String l_r) {
		this.l_r = l_r;
	}



	private String cf;
	private String n;
	private String c;
	private Date d_b;
	private String l_n;
	private String l_r;
	@Override
	public String toString() {
		return "Persona [cf=" + cf + ", n=" + n + ", c=" + c + ", d_b=" + d_b + ", l_n=" + l_n + ", l_r=" + l_r + "]";
	}
}
