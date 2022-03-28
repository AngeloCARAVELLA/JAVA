package it.unisannio.studenti.caravella.angelo.classes;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import it.unisannio.studenti.caravella.angelo.utils.Constants;

public class Cittadino {

	@Override
	public String toString() {
		return "Cittadino [nome=" + nome + ", cognome=" + cognome + ", data_di_nascita=" + data_di_nascita
				+ ", codice_fiscale=" + codice_fiscale + "]";
	}
	/**
	 * @param nome
	 * @param cognome
	 * @param data_di_nascita
	 * @param codice_fiscale
	 * @param r
	 */
	public Cittadino(String nome, String cognome, Date data_di_nascita, String codice_fiscale, ArrayList<Reddito> r) {
		this.nome = nome;
		this.cognome = cognome;
		this.data_di_nascita = data_di_nascita;
		this.codice_fiscale = codice_fiscale;
		this.r = r;
	}
	/**
	 * @return the r
	 */
	public ArrayList<Reddito> getR() {
		return r;
	}
	/**
	 * @param r the r to set
	 */
	public void setR(ArrayList<Reddito> r) {
		this.r = r;
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
	/**
	 * @return the data_di_nascita
	 */
	public Date getData_di_nascita() {
		return data_di_nascita;
	}
	/**
	 * @param data_di_nascita the data_di_nascita to set
	 */
	public void setData_di_nascita(Date data_di_nascita) {
		this.data_di_nascita = data_di_nascita;
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
	 * @param nome
	 * @param cognome
	 * @param data_di_nascita
	 * @param codice_fiscale
	 */
	public Cittadino(String nome, String cognome, Date data_di_nascita, String codice_fiscale) {
		this.nome = nome;
		this.cognome = cognome;
		this.data_di_nascita = data_di_nascita;
		this.codice_fiscale = codice_fiscale;
		this.r=new ArrayList<Reddito>();
	}
	public Cittadino() {
		// TODO Auto-generated constructor stub
	}

	public static  Cittadino read (Scanner sc) throws ParseException {
		
		if(!sc.hasNextLine())return null;
		String nome= sc.nextLine().strip();
		
		if(!sc.hasNextLine())return null;
		String cognome= sc.nextLine().strip();
		
		if(!sc.hasNextLine())return null;
		String data= sc.nextLine();
		Date data_c= Constants.ssmmaa.parse(data);
		
		if(!sc.hasNextLine())return null;
		String codice_fiscale= sc.nextLine();
		
		return new Cittadino(nome, cognome, data_c, codice_fiscale);
	}
	private String nome; 
	private String cognome; 
	private Date data_di_nascita;
	private String codice_fiscale;
	private ArrayList<Reddito> r;
}
