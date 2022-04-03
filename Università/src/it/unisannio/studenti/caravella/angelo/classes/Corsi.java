package it.unisannio.studenti.caravella.angelo.classes;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

import it.unisannio.studenti.caravella.angelo.utils.Constants;

public class Corsi {

	public Corsi() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param c_f
	 * @param c_c
	 * @param n_c
	 * @param c_l
	 * @param descrizione
	 */
	public Corsi(String c_f, String c_c, String n_c, String c_l, String descrizione) {
		this.c_fi = c_f;
		this.co_c = c_c;
		this.no_c = n_c;
		this.c_la = c_l;
		this.descrizione = descrizione;
	}

	public static Corsi Read(Scanner sc) throws ParseException {

		if (!sc.hasNextLine())
			return null;
		String c_f = sc.nextLine();
		if (!sc.hasNextLine())
			return null;
		String c_c = sc.nextLine();
		if (!sc.hasNextLine())
			return null;
		String no_c = sc.nextLine();
		if (!sc.hasNextLine())
			return null;
		String c_l = sc.nextLine();

		if (!sc.hasNextLine())
			return null;
		String d = sc.nextLine();

		return new Corsi(c_f, c_c, no_c, c_l, d);
	}

	/**
	 * @return the c_fi
	 */
	public String getC_fi() {
		return c_fi;
	}

	/**
	 * @param c_fi the c_fi to set
	 */
	public void setC_fi(String c_fi) {
		this.c_fi = c_fi;
	}

	/**
	 * @return the co_c
	 */
	public String getCo_c() {
		return co_c;
	}

	/**
	 * @param co_c the co_c to set
	 */
	public void setCo_c(String co_c) {
		this.co_c = co_c;
	}

	/**
	 * @return the no_c
	 */
	public String getNo_c() {
		return no_c;
	}

	/**
	 * @param no_c the no_c to set
	 */
	public void setNo_c(String no_c) {
		this.no_c = no_c;
	}

	/**
	 * @return the c_la
	 */
	public String getC_la() {
		return c_la;
	}

	/**
	 * @param c_la the c_la to set
	 */
	public void setC_la(String c_la) {
		this.c_la = c_la;
	}

	/**
	 * @return the descrizione
	 */
	public String getDescrizione() {
		return descrizione;
	}

	/**
	 * @param descrizione the descrizione to set
	 */
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	

	@Override
	public String toString() {
		return "Corsi [c_fi=" + c_fi + ", co_c=" + co_c + ", no_c=" + no_c + ", c_la=" + c_la + ", descrizione="
				+ descrizione + "]";
	}


	private String c_fi;
	private String co_c;
	private String no_c;
	private String c_la;
	private String descrizione;

}
