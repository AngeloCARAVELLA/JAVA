package it.unisannio.studenti.caravella.angelo.classes;

import java.util.*;

public class Province {

	public Province(String nome, LinkedList<String> co) {
		super();
		this.nome = nome;
		this.co = co;
	}

	public static Province read(Scanner sc) {
		LinkedList<String> co = new LinkedList<String>();

		if (!sc.hasNextLine())
			return null;
		String nome = sc.nextLine();

		String label = sc.nextLine();
		if (!sc.hasNextLine())
			return null;
		String inf = sc.nextLine();
		co.add(inf);
		if (!sc.hasNextLine())
			return null;
		inf = sc.nextLine();
		co.add(inf);
		if (!sc.hasNextLine())
			return null;
		inf = sc.nextLine();
		co.add(inf);

		do {

			if (!sc.hasNextLine())
				return null;
			inf = sc.nextLine();
			if (inf.equals("#"))
				break;
			else
				co.add(inf);
			if (!sc.hasNextLine())
				return null;
			inf = sc.nextLine();
			co.add(inf);
			if (!sc.hasNextLine())
				return null;
			inf = sc.nextLine();
			co.add(inf);

		} while (inf != null);

		return new Province(nome, co);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LinkedList<String> getCo() {
		return co;
	}

	public void setCo(LinkedList<String> co) {
		this.co = co;
	}

	private String nome;
	private LinkedList<String> co;
}
