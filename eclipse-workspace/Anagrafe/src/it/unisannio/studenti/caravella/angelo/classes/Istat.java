package it.unisannio.studenti.caravella.angelo.classes;

import java.text.ParseException;
import java.util.*;

import it.unisannio.studenti.caravella.angelo.utils.Constants;
import it.unisannio.studenti.caravella.angelo.utils.TesterCity;
import it.unisannio.studenti.caravella.angelo.utils.TesterPeriod;

public class Istat {

	public Istat(Scanner sc) throws ParseException {

		Persona ps = Persona.read(sc);
		this.sp = new HashMap<String, Persona>();

		while (ps != null) {

			sp.put(ps.getCf(), ps);
			ps = Persona.read(sc);
		}

	}

	public void printCity(String string) {
		// TODO Auto-generated method stub
		Set<String> sp = this.sp.keySet();

		TesterCity tc = new TesterCity(string);
		for (String s : sp) {

			if (tc.Verify(this.sp.get(s)))
				System.out.println("La seguente persona è nata a Bologna " + this.sp.get(s).toString());
		}
	}

	public void printCityAndPeriod(String string) throws ParseException {
		// TODO Auto-generated method stub
		Set<String> sp = this.sp.keySet();

		TesterPeriod tc = new TesterPeriod(string);
		for (String s : sp) {

			if (tc.Verify(this.sp.get(s)))
				System.out.println("La seguente persona è nata a Venezia nel secondo semestre del 1957 "
						+ this.sp.get(s).toString());
		}
	}

	public void printSameCity() {
		// TODO Auto-generated method stub
		Set<String> sp = this.sp.keySet();

		for (String s : sp) {

			if (this.sp.get(s).getL_n().equals(this.sp.get(s).getL_r()))
				System.out.println("Per la seguente persona il lugo di nascita coincide con la residenza"
						+ this.sp.get(s).toString());
		}
	}

	public void MostOld() throws ParseException {
		// TODO Auto-generated method stub
		Set<String> sp = this.sp.keySet();
		Date before = null;
		Date min = Constants.ssMMyyyy.parse(Constants.d_min);
		int i = 0;
		for (String s : sp) {
			if (i == 0)
				if (this.sp.get(s).getD_b().after(min))
					before = this.sp.get(s).getD_b();
			if (i > 0)
				if (this.sp.get(s).getD_b().before(before))
					before = this.sp.get(s).getD_b();
			i++;

		}
		for (String s : sp) {

			if (this.sp.get(s).getD_b().equals(before))
				System.out.println("La persona più anziana è " + this.sp.get(s).toString());

		}
	}

	public void MostOldC(String c) throws ParseException {
		// TODO Auto-generated method stub
		Set<String> sp = this.sp.keySet();
		Date before = null;
		Date min = Constants.ssMMyyyy.parse(Constants.d_min);
		int i = 0;
		TesterCity tc = new TesterCity(c);
		for (String s : sp) {

			if (tc.Verify2(this.sp.get(s))) {
				if (i == 0)
					if (this.sp.get(s).getD_b().after(min))
						before = this.sp.get(s).getD_b();
				if (i > 0)
					if (this.sp.get(s).getD_b().before(before))
						before = this.sp.get(s).getD_b();
				i++;
			}
		}
		for (String s : sp) {

			if (this.sp.get(s).getD_b().equals(before))
				System.out.println("La persona più anziana che vive a Napoli è " + this.sp.get(s).toString());

		}

	}

	public void MostYoung() throws ParseException {
		// TODO Auto-generated method stub
		Set<String> sp = this.sp.keySet();
		Date before = null;
		Date min = Constants.ssMMyyyy.parse(Constants.d_min);
		int i = 0;
		for (String s : sp) {
			if (i == 0)
				if (this.sp.get(s).getD_b().after(min))
					before = this.sp.get(s).getD_b();
			if (i > 0)
				if (this.sp.get(s).getD_b().after(before))
					before = this.sp.get(s).getD_b();
			i++;

		}
		for (String s : sp) {

			if (this.sp.get(s).getD_b().equals(before))
				System.out.println("La persona più giovane è " + this.sp.get(s).toString());

		}

	}

	private Map<String, Persona> sp;

}
