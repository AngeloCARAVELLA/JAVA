package Classes;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Iscritto {
	/**
	 * @param matricola
	 * @param nome
	 * @param cognome
	 */

	public Iscritto(String matricola, String nome, String cognome) {

		this.matricola = matricola;
		this.nome = nome;
		this.cognome = cognome;
	}

	public Iscritto(String matricola, String nome, String cognome, ArrayList<String> arrid) {
		// TODO Auto-generated constructor stub

		this.matricola = matricola;
		this.nome = nome;
		this.cognome = cognome;
		this.es=arrid;
	}

	public static Iscritto read(Scanner sc2) {

		ArrayList<String> arrid=new ArrayList<String>();

		if( !sc2.hasNextLine())return null;
		String matricola= 	sc2.nextLine();


		if( !sc2.hasNextLine())return null;
		String nome= 	sc2.nextLine();

		if( !sc2.hasNextLine())return null;
		String cognome= 	sc2.nextLine();

		if( !sc2.hasNextLine())return null;
		String id= sc2.nextLine();

		String es= Esercitazioni.read_(id);
		while(es!= null) {

			arrid.add(id);
			id= sc2.nextLine();
			es=Esercitazioni.read_(id);	

		}


		return new Iscritto(matricola , nome  , cognome, arrid);

	}
	
		
	public static  String read__(String attrezzatura) {
		if(attrezzatura.equals("")|| attrezzatura.equals("#"))return null;


		return attrezzatura;

	}
	
	
	public void print (BufferedWriter out) throws IOException {
		out.write(matricola);
		out.write(nome);
		out.write(cognome);
		for (int i =0; i< es.size(); i++) {
			
			out.write(es.get(i));;
			
		}
	
	}

	@Override
	public String toString() {
		return "Iscritto [matricola=" + matricola + ", nome=" + nome + ", cognome=" + cognome + ", es=" + es + "]";
	}

	/**
	 * @return the es
	 */
	public ArrayList<String> getEs() {
		return es;
	}

	/**
	 * @param es the es to set
	 */
	public void setEs(ArrayList<String> es) {
		this.es = es;
	}

	/**
	 * @return the matricola
	 */
	public String getMatricola() {
		return matricola;
	}
	/**
	 * @param matricola the matricola to set
	 */
	public void setMatricola(String matricola) {
		this.matricola = matricola;
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

	private String matricola; 
	private String nome; 
	private String cognome;
	private ArrayList<String>es; 
}
