package it.unisannio.studenti.caravella.angelo.classes;

import java.text.ParseException;
import java.util.*;

import it.unisannio.studenti.caravella.angelo.utils.CompareTreeSet;

public class Gestore {

	public Gestore(Scanner sc) throws ParseException {
		// TODO Auto-generated constructor stub
		this.mu = new TreeMap<String, Utente>();

		Utente u = Utente.read(sc);

		while (u != null) {

			this.mu.put(u.getCodice(), u);
			u = Utente.read(sc);
		}
		Set<String> keys = this.mu.keySet();
		this.tu = new TreeSet<Utente>(c);
		/*
		 * this.mu.entrySet().forEach(e->{
		 * 
		 * System.out.println(e.getKey()+ " " + e.getValue()); });
		 */
		for (String s : keys) {

			this.tu.add(this.mu.get(s));
		}

		for (Utente ut : this.tu) {

			System.out.println(ut.toString());
		}
	}

	private Map<String, Utente> mu;
	Comparator<Utente> c = new CompareTreeSet();
	private Set<Utente> tu;

}
