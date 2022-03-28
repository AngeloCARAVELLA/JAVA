package it.unisannio.studenti.caravella.angelo.classes;

import java.text.ParseException;

import java.util.*;

import it.unisannio.studenti.caravella.angelo.utils.CitizenNotFoundException;
import it.unisannio.studenti.caravella.angelo.utils.CitizenTester;
import it.unisannio.studenti.caravella.angelo.utils.Constants;
import it.unisannio.studenti.caravella.angelo.utils.DateTester;

public class Agenzia {

	public Agenzia(Scanner sc1, Scanner sc2) throws ParseException {

		Cittadino ct = Cittadino.read(sc1);
		this.sr = new HashMap<String, Cittadino>();

		while (ct != null) {
			this.sr.put(ct.getCodice_fiscale(), ct);
			ct = Cittadino.read(sc1);
		}
		Reddito red = Reddito.read(sc2);
		this.rd = new HashSet<Reddito>();

		while (red != null) {
			Cittadino cit = SearchCitizen(red.getCF());
			red.setC(cit);
			ArrayList<Reddito> ar = cit.getR();
			ar.add(red);

			this.rd.add(red);
			red = Reddito.read(sc2);
		}

	}

	private Cittadino SearchCitizen(String cf) {
		// TODO Auto-generated method stub
		Cittadino ct = this.sr.get(cf);

		if (ct == null)
			throw new CitizenNotFoundException("Citizen non found");
		return ct;

	}

	public void printAll() {
		for (Map.Entry<String, Cittadino> g : this.sr.entrySet()) {

			System.out.println(g.getKey() + " Values:" + g.getValue().getNome() + " " + g.getValue().getCognome() + " "
					+ g.getValue().getCodice_fiscale() + " " + g.getValue().getData_di_nascita());
		}

		for (Reddito re : this.rd) {

			System.out.println(re.getCF() + " " + re.getAnno() + " " + re.getReddito());

		}

	}

	public void reddito(String string, String string2, String string3) throws ParseException {
		// TODO Auto-generated method stub

		Set<String> tf = this.sr.keySet();

		Date dt = Constants.aa.parse(string3);
		CitizenTester ts = new CitizenTester(string, string2);

		for (String s : tf) {

			if (ts.Verify(this.sr.get(s)))
				Search(s, dt);

		}

	}

	public void redditoMinimo(String string, String string2) {
		// TODO Auto-generated method stub

		Set<String> tf = this.sr.keySet();

		CitizenTester ts = new CitizenTester(string, string2);

		for (String s : tf) {

			if (ts.Verify(this.sr.get(s)))
				SearchMin(s);

		}
	}

	public void SearchMin(String cf) {
		double temp = 0;
		for (Reddito re : this.rd) {

			if (re.getCF().equals(cf))
				if (re.getReddito() > temp)
					temp = re.getReddito();
		}

		for (Reddito re : this.rd) {

			if (re.getCF().equals(cf))
				if (re.getReddito() < temp)
					temp = re.getReddito();
		}

		for (Reddito re : this.rd) {

			if (re.getCF().equals(cf))
				if (re.getReddito() == temp)
					System.out.println(re.getAnno());
		}

	}

	public void Search(String cf, Date dt) {

		for (Reddito re : this.rd) {

			if (re.getCF().equals(cf) && re.getAnno().equals(dt))

				System.out.println(re.getReddito());
		}
	}

	public void guadagnoMaggiore(String string) throws ParseException {
		// TODO Auto-generated method stub
		Set<String> tf = this.sr.keySet();
		String cf = null;
		ArrayList<String> to = new ArrayList<String>();
		Date dt = Constants.aa.parse(string);
		for (String s : tf) {
			cf = SearchDate(s, dt);
			to = SearchGreater(s, dt);
		}
		Cittadino ct = this.sr.get(cf);
		System.out
				.println("Il cittadino che ha guadagnato di più nel 2004 e\' " + ct.getNome() + " " + ct.getCognome());

		for (String t : to) {
			System.out.println(t + " ");
		}
	}

	private String SearchDate(String s, Date dt) {
		// TODO Auto-generated method stub
		double temp = 0;
		String cf = null;
		for (Reddito r : this.rd) {
			if (r.getAnno().equals(dt))
				if (r.getReddito() > temp)
					temp = r.getReddito();

		}

		for (Reddito r : this.rd) {
			if (r.getAnno().equals(dt))
				if (r.getReddito() == temp)
					cf = r.getCF();

		}
		return cf;

	}

	private ArrayList<String> SearchGreater(String s, Date dt) {
		// TODO Auto-generated method stub
		ArrayList<Double> tt = new ArrayList<Double>();
		ArrayList<String> tc = new ArrayList<String>();
		ArrayList<String> to = new ArrayList<String>();
		for (Reddito r : this.rd) {
			if (r.getAnno().equals(dt))
				if (r.getReddito() > 13000)
					tt.add(r.getReddito());

		}

		for (Reddito r : this.rd) {
			if (r.getAnno().equals(dt))
				for (Double d : tt) {
					if (d == r.getReddito())
						tc.add(r.getCF());
				}
		}
		for (String e : tc) {

			Cittadino ct = this.sr.get(e);
			to.add(ct.getNome());
			to.add(ct.getCognome());
		}
		return to;

	}

	public void DateFind(String data, double importo) throws ParseException {
		Set<String> h = this.sr.keySet();
		Cittadino c = null;
		for (String s : h) {
			c = this.sr.get(s);
			Cittadino c1 = null;
			DateTester ts = new DateTester();
			if (ts.Verify(c))
				SearchValues(data, importo);

		}
	}

	public void SearchValues(String data, double importo) throws ParseException {
		Date d = Constants.aa.parse(data);
		HashMap<String, Cittadino> ct = new HashMap<String, Cittadino>();
		for (Reddito r : this.rd) {
			Cittadino g = null;
			if (r.getAnno().equals(d) && r.getReddito() < importo) {
				g = this.sr.get(r.getCF());
				ct.put(g.getCodice_fiscale(), g);
			}
		}
		printCit(ct);

	}

	public void printCit(HashMap<String, Cittadino> ct) {
		Set<String> keys = ct.keySet();
		for (String k : keys) {

			Cittadino cit = ct.get(k);
			System.out.println(cit.toString());
		}
	}

	public void Old2010(String string) throws ParseException {
		// TODO Auto-generated method stub
		Date d = Constants.aa.parse(string);

		Set<String> h = this.sr.keySet();
		Cittadino c = null;
		for (String s : h) {
			c = this.sr.get(s);
			Cittadino c1 = null;
			DateTester ts = new DateTester();
			if (ts.VerifyOld(c))
				SearchValues(d);

		}
	}

	public void SearchValues(Date d) throws ParseException {

		double media = 0;
		double somma = 0;
		int cont = 0;
		for (Reddito r : this.rd) {

			if (r.getAnno().equals(d)) {
				somma = somma + r.getReddito();
				cont++;
				media = somma / cont;
			}

		}

		System.out.println("La media è:  " + media);
	}

	private Map<String, Cittadino> sr;
	private Set<Reddito> rd;

}
