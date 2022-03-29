package it.unisannio.studenti.caravella.angelo.classes;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

import it.unisannio.studenti.caravella.angelo.utils.Constants;

public class DVD extends PhysicalMedium {

	/**
	 * @param id
	 * @param autore
	 * @param titolo
	 * @param anno_p
	 * @param durata
	 */
	public DVD(String id, String autore, String titolo, Date anno_p, double durata) {
		super(id, autore, titolo, anno_p);
		this.durata = durata;
	}

	/**
	 * @return the durata
	 */
	public double getDurata() {
		return durata;
	}

	/**
	 * @param durata the durata to set
	 */
	public void setDurata(double durata) {
		this.durata = durata;
	}

	public static DVD read(String id, Scanner sc) throws ParseException {



		if (!sc.hasNextLine())
			return null;
		String autore = sc.nextLine().strip();

		if (!sc.hasNextLine())
			return null;
		String titolo = sc.nextLine().strip();

		if (!sc.hasNextLine())
			return null;
		String anno = sc.nextLine();
		Date anno_p = Constants.yyyy.parse(anno);

		if (!sc.hasNextLine())
			return null;
		String n = sc.nextLine();
		Double n_p = Double.parseDouble(n);
		
		return new DVD(id, autore, titolo, anno_p, n_p);

	}

	@Override
	public String toString() {
		return "DVD [durata=" + durata + "]";
	}

	private double durata;

}
