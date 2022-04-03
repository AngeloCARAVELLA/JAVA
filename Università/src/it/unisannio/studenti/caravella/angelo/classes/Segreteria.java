package it.unisannio.studenti.caravella.angelo.classes;

import java.text.ParseException;
import java.util.*;

import it.unisannio.studenti.caravella.angelo.utils.Docenti_Tester;

public class Segreteria {

	public Segreteria(Scanner sc1, Scanner sc2) throws ParseException {
		// TODO Auto-generated constructor stub
		this.sd = new HashMap<String, Docenti>();
		Docenti d = Docenti.Read(sc1);
		while (d != null) {

			this.sd.put(d.getC_f(), d);
			d = Docenti.Read(sc1);

		}
		this.qc = new LinkedList<Corsi>();
		Corsi c = Corsi.Read(sc2);
		while (c != null) {
			this.qc.add(c);
			c = Corsi.Read(sc2);
		}

	}

	public void CercaCorso(String string) {
		// TODO Auto-generated method stub
		for (Corsi c : this.qc) {
			if (c.getC_fi().equals(string))
				System.out.println(c.toString());
		}
	}

	public boolean CercaDocente(String string, String string2) {
		// TODO Auto-generated method stub
		Docenti_Tester d = new Docenti_Tester(string, string2);

		Set<String> keys = this.sd.keySet();
		int i = 0;
		for (String s : keys) {

			if (d.Verify(this.sd.get(s)))
				i++;

		}
		if (i > 1)
			return true;
		else
			return false;

	}

	public void CercaDocente(String string, String string2, Date d_n) {
		// TODO Auto-generated method stub
		String c = null;
		this.sd.entrySet().forEach(e -> {

			if (e.getValue().getN().equals(string) && e.getValue().getC().equals(string2)
					&& e.getValue().getD_n().equals(d_n))
				CercaCorso(e.getValue().getC_f());
		});
	}

	public void InfDoc(String string) {

		for (Corsi c : this.qc) {
			if (c.getCo_c().equals(string))
				CercaDocente(c.getC_fi());
		}
	}

	
	
	public void ElenDoc(String string) {

		for (Corsi c : this.qc) {
			if (c.getNo_c().equals(string))
				CercaDocente(c.getC_fi());
		}
	}

	private void CercaDocente(String c) {

		this.sd.entrySet().forEach(e -> {
			if (e.getKey().equals(c))
				System.out.println(e.getValue().toString());
		});

	}
	
	public void CorsL(String string) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		for (Corsi c : this.qc) {
			if (c.getC_la().equals(string))
				System.out.println(c.toString());
				CercaDocente(c.getC_fi());
		}
		
	}


	private Map<String, Docenti> sd;
	private Queue<Corsi> qc;
	
}
