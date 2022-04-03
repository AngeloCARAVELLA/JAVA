package it.unisannio.studenti.caravella.angelo.classes;

import java.util.*;

import it.unisannio.studenti.caravella.angelo.utils.Province_Tester;

public class Luogo_gestore {

	public Luogo_gestore(Scanner sc1, Scanner sc2) {

		this.sp = new HashMap<String, Province>();
		this.sr = new HashMap<String, Regione>();

		Province p = Province.read(sc1);

		while (p != null) {
			this.sp.put(p.getNome(), p);
			p = Province.read(sc1);

		}

		Regione r = Regione.read(sc2);

		while (r != null) {
			this.sr.put(r.getNome(), r);
			r = Regione.read(sc2);

		}

	}

	public void PrintAll() {

		this.sp.entrySet().forEach(s -> {

			System.out.println(s.getKey() + " " + s.getValue().getCo());
		});

		this.sr.entrySet().forEach(s -> {

			System.out.println(s.getKey() + " " + s.getValue().getPr());
		});

	}

	public void PrintNum(String string) {
		// TODO Auto-generated method stub
		Set<String> keys = this.sp.keySet();
		LinkedList<String> ls = new LinkedList<String>();

		Province_Tester pt = new Province_Tester(string);
		for (String s : keys) {

			if (pt.Verify(this.sp.get(s))) {
				Province p = this.sp.get(s);

				ls = p.getCo();
				CalcoloNum(ls, string);

			}

		}

	}

	private void CalcoloNum(LinkedList<String> ls, String nome) {
		int somma = 0;
		int sM = 0;
		int sF = 0;
		int sommaC = 0;
		int temp = 0;
		for (int i = 1; i < ls.size(); i = i + 3) {

			somma = somma + Integer.parseInt(ls.get(i));
			sM = sM + Integer.parseInt(ls.get(i));

			somma = somma + Integer.parseInt(ls.get(i + 1));
			sF = sF + Integer.parseInt(ls.get(i + 1));

			sommaC = somma;

			if (sommaC > temp)
				temp = sommaC;

		}

		CalcComunePiùgrande(nome, temp, ls);

		System.out.println(
				"Per la provincia: " + nome + " ci sono in totale: " + somma + " maschi: " + sM + " femmine: " + sF);
	}

	private void CalcComunePiùgrande(String nome, int temp, LinkedList<String> ls) {
		int somma = 0;
		int sM = 0;
		int sF = 0;
		int sommaC = 0;

		String n = null;
		// TODO Auto-generated method stub
		for (int i = 1; i < ls.size(); i = i + 3) {

			somma = somma + Integer.parseInt(ls.get(i));
			sM = sM + Integer.parseInt(ls.get(i));

			somma = somma + Integer.parseInt(ls.get(i + 1));
			sF = sF + Integer.parseInt(ls.get(i + 1));

			sommaC = somma;

			if (sommaC == temp)
				n = ls.get(i - 1);

		}

		System.out.println("Per la provincia: " + nome + " il comune con più abitanti è " + n);

	}

	public void Regioni() {

		Set<String> keys = this.sr.keySet();
		int t1 = 0;
		int t2 = 0;
		String nome = null;
		String no = null;
		for (String s : keys) {

			Regione r = this.sr.get(s);
			nome = r.getNome();
			LinkedList<String> ls = r.getPr();
			t1 = SearchIn(ls, nome);
			if (t1 > t2) {
				t2 = t1;
				no = r.getNome();
			}
		}
		System.out.println("La regione: " + no + " è la più grande");
	}

	private int SearchIn(LinkedList<String> ls, String nome) {

		int s = 0;
		int sm = 0;
		int sf = 0;

		for (String l : ls) {

			s = s + NumT(l);
			sm = sm + NumM(l);
			sf = s - sm;
		}

		System.out.println("Per la regione: " + nome + " ci sono tot abitanti: " + s + " di cui: " + sm + " maschi e:"
				+ sf + " femmine");
		return s;
	}

	public int NumT(String string) {

		Set<String> keys = this.sp.keySet();
		LinkedList<String> ls = new LinkedList<String>();
		int sommaT = 0;
		Province_Tester pt = new Province_Tester(string);
		for (String s : keys) {

			if (pt.Verify(this.sp.get(s))) {
				Province p = this.sp.get(s);

				ls = p.getCo();

				sommaT = sommaT + CalcoloNum(string, ls);

			}

		}
		return sommaT;
	}

	public int NumM(String string) {

		Set<String> keys = this.sp.keySet();
		LinkedList<String> ls = new LinkedList<String>();
		int sommaT = 0;
		Province_Tester pt = new Province_Tester(string);
		for (String s : keys) {

			if (pt.Verify(this.sp.get(s))) {
				Province p = this.sp.get(s);

				ls = p.getCo();

				sommaT = sommaT + CalcoloNumM(string, ls);

			}

		}
		return sommaT;
	}

	private int CalcoloNum(String nome, LinkedList<String> ls) {
		int somma = 0;
		int sM = 0;
		int sF = 0;

		for (int i = 1; i < ls.size(); i = i + 3) {

			somma = somma + Integer.parseInt(ls.get(i));
			sM = sM + Integer.parseInt(ls.get(i));

			somma = somma + Integer.parseInt(ls.get(i + 1));
			sF = sF + Integer.parseInt(ls.get(i + 1));

		}

		return somma;
	}

	private int CalcoloNumM(String nome, LinkedList<String> ls) {
		int somma = 0;
		int sM = 0;
		int sF = 0;

		for (int i = 1; i < ls.size(); i = i + 3) {

			somma = somma + Integer.parseInt(ls.get(i));
			sM = sM + Integer.parseInt(ls.get(i));

			somma = somma + Integer.parseInt(ls.get(i + 1));
			sF = sF + Integer.parseInt(ls.get(i + 1));

		}

		return sM;
	}

	private Map<String, Province> sp;
	private Map<String, Regione> sr;

}
