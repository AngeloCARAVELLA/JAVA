package it.unisannio.studenti.caravella.angelo.classes;

import java.text.ParseException;
import java.util.*;

import it.unisannio.studenti.caravella.angelo.utils.Constants;

public class Reddito {

	@Override
	public String toString() {
		return "Reddito [CF=" + CF + ", Anno=" + Anno + ", Reddito=" + Reddito + ", c=" + c + "]";
	}

	/**
	 * @return the cF
	 */
	public String getCF() {
		return CF;
	}

	/**
	 * @param cF the cF to set
	 */
	public void setCF(String cF) {
		CF = cF;
	}

	/**
	 * @return the anno
	 */
	public Date getAnno() {
		return Anno;
	}

	/**
	 * @param anno the anno to set
	 */
	public void setAnno(Date anno) {
		Anno = anno;
	}

	/**
	 * @return the reddito
	 */
	public double getReddito() {
		return Reddito;
	}

	/**
	 * @param reddito the reddito to set
	 */
	public void setReddito(double reddito) {
		Reddito = reddito;
	}

	/**
	 * @return the c
	 */
	public Cittadino getC() {
		return c;
	}

	/**
	 * @param c the c to set
	 */
	public void setC(Cittadino c) {
		this.c = c;
	}

	/**
	 * @param cF
	 * @param anno
	 * @param reddito
	 */
	public Reddito(String cF, Date anno, double reddito) {
		CF = cF;
		Anno = anno;
		Reddito = reddito;
		this.c=null;
	}

	public Reddito() {
		// TODO Auto-generated constructor stub
	}
	
	public static Reddito read(Scanner sc) throws ParseException {

		if (!sc.hasNextLine())
			return null;
		String CF= sc.nextLine();

	
		if (!sc.hasNextLine())
			return null;
		String data = sc.nextLine();
		Date data_r = Constants.aa.parse(data);

		if (!sc.hasNextLine())
			return null;
		String reddito = sc.nextLine();
		Double r= Double.parseDouble(reddito);
		
		return new Reddito(CF, data_r, r);
	}
	private String CF;
	private Date Anno;
	private double Reddito;
	private Cittadino c; 
}
