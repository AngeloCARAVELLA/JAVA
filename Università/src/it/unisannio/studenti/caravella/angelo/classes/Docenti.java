package it.unisannio.studenti.caravella.angelo.classes;

import java.text.ParseException;
import java.util.*;

import it.unisannio.studenti.caravella.angelo.utils.Constants;

public class Docenti {

	public Docenti() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param c_f
	 * @param n
	 * @param c
	 * @param d_n
	 * @param fascia
	 * @param ra
	 */
	public Docenti(String c_f, String n, String c, Date d_n, String fascia, String ra) {
		this.c_f = c_f;
		this.n = n;
		this.c = c;
		this.d_n = d_n;
		this.fascia = fascia;
		this.ra = ra;
	}

	public static Docenti Read(Scanner sc) throws ParseException {

		if (!sc.hasNextLine())
			return null;
		String c_f = sc.nextLine();

		if (!sc.hasNextLine())
			return null;
		String n = sc.nextLine();

		if (!sc.hasNextLine())
			return null;
		String c = sc.nextLine();

		if (!sc.hasNextLine())
			return null;
		String d = sc.nextLine();

		Date d_n = Constants.ssMMyyyy.parse(d);

		if (!sc.hasNextLine())
			return null;
		String fascia = sc.nextLine();

		if (!sc.hasNextLine())
			return null;
		String ra = sc.nextLine();

		return new Docenti(c_f, n, c, d_n, fascia, ra);
	}

	/**
	 * @return the c_f
	 */
	public String getC_f() {
		return c_f;
	}

	/**
	 * @param c_f the c_f to set
	 */
	public void setC_f(String c_f) {
		this.c_f = c_f;
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
	 * @return the d_n
	 */
	public Date getD_n() {
		return d_n;
	}

	/**
	 * @param d_n the d_n to set
	 */
	public void setD_n(Date d_n) {
		this.d_n = d_n;
	}

	/**
	 * @return the fascia
	 */
	public String getFascia() {
		return fascia;
	}

	/**
	 * @param fascia the fascia to set
	 */
	public void setFascia(String fascia) {
		this.fascia = fascia;
	}

	/**
	 * @return the ra
	 */
	public String getRa() {
		return ra;
	}

	/**
	 * @param ra the ra to set
	 */
	public void setRa(String ra) {
		this.ra = ra;
	}

	
	@Override
	public String toString() {
		return "Docenti [c_f=" + c_f + ", n=" + n + ", c=" + c + ", d_n=" + d_n + ", fascia=" + fascia + ", ra=" + ra
				+ "]";
	}


	private String c_f;
	private String n;
	private String c;
	private Date d_n;
	private String fascia;
	private String ra;
}
