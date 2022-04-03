package it.unisannio.studenti.caravella.angelo.utils;

import it.unisannio.studenti.caravella.angelo.classes.Docenti;

public class Docenti_Tester implements Tester {

	public Docenti_Tester() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param n
	 * @param c
	 */
	public Docenti_Tester(String n, String c) {
		this.n = n;
		this.c = c;
	}

	@Override
	public boolean Verify(Object o) {
		// TODO Auto-generated method stub

		Docenti d = null;
		if (o instanceof Docenti) {

			d = (Docenti) o;
			if (d.getN().equals(n) && d.getC().equals(c))
				return true;
		}
		return false;
	}

	private String n, c;

}
