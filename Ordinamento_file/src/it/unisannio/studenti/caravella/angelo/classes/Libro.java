package it.unisannio.studenti.caravella.angelo.classes;

import java.text.ParseException;
import java.util.*;

import it.unisannio.studenti.caravella.angelo.utils.Constants;

public class Libro implements Comparable {

	public Libro() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param autore
	 * @param titolo
	 * @param anno
	 */
	public Libro(String autore, String titolo, Date anno) {
		this.autore = autore;
		this.titolo = titolo;
		this.anno = anno;
	}

	public static Libro read(Scanner sc) throws ParseException {

		if (!sc.hasNextLine())
			return null;
		String a = sc.nextLine();

		if (!sc.hasNextLine())
			return null;
		String t = sc.nextLine();

		if (!sc.hasNextLine())
			return null;
		String an = sc.nextLine();

		Date anno = Constants.yyyy.parse(an);

		return new Libro(a, t, anno);
	}

	/**
	 * @return the autore
	 */
	public String getAutore() {
		return autore;
	}

	/**
	 * @param autore the autore to set
	 */
	public void setAutore(String autore) {
		this.autore = autore;
	}

	/**
	 * @return the titolo
	 */
	public String getTitolo() {
		return titolo;
	}

	/**
	 * @param titolo the titolo to set
	 */
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	/**
	 * @return the anno
	 */
	public Date getAnno() {
		return anno;
	}

	/**
	 * @param anno the anno to set
	 */
	public void setAnno(Date anno) {
		this.anno = anno;
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Libro l = null;
		if (o instanceof Libro) {
			l = (Libro) o;
			if (l.getAnno().compareTo(anno) > 0)
				return 1;
			else if (l.getAnno().compareTo(anno) < 0)
				return -1;
			return 0;
		}
		return 0;
	}

	@Override
	public String toString() {
		return "Libro [autore=" + autore + ", titolo=" + titolo + ", anno=" + anno + "]";
	}

	private String autore;
	private String titolo;
	private Date anno;

}
