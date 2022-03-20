package it.unisannio.studenti.caravella.angelo.classes;

import java.text.ParseException;
import java.util.*;
import it.unisannio.studenti.caravella.angelo.utils.Constants;

public class Acquisti {


	
	/**
	 * @return the pr
	 */
	public HashMap<String, Prodotti> getPr() {
		return pr;
	}

	/**
	 * @param pr the pr to set
	 */
	public void setPr(HashMap<String, Prodotti> pr) {
		this.pr = pr;
	}

	public static Acquisti read(Scanner sc) throws ParseException {
		
		HashMap <String , Prodotti >prod= new HashMap <String , Prodotti >();
		if(!sc.hasNextLine())return null; 
		String id= sc.nextLine();
		
		if(!sc.hasNextLine())return null; 
		String data_s= sc.nextLine();
		
		Date data= Constants.ggmmyy.parse(data_s);
		
		if(!sc.hasNextLine())return null; 
		String codice_fiscale= sc.nextLine();
		
		
		if(!sc.hasNextLine())return null; 
		String label= sc.nextLine();
		
		Prodotti pr= Prodotti.read(label, sc);
		
		while( pr!= null) {
			label= sc.nextLine();
			prod.put(codice_fiscale, pr);
			pr= Prodotti.read(label,sc);
		}
		
		
		return new Acquisti(id, data, codice_fiscale, prod); 
		
	}
	
	public void printpr() {
		
		for ( Map.Entry<String, Prodotti> pop: this.pr.entrySet()) {
			
			System.out.println(pop.getKey()+ " " +pop.getValue() );
		}
		
	}
	/**
	 * 
	 * @param id
	 * @param data
	 * @param codice_fiscale
	 * @param p
	 */
	public Acquisti(String id, Date data, String codice_fiscale,HashMap <String , Prodotti > prod) {
		this.id = id;
		this.data = data;
		this.codice_fiscale = codice_fiscale;
		this.pr=prod;
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
	 * @return the data
	 */
	public Date getData() {
		return data;
	}
	/**
	 * @param data the data to set
	 */
	public void setData(Date data) {
		this.data = data;
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
	
	private String id; 
	private Date data;
	private String codice_fiscale;
	private HashMap <String , Prodotti> pr; 
}
