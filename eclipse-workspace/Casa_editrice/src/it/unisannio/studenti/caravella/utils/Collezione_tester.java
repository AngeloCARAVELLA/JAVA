package it.unisannio.studenti.caravella.utils;

import it.unisannio.studenti.caravella.angelo.classes.Opera;

public class Collezione_tester implements Tester{


	public Collezione_tester(int opera) {
		this.opera= opera;

	}
	@Override
	public boolean verify(Object o) {
		// TODO Auto-generated method stub

		Opera op= null;
		if( o instanceof Opera) {
			op= (Opera ) o; 
			if( op.getOpera()== opera)
				return true;
		}
		return false;
	}

	private int opera;
}
