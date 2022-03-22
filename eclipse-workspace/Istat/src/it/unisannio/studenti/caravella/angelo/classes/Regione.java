package it.unisannio.studenti.caravella.angelo.classes;

import java.io.PrintStream;
import java.util.*;

public class Regione{





	@Override
	public String toString() {
		return "Regione [nome=" + nome + ", posizione=" + posizione + ", sp=" + sp + "]";
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
	 * @return the posizione
	 */
	public String getPosizione() {
		return posizione;
	}





	/**
	 * @param posizione the posizione to set
	 */
	public void setPosizione(String posizione) {
		this.posizione = posizione;
	}





	/**
	 * @return the sp
	 */
	public HashMap<String, ArrayList<String>> getSp() {
		return sp;
	}





	/**
	 * @param sp the sp to set
	 */
	public void setSp(HashMap<String, ArrayList<String>> sp) {
		this.sp = sp;
	}





	public Regione(String nome , String posizione, HashMap <String, ArrayList<String>> sp) {
		// TODO Auto-generated constructor stub
		this.nome=nome;
		this.posizione=posizione;
		this.sp=sp;
	}

	


	
	public static Regione read(Scanner sc) {
		// TODO Auto-generated method stub
		String  label=null;
		String nome_p=null;
		ArrayList<String> strp= new ArrayList<String>();
		
		if(!sc.hasNextLine())return null;
		String  nome= sc.nextLine();
		
		if(!sc.hasNextLine())return null;
		String  posizione= sc.nextLine();
		
		label= sc.nextLine();
		
		do {
			if(!sc.hasNextLine())return null;
			nome_p= sc.nextLine();
			if(!nome_p.equals("#"))
				strp.add(nome_p);
		}
		while( !nome_p.equals("#"));
			
		HashMap <String  , ArrayList<String>> sw= new HashMap <String  , ArrayList<String>>();
		sw.put(nome, strp);
		
		return new Regione( nome, posizione, sw);
		
	}




	
	private String nome;
	private String posizione;
	private HashMap <String, ArrayList<String>> sp;
}
