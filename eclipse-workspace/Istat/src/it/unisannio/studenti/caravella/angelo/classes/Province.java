package it.unisannio.studenti.caravella.angelo.classes;

import java.io.PrintStream;
import java.util.*;

public class Province {

	@Override
	public String toString() {
		return "Province [nome=" + nome + ", scg=" + scg + "]";
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
	 * @return the sc
	 */
	public HashMap<String, ArrayList<Comuni>> getSc() {
		return scg;
	}


	/**
	 * @param sc the sc to set
	 */
	public void setSc(HashMap<String, ArrayList<Comuni>> sc) {
		this.scg = sc;
	}


	public Province(String nome , HashMap <String ,ArrayList< Comuni>> sc) {
		// TODO Auto-generated constructor stub
		this.nome=nome;
		this.scg=sc;
	}

	
	public static Province read(Scanner sc) {
		HashMap <String , ArrayList< Comuni>> scmf= new HashMap <String , ArrayList<Comuni>>();
		ArrayList<Comuni> fr= new ArrayList<Comuni>();

		if(!sc.hasNextLine())return null;
		String nome= sc.nextLine();
		
		if(!sc.hasNextLine())return null;
		String label= sc.nextLine();
		
		if(!sc.hasNextLine())return null;
		label= sc.nextLine();
		
		Comuni cmf= Comuni.read(label , sc);
		
		while (cmf!= null) {
		
			fr.add(cmf);
			label= sc.nextLine();
			cmf= Comuni.read(label ,sc);
		}
		
		scmf.put(nome,fr);
		
		return new Province ( nome, scmf);
	}



	private String nome;
		
	private HashMap <String , ArrayList< Comuni>> scg;
}

