package it.unisannio.studenti.caravella.angelo.classes;

import java.text.ParseException;
import java.util.*;

import it.unisannio.studenti.caravella.angelo.utils.Constants;

public class Utente implements Comparable {

	public Utente() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param nome
	 * @param cognome
	 * @param data_di_nascita
	 */
	public Utente(String codice, String nome, String cognome, Date data_di_nascita) {
		this.codice=codice;
		Nome = nome;
		Cognome = cognome;
		Data_di_nascita = data_di_nascita;
	}

	public static Utente read(Scanner sc) throws ParseException {
		
		if (!sc.hasNextLine())
			return null;
		String co = sc.nextLine();


		if (!sc.hasNextLine())
			return null;
		String n = sc.nextLine();

		if (!sc.hasNextLine())
			return null;
		String c = sc.nextLine();

		if (!sc.hasNextLine())
			return null;
		String D = sc.nextLine();

		Date d = Constants.ssMMyyyy.parse(D);

		return new Utente(co, n, c, d);
	}
	
	/**
	 * @return the codice
	 */
	public String getCodice() {
		return codice;
	}

	/**
	 * @param codice the codice to set
	 */
	public void setCodice(String codice) {
		this.codice = codice;
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return Nome;
	}

	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		Nome = nome;
	}

	/**
	 * @return the cognome
	 */
	public String getCognome() {
		return Cognome;
	}

	/**
	 * @param cognome the cognome to set
	 */
	public void setCognome(String cognome) {
		Cognome = cognome;
	}

	/**
	 * @return the data_di_nascita
	 */
	public Date getData_di_nascita() {
		return Data_di_nascita;
	}

	/**
	 * @param data_di_nascita the data_di_nascita to set
	 */
	public void setData_di_nascita(Date data_di_nascita) {
		Data_di_nascita = data_di_nascita;
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Utente u = null;

		if (o instanceof Utente) {

			u = (Utente) o;
			
		
			
			if( u.getCodice().compareTo(codice)> 0)
				return 1;
			else if ( u.getCodice().compareTo(codice)<0)
				return -1;
			return 0;
			
			
		}

		return 0;
	}
	
	@Override
	public String toString() {
		return "Utente [codice=" + codice + ", Nome=" + Nome + ", Cognome=" + Cognome + ", Data_di_nascita="
				+ Data_di_nascita + "]";
	}

	private String codice;
	private String Nome;
	private String Cognome;
	private Date Data_di_nascita;

}
