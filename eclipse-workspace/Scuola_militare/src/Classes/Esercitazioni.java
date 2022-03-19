package Classes;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Esercitazioni  {

	/**
	 * @param id
	 * @param denominazione
	 * @param data_iniziale
	 * @param st2
	 */

	public Esercitazioni() {
		// TODO Auto-generated constructor stub
	}


	public Esercitazioni(String id2, String denominazione, String data_inizio, String data_fine,
			String nome_campo, ArrayList<String> st) {
		// TODO Auto-generated constructor stub
		this.id=id2;
		this.denominazione=denominazione;
		this.data_iniziale=data_inizio;
		this.data_finale=data_fine;
		this.nome_campo=nome_campo;
		this.st=st;
	}

	@Override
	public String toString() {
		return "Esercitazioni [id=" + id + ", denominazione=" + denominazione + ", data_iniziale=" + data_iniziale
				+ ", data_finale=" + data_finale + ", nome_campo=" + nome_campo + ", st=" + st + "]";
	}


	/**
	 * @return the st
	 */
	public ArrayList<String> getSt() {
		return st;
	}


	/**
	 * @param st the st to set
	 */
	public void setSt(ArrayList<String> st) {
		this.st = st;
	}


	public static  String read_(String nome) {
		if(nome.equals("")|| nome.equals("#"))return null;

		return nome;

	}


	public static Esercitazioni read(Scanner sc1) {

		ArrayList<String> st =new ArrayList<String>();

		if( !sc1.hasNextLine())return null;
		String id= 	sc1.nextLine();

		if( !sc1.hasNextLine())return null;
		String denominazione= 	sc1.nextLine();

		if( !sc1.hasNextLine())return null;
		String data_inizio= 	sc1.nextLine();

		if( !sc1.hasNextLine())return null;
		String data_fine= 	sc1.nextLine();


		if(!sc1.hasNextLine()) return null;
		String nome_campo=sc1.nextLine();

		if(!sc1.hasNextLine())return null;
		String attre= sc1.nextLine();

		String attrezzature= Iscritto.read__( attre);
		while(attrezzature != null)
		{
			st.add(attre);
			attre= sc1.nextLine();		
			attrezzature= Iscritto.read__( attre);
		}

		return new Esercitazioni( id,denominazione,  data_inizio, data_fine, nome_campo , st);

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
	 * @return the denominazione
	 */
	public String getDenominazione() {
		return denominazione;
	}
	/**
	 * @return the nome_campo
	 */
	public String getNome_campo() {
		return nome_campo;
	}


	/**
	 * @param nome_campo the nome_campo to set
	 */
	public void setNome_campo(String nome_campo) {
		this.nome_campo = nome_campo;
	}





	/**
	 * @param denominazione the denominazione to set
	 */
	public void setDenominazione(String denominazione) {
		this.denominazione = denominazione;
	}
	/**
	 * @return the data_iniziale
	 */
	public String getData_iniziale() {
		return data_iniziale;
	}
	/**
	 * @param data_iniziale the data_iniziale to set
	 */
	public void setData_iniziale(String data_iniziale) {
		this.data_iniziale = data_iniziale;
	}
	/**
	 * @return the data_finale
	 */
	public String getData_finale() {
		return data_finale;
	}
	/**
	 * @param data_finale the data_finale to set
	 */
	public void setData_finale(String data_finale) {
		this.data_finale = data_finale;
	}
	private String id; 
	private String denominazione; 
	private String data_iniziale;
	private String data_finale;
	private String nome_campo;
	private ArrayList <String> st ;

}
