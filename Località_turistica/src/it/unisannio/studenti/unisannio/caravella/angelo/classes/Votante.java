package it.unisannio.studenti.unisannio.caravella.angelo.classes;

import java.io.PrintStream;

import java.util.Scanner;

public class Votante {

	@Override
	public String toString() {
		return "Votante [sesso=" + sesso + ", voto=" + voto + ", fascia_età=" + fascia_età + ", località=" + località
				+ ", funzionalità=" + funzionalità + ", nazionalità=" + nazionalità + "]";
	}

	/**
	 * @return the l
	 */
	public Località getL() {
		return l;
	}

	/**
	 * @param l the l to set
	 */
	public void setL(Località l) {
		this.l = l;
	}

	/**
	 * @return the nazionalità
	 */
	public String getNazionalità() {
		return nazionalità;
	}

	/**
	 * @param nazionalità the nazionalità to set
	 */
	public void setNazionalità(String nazionalità) {
		this.nazionalità = nazionalità;
	}

	/**
	 * @return the sesso
	 */
	public String getSesso() {
		return sesso;
	}

	/**
	 * @param sesso the sesso to set
	 */
	public void setSesso(String sesso) {
		this.sesso = sesso;
	}

	/**
	 * @return the voto
	 */
	public double getVoto() {
		return voto;
	}

	/**
	 * @param voto the voto to set
	 */
	public void setVoto(double voto) {
		this.voto = voto;
	}

	/**
	 * @return the fascia_età
	 */
	public String getFascia_età() {
		return fascia_età;
	}

	/**
	 * @param fascia_età the fascia_età to set
	 */
	public void setFascia_età(String fascia_età) {
		this.fascia_età = fascia_età;
	}

	/**
	 * @return the località
	 */
	public String getLocalità() {
		return località;
	}

	/**
	 * @param località the località to set
	 */
	public void setLocalità(String località) {
		this.località = località;
	}

	/**
	 * @return the funzionalità
	 */
	public String getFunzionalità() {
		return funzionalità;
	}

	/**
	 * @param funzionalità the funzionalità to set
	 */
	public void setFunzionalità(String funzionalità) {
		this.funzionalità = funzionalità;
	}

	/**
	 * @param sesso
	 * @param voto
	 * @param fascia_età
	 * @param località
	 * @param funzionalità
	 */
	public Votante(String sesso, double voto, String fascia_età, String località, String funzionalità,
			String nazionalità) {
		this.sesso = sesso;
		this.voto = voto;
		this.fascia_età = fascia_età;
		this.località = località;
		this.funzionalità = funzionalità;
		this.nazionalità = nazionalità;
		this.l = null;
	}

	public Votante() {
		// TODO Auto-generated constructor stub
	}

	public static Votante read() {
		Scanner sc = new Scanner(System.in);
		String genere = null;
		String fascia_età = null;
		do {
			System.out.println("Please insert the gender( M or F)");
			genere = sc.nextLine();
			if (genere.equals(""))
				return null;

			if (!genere.equals("M") && !genere.equals("F"))
				System.err.println("It should be of type (M or F)");

		} while (!genere.equals("M") && !genere.equals("F"));
		System.out.println("Please insert the mark");
		String voto = sc.nextLine();
		Double voto_v = Double.parseDouble(voto);

		System.out.println("Please insert the age " + "<20 " + "21-35 " + "36-50 " + ">50");
		do {
			fascia_età = sc.nextLine();
			if (fascia_età.equals(""))
				return null;
			if (!fascia_età.equals("<20") && !fascia_età.equals("21-35") && !fascia_età.equals("36-50")
					&& !fascia_età.equals(">50"))
				System.err.println("Please insert the age like that " + "<20 " + "21-35 " + "36-50 " + ">50");

		} while (!fascia_età.equals("<20") && !fascia_età.equals("21-35") && !fascia_età.equals("36-50")
				&& !fascia_età.equals(">50"));

		System.out.println("Please insert the place");
		String località = sc.nextLine();
		if (località.equals(""))
			return null;

		System.out.println("Please insert the functionality");
		System.out.println("These are the possible features:");
		System.out.println("-Insert");
		System.out.println("-View");
		System.out.println("-Record");

		String funzionalità = sc.nextLine();
		if (funzionalità.equals(""))
			return null;
		System.out.println("Please insert the nationality");
		String nazionalità = sc.nextLine();
		if (nazionalità.equals(""))
			return null;

		return new Votante(genere, voto_v, fascia_età, località, funzionalità, nazionalità);

	}

	public void printMark(PrintStream ps) {

		ps.println(voto);
	}

	public void printAll(PrintStream ps) {
		ps.println(sesso);
		ps.println(voto);
		ps.println(fascia_età);
		ps.println(località);
		ps.println(funzionalità);
		ps.println(nazionalità);

	}

	private String sesso;
	private double voto;
	private String fascia_età;
	private String località;
	private String funzionalità;
	private String nazionalità;
	private Località l;
}
