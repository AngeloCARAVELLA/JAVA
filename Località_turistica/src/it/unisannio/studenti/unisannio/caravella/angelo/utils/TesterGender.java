package it.unisannio.studenti.unisannio.caravella.angelo.utils;

import it.unisannio.studenti.unisannio.caravella.angelo.classes.Votante;

public class TesterGender implements Tester {

	public TesterGender(String[] gender) {
		// TODO Auto-generated constructor stub
		this.gender = gender;
	}

	public int VerifyAt(Object o) {
		// TODO Auto-generated method stub
		Votante l = null;
		if (o instanceof Votante) {
			l = (Votante) o;
			int i = 0;
			for (String f : gender) {
				i++;
				if (l.getSesso().equals(f))
					return i;
			}
		}
		return 0;
	}

	private String[] gender;

}
