package it.unisannio.studenti.caravella.angelo.utils;

import java.time.*;
import it.unisannio.studenti.caravella.angelo.classes.Cittadino;

public class DateTester implements Tester{



	public DateTester() {


	}

	public boolean Verify(Object o) {
		// TODO Auto-generated method stub

		LocalDate today = LocalDate.now();
	
		Cittadino c = null;
		if (o instanceof Cittadino) {

			c = (Cittadino) o;

			LocalDate data_di_nascita = c.getData_di_nascita().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

			int years = Period.between(data_di_nascita, today).getYears();
			
			if( years > 30 && years <45)
				return true;

		}
		return false;
	}



	public boolean VerifyOld(Object o) {
		// TODO Auto-generated method stub

		LocalDate today = LocalDate.now();
	
		Cittadino c = null;
		if (o instanceof Cittadino) {

			c = (Cittadino) o;

			LocalDate data_di_nascita = c.getData_di_nascita().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

			int years = Period.between(data_di_nascita, today).getYears();
			
			if( years >=60)
				return true;

		}
		return false;
	}






}
