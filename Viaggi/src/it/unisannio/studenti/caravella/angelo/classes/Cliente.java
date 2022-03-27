package it.unisannio.studenti.caravella.angelo.classes;

import java.util.*;

public class Cliente {

	public Cliente() {

	}

	public Cliente(String codice_fiscale) {
		super();
		Codice_fiscale = codice_fiscale;
	}

	public Cliente(String codice_fiscale, String nome, String cognome) {
		super();
		Codice_fiscale = codice_fiscale;
		this.nome = nome;
		this.cognome = cognome;
	}

	public static Cliente read(Scanner sc) {

		if (!sc.hasNextLine())
			return null;
		String c = sc.nextLine();

		if (!sc.hasNextLine())
			return null;
		String n = sc.nextLine();

		if (!sc.hasNextLine())
			return null;
		String co = sc.nextLine();

		return new Cliente(c, n, co);
	}

	public static Cliente read() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Please insert the fiscal code");
		String c = sc.nextLine();
		if (c.equals(""))
			return null;

		System.out.println("Please insert the name");
		String n = sc.nextLine();
		if (n.equals(""))
			return null;

		System.out.println("Please insert the surname");
		String co = sc.nextLine();
		if (co.equals(""))
			return null;
		return new Cliente(c, n, co);
	}

	public static Cliente read_cl(String c) {

		if (c.equals("") || c.equals("#"))
			return null;
		return new Cliente(c);
	}

	@Override
	public String toString() {
		return "Cliente [Codice_fiscale=" + Codice_fiscale + ", nome=" + nome + ", cognome=" + cognome + "]";
	}

	public String getCodice_fiscale() {
		return Codice_fiscale;
	}

	public void setCodice_fiscale(String codice_fiscale) {
		Codice_fiscale = codice_fiscale;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	private String Codice_fiscale;
	private String nome;
	private String cognome;

}
