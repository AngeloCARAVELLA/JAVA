package it.unisannio.studenti.caravella.angelo.classes;

import java.util.*;
import java.util.Map.Entry;

public class Istat {

	public Istat(Scanner sc1, Scanner sc2) {

		this.sr = new HashMap<String, Regione>();

		Regione rp = Regione.read(sc1);

		while (rp != null) {

			this.sr.put(rp.getNome(), rp);
			rp = Regione.read(sc1);
		}

		this.hsp = new HashMap<String, Province>();
		Province pr = Province.read(sc2);

		while (pr != null) {
			this.hsp.put(pr.getNome(), pr);
			pr = Province.read(sc2);
		}

	}

	public void Printall() {

		this.sr.entrySet().forEach(entry -> {

			System.out.println(entry.getKey() + " " + entry.getValue().toString());
		});
		System.out.println(" ");

		this.hsp.entrySet().forEach(entry -> {

			System.out.println(entry.getKey() + entry.getValue());
		});

	}

	private HashMap<String, Regione> sr;
	private HashMap<String, Province> hsp;

	public void Provincia(String string) {
		// TODO Auto-generated method stub
		int somma = 0;
		int temp = 0;
		for (Map.Entry<String, Province> stt : this.hsp.entrySet()) {
			if (stt.getValue().getNome().equals(string)) {

				HashMap<String, ArrayList<Comuni>> stcg = stt.getValue().getSc();
				for (Map.Entry<String, ArrayList<Comuni>> num : stcg.entrySet()) {
					Comuni co = null;
					for (int i = 0; i < num.getValue().size(); i++) {
						if (num.getValue().get(i) instanceof Comuni) {
							co = (Comuni) num.getValue().get(i);
							somma = somma + co.getNum_r_f() + co.getNum_r_m();
							if (somma > temp)
								temp = somma;

						}
						somma = 0;
					}

				}

			}
		}

		for (Map.Entry<String, Province> stt : this.hsp.entrySet()) {
			if (stt.getValue().getNome().equals(string)) {

				HashMap<String, ArrayList<Comuni>> stcg = stt.getValue().getSc();
				for (Map.Entry<String, ArrayList<Comuni>> num : stcg.entrySet()) {
					Comuni co = null;
					for (int i = 0; i < num.getValue().size(); i++) {
						if (num.getValue().get(i) instanceof Comuni) {
							co = (Comuni) num.getValue().get(i);
							somma = somma + co.getNum_r_f() + co.getNum_r_m();
							if (somma == temp)
								System.out.println("Il comune :" + co.getNome() + " ha più abitanti: " + somma);
						}
						somma = 0;
					}
				}
			}
		}
	}

	public void Regione_num(String string) {
		// TODO Auto-generated method stub

		int somma = 0;
		int sommaf = 0;
		int sommam = 0;
		for (Map.Entry<String, Regione> st : this.sr.entrySet()) {

			if (st.getValue().getNome().equals(string)) {
				HashMap<String, ArrayList<String>> province = st.getValue().getSp();
				ArrayList<String> ars = province.get(string);
				for (String ar : ars) {
					for (Map.Entry<String, Province> stt : this.hsp.entrySet()) {
						if (stt.getValue().getNome().equals(ar)) {

							HashMap<String, ArrayList<Comuni>> stcg = stt.getValue().getSc();
							for (Map.Entry<String, ArrayList<Comuni>> num : stcg.entrySet()) {
								Comuni co = null;
								for (int i = 0; i < num.getValue().size(); i++)
									if (num.getValue().get(i) instanceof Comuni) {
										co = (Comuni) num.getValue().get(i);
										somma = somma + co.getNum_r_f();
										sommaf = sommaf + co.getNum_r_f();
										somma = somma + co.getNum_r_m();
										sommam = sommam + co.getNum_r_m();
									}

							}
						}
					}
				}
			}
		}
		System.out.println(
				"Somma totale:" + somma + " " + "Somma dei maschi " + sommam + " Somma delle femmine " + " " + sommaf);
	}

	public void Regione() {
		// TODO Auto-generated method stub
	
		int somma=0;
	
		for (Map.Entry<String, Regione> st : this.sr.entrySet()) {

			HashMap<String, ArrayList<String>> province = st.getValue().getSp();
			Set<String> keys = province.keySet();
			for (String s : keys) {

				ArrayList<String> tt = province.get(s);

				for (String ho : tt) {
					for (Map.Entry<String, Province> stu : this.hsp.entrySet()) {
							if(stu.getValue().getNome().equals(ho)){
								HashMap<String, ArrayList<Comuni>> stcg = stu.getValue().getSc();
								for (Map.Entry<String, ArrayList<Comuni>> num : stcg.entrySet()) {
									Comuni co = null;
									for (int i = 0; i < num.getValue().size(); i++)
										if (num.getValue().get(i) instanceof Comuni) {
											co = (Comuni) num.getValue().get(i);
											somma = somma + co.getNum_r_f();
									
										}

								}	
								
							}

					}
				}
			
				System.out.println("Per la regione " + st.getValue().getNome() + somma);
				somma=0;
			}

		}

	}
}
