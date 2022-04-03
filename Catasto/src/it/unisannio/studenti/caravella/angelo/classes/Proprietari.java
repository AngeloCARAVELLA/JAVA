package it.unisannio.studenti.caravella.angelo.classes;
import java.text.ParseException;
import java.util.*;

import it.unisannio.studenti.caravella.angelo.utils.Constants;


public class Proprietari {

	
	/**
	 * @param cod_fisc
	 * @param cognome
	 * @param nome
	 * @param data_n
	 * @param luogo
	 */
	public Proprietari(String cod_fisc, String cognome, String nome, Date data_n, String luogo) {
		this.cod_fisc = cod_fisc;
		this.cognome = cognome;
		this.nome = nome;
		this.data_n = data_n;
		this.luogo = luogo;
	}
	
	
	/**
	 * @return the cod_fisc
	 */
	public String getCod_fisc() {
		return cod_fisc;
	}


	/**
	 * @param cod_fisc the cod_fisc to set
	 */
	public void setCod_fisc(String cod_fisc) {
		this.cod_fisc = cod_fisc;
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
	 * @return the data_n
	 */
	public Date getData_n() {
		return data_n;
	}


	/**
	 * @param data_n the data_n to set
	 */
	public void setData_n(Date data_n) {
		this.data_n = data_n;
	}


	/**
	 * @return the luogo
	 */
	public String getLuogo() {
		return luogo;
	}


	/**
	 * @param luogo the luogo to set
	 */
	public void setLuogo(String luogo) {
		this.luogo = luogo;
	}


	public static Proprietari read (Scanner sc) throws ParseException {
		
		if(!sc.hasNextLine())return null;
		String c= sc.nextLine();
		
		if(!sc.hasNextLine())return null;
		String co= sc.nextLine();
		
		if(!sc.hasNextLine())return null;
		String n= sc.nextLine();
		
		if(!sc.hasNextLine())return null;
		String d= sc.nextLine();
		Date da= Constants.ssMMyyyy.parse(d);
		
		if(!sc.hasNextLine())return null;
		String l= sc.nextLine();
		
		return new Proprietari(c, co , n, da, l);
	}
	private String cod_fisc;
	private String cognome;
	private String nome;
	private Date data_n;
	private String luogo;
	
}
