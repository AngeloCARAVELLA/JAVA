package it.unisannio.studenti.unisannio.caravella.angelo.utils;

import it.unisannio.studenti.unisannio.caravella.angelo.classes.Votante;

public class TesterAge implements Tester {

	public TesterAge(String[] age) {
		// TODO Auto-generated constructor stub
		this.age = age;
	}

	private String[] age;

	@Override
	public int VerifyAt(Object o) {
		// TODO Auto-generated method stub
		Votante l = null;
		int i = 0;
		if (o instanceof Votante) {
			l = (Votante) o;
			for (String r : age) {
				i++;
				if (l.getFascia_età().equals(r))

					return i;
			}
		}
		return 0;
	}

}
