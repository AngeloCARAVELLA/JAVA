package it.unisannio.studenti.caravella.angelo.classes;

import java.text.ParseException;
import java.util.ArrayList;

import java.util.Scanner;

public class Clienti {

	
	
	@Override
	public String toString() {
		return "Clienti [codice_fiscale=" + codice_fiscale + ", nome=" + nome + ", cognome=" + cognome + ", indirizzi="
				+ indirizzi + ", a=" + a + "]";
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

	/**
	 * @return the indirizzi
	 */
	public ArrayList<String> getIndirizzi() {
		return indirizzi;
	}

	/**
	 * @param indirizzi the indirizzi to set
	 */
	public void setIndirizzi(ArrayList<String> indirizzi) {
		this.indirizzi = indirizzi;
	}

	/**
	 * @return the a
	 */
	public Acquisti getA() {
		return a;
	}

	/**
	 * @param a the a to set
	 */
	public void setA(Acquisti a) {
		this.a = a;
	}

	/**
	 * @param codice_fiscale
	 * @param nome
	 * @param cognome
	 * @param indirizzi
	 * @param a
	 */
	public Clienti(String codice_fiscale, String nome, String cognome, ArrayList<String> indirizzi) {
		this.codice_fiscale = codice_fiscale;
		this.nome = nome;
		this.cognome = cognome;
		this.indirizzi = indirizzi;
		
	}

	public static Clienti read(Scanner sc) throws ParseException {
		if(!sc.hasNextLine())return null; 
		String codice_fiscale= sc.nextLine();
		
		if(!sc.hasNextLine())return null; 
		String nome= sc.nextLine();
		
		if(!sc.hasNextLine())return null; 
		String cognome= sc.nextLine();
		
		if(!sc.hasNextLine())return null; 
		String via= sc.nextLine();
		
		if(!sc.hasNextLine())return null; 
		String Città= sc.nextLine();
		
		ArrayList<String> indirizzi= new ArrayList<String>();
	
		indirizzi.add(via);
		indirizzi.add(Città);
		
		return new Clienti(codice_fiscale, nome, cognome, indirizzi);
	}
	
	
	public static Clienti read() throws ParseException {
		
		
		Scanner sc= new Scanner (System.in);
		
		String codice_fiscale= sc.nextLine();
		if(codice_fiscale.equals(""))return null;
		
		
		String nome= sc.nextLine();
		if(nome.equals(""))return null;
		
		String cognome= sc.nextLine();
		if(cognome.equals(""))return null;
		
		
		String via= sc.nextLine();
		if(via.equals(""))return null;
		
		String Città= sc.nextLine();
		if(Città.equals(""))return null;
		
		ArrayList<String> indirizzi= new ArrayList<String>();
	
		indirizzi.add(via);
		indirizzi.add(Città);
		
		return new Clienti(codice_fiscale, nome, cognome, indirizzi);
	}
		
		
	public Clienti() {
		// TODO Auto-generated constructor stub
	}

	
	private String codice_fiscale;
	private String nome;
	private String cognome;
	private ArrayList<String> indirizzi; 
	private Acquisti a;
	
}
