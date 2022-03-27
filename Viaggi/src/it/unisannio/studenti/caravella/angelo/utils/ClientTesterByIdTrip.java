package it.unisannio.studenti.caravella.angelo.utils;

import it.unisannio.studenti.caravella.angelo.classes.Volo;

public class ClientTesterByIdTrip implements Tester {

	
	public ClientTesterByIdTrip(String id) {
		this.id=id;
		
	}

	@Override
	public boolean Verify(Object o) {
		// TODO Auto-generated method stub
		Volo v = null;
		if (o instanceof Volo) {
			v = (Volo) o;
			if (v.getId().equals(id))
				return true;
		}
		return false;
	}

	private String id;
}
