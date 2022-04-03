package it.unisannio.studenti.caravella.angelo.classes;

import java.util.*;

public class Regione {

	public Regione(String nome, String posizione, LinkedList<String> pr) {
		super();
		this.nome = nome;
		this.posizione = posizione;
		this.pr = pr;
	}

	public static Regione read(Scanner sc) {
		LinkedList<String> po = new LinkedList<String>();

		if (!sc.hasNextLine())
			return null;
		String nome = sc.nextLine();

		if (!sc.hasNextLine())
			return null;
		String pos = sc.nextLine();

		if (!sc.hasNextLine())
			return null;
		String label = sc.nextLine();

		if (!sc.hasNextLine())
			return null;
		String inf = sc.nextLine();
		po.add(inf);

		do {

			if (!sc.hasNextLine())
				return null;
			inf = sc.nextLine();
			if (inf.equals("#"))
				break;
			else
				po.add(inf);

		} while (inf != null);

		return new Regione(nome, pos, po);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPosizione() {
		return posizione;
	}

	public void setPosizione(String posizione) {
		this.posizione = posizione;
	}

	public LinkedList<String> getPr() {
		return pr;
	}

	public void setPr(LinkedList<String> pr) {
		this.pr = pr;
	}

	private String nome;
	private String posizione;
	private LinkedList<String> pr;

}
