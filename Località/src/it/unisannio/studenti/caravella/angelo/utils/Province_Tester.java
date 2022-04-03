package it.unisannio.studenti.caravella.angelo.utils;

import it.unisannio.studenti.caravella.angelo.classes.Province;

public class Province_Tester implements Tester {

	public Province_Tester(String nome) {
		this.nome = nome;
	}

	@Override
	public boolean Verify(Object o) {
		Province p = null;
		if (o instanceof Province) {

			p = (Province) o;

			if (p.getNome().equals(nome))
				return true;

		}

		return false;
	}

	private String nome;
}
