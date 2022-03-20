package it.unisannio.studenti.caravella.angelo.classes;

import java.util.Scanner;

public class Opera {

	public static Opera read(Scanner sc) {
	
		int arm, sca, op;
		
		if(!sc.hasNextLine())return null;
		String nome=sc.nextLine().strip();
		
		if(!sc.hasNextLine())return null;
		String armadio=sc.nextLine();
		arm = Integer.parseInt(armadio);

		if(!sc.hasNextLine())return null;
		String scaffale=sc.nextLine();
		sca= Integer.parseInt(scaffale);
		
		if(!sc.hasNextLine())return null;
		String Opera=sc.nextLine();
		op= Integer.parseInt(Opera);
		
	return new Opera( nome, arm, sca, op);
	}
	
	@Override
	public String toString() {
		return "Opera [nome_stanza=" + nome_stanza + ", armadio=" + armadio + ", scaffale=" + scaffale + ", Opera="
				+ Opera + "]";
	}

	private String nome_stanza;
	private int armadio;
	private int scaffale; 
	private int Opera;
	/**
	 * @param nome_stanza
	 * @param armadio
	 * @param scaffale
	 * @param opera
	 */
	public Opera(String nome_stanza, int armadio, int scaffale, int opera) {
		super();
		this.nome_stanza = nome_stanza;
		this.armadio = armadio;
		this.scaffale = scaffale;
		this.Opera = opera;
	}
	/**
	 * @return the nome_stanza
	 */
	public String getNome_stanza() {
		return nome_stanza;
	}
	/**
	 * @param nome_stanza the nome_stanza to set
	 */
	public void setNome_stanza(String nome_stanza) {
		this.nome_stanza = nome_stanza;
	}
	/**
	 * @return the armadio
	 */
	public int getArmadio() {
		return armadio;
	}
	/**
	 * @param armadio the armadio to set
	 */
	public void setArmadio(int armadio) {
		this.armadio = armadio;
	}
	/**
	 * @return the scaffale
	 */
	public int getScaffale() {
		return scaffale;
	}
	/**
	 * @param scaffale the scaffale to set
	 */
	public void setScaffale(int scaffale) {
		this.scaffale = scaffale;
	}
	/**
	 * @return the opera
	 */
	public int getOpera() {
		return Opera;
	}
	/**
	 * @param opera the opera to set
	 */
	public void setOpera(int opera) {
		this.Opera = opera;
	}
}
