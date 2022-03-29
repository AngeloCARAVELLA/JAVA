package it.unisannio.studenti.caravella.angelo.classes;

import java.util.*;

public abstract class PhysicalMedium {

	/**
	 * @param id
	 * @param autore
	 * @param titolo
	 * @param anno_p
	 */
	public PhysicalMedium(String id, String autore, String titolo, Date anno_p) {
		this.id = id;
		this.autore = autore;
		this.titolo = titolo;
		this.anno_p = anno_p;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
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
	 * @return the anno_p
	 */
	public Date getAnno_p() {
		return anno_p;
	}

	/**
	 * @param anno_p the anno_p to set
	 */
	public void setAnno_p(Date anno_p) {
		this.anno_p = anno_p;
	}

	@Override
	public String toString() {
		return "PhysicalMedium [id=" + id + ", autore=" + autore + ", titolo=" + titolo + ", anno_p=" + anno_p + "]";
	}

	private String id;
	private String autore;
	private String titolo;
	private Date anno_p;

}
