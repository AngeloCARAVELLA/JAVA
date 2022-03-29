package it.unisannio.studenti.caravella.angelo.classes;

import java.util.Scanner;

public class User {


	/**
	 * @param codice_fiscale
	 * @param nome
	 * @param cognome
	 */
	public User(String codice_fiscale, String nome, String cognome) {
		this.codice_fiscale = codice_fiscale;
		this.nome = nome;
		this.cognome = cognome;
	}
	
	
	
	
	/**
	 * @return the codice_fiscale
	 */
	public String getCodice_fiscale() {
		return codice_fiscale;
	}




	/**
	 * @param codice_fiscale the codice_fiscale to set
	 */
	public void setCodice_fiscale(String codice_fiscale) {
		this.codice_fiscale = codice_fiscale;
	}




	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}




	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}




	/**
	 * @return the cognome
	 */
	public String getCognome() {
		return cognome;
	}




	/**
	 * @param cognome the cognome to set
	 */
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}




	@Override
	public String toString() {
		return "User [codice_fiscale=" + codice_fiscale + ", nome=" + nome + ", cognome=" + cognome + "]";
	}
	
	
	public static User read(Scanner sc) {
		
		if(!sc.hasNextLine())return null;
		String cf=sc.nextLine();
		
		if(!sc.hasNextLine())return null;
		String n=sc.nextLine();
		
		if(!sc.hasNextLine())return null;
		String c=sc.nextLine();
		
		return new User (cf, n, c);
	}
	
	
	private String codice_fiscale;
	private String nome; 
	private String cognome;
}
