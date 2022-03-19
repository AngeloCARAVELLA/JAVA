package it.unisannio.studenti.unisannio.caravella.angelo.classes;

import java.io.PrintStream;

import java.util.*;

import it.unisannio.studenti.unisannio.caravella.angelo.utils.TesterAge;
import it.unisannio.studenti.unisannio.caravella.angelo.utils.TesterGender;

public class Segreteria {

	public Segreteria(PrintStream ps1, PrintStream ps2) {
		// TODO Auto-generated constructor stub
		this.votes = new ArrayList<Votante>();
		this.places = new HashSet<Località>();

		Votante vt = Votante.read();
		Località pl = new Località(vt.getLocalità(), vt.getNazionalità());
		do {
			if (vt.getFunzionalità().equals("Insert")) {

				vt.printMark(ps1);// Stampo il voto

				pl.addVotante(vt); // Aggiungo un oggetto di tipo votante all'interno dell' arrayList che sta
									// all'interno di località
				vt.setL(pl);// faccio il collegamento tra le classi aggiungendo l'oggetto di tipo Località
							// all'interno votante

				votes.add(vt); // aggiungo un oggetto di tipo votante all'interno dell' arraylist

				// di seguito controllo se è gia presente l'oggetto di tipo località all'
				// interno dell'hashSet
				// perchè se così fosse non lo posso aggiungere ma posso aggiungere
				// un oggetto di tipo votante all'interno dell' arrayList che sta all'interno di
				// località
				if (places.contains(pl))
					for (Località lc : places) {
						if (lc.equals(pl))
							lc.addVotante(vt);

					}
				else {

					places.add(pl);
					pl.addVotante(vt);
				}

			} else if (vt.getFunzionalità().equals("View")) {
				printStatistics();

			} else if (vt.getFunzionalità().equals("Record")) {
				printStatisticsPS(ps2);

			} else {
				System.err.println("FunctionalityNotAllowed");

			}
			vt = Votante.read();
			if (vt != null)
				pl = new Località(vt.getLocalità(), vt.getNazionalità());
		} while (vt != null);

	}

	public void printStatistics() {

		double voto;
		for (Località l : places) {
			System.out.println(l.getNome() + " " + l.getNazionalità());
			ArrayList<Votante> vt = l.getVotes();
			voto = SearchVotes(vt, l);
			System.out.println(voto);
		}

		int num_20 = 0;
		int num_21 = 0;
		int num_36 = 0;
		int num_50 = 0;
		int i = 0;
		int num_m = 0;
		int num_f = 0;
		System.out.println("Il numero di votanti è : " + votes.size());
		for (Votante v : votes) {
			String[] età_possibili = { "<20", "21-35", "36-50", ">50" };
			TesterAge ta = new TesterAge(età_possibili);
			i = ta.VerifyAt(v);
			if (i == 1)
				num_20++;
			if (i == 2)
				num_21++;
			if (i == 3)
				num_36++;
			if (i == 4)
				num_50++;
			String[] generi = { "M", "F" };
			TesterGender tg = new TesterGender(generi);
			i = tg.VerifyAt(v);
			if (i == 1)
				num_m++;
			if (i == 2)
				num_f++;
		}
		System.out.println("vt: " + " <20 " + num_20 + " 21-35 " + num_21 + " 36-50 " + num_36 + " >50 " + num_50);
		System.out.println("Numero di maschi: " + num_m + " " + "Numero di femmine: " + num_f);

	}

	public Double SearchVotes(ArrayList<Votante> vt, Località l) {

		for (Votante v : vt) {
			if (v.getLocalità().equals(l.getNome()))
				return v.getVoto();

		}
		return null;
	}

	public void printStatisticsPS(PrintStream ps) {
		for (Località l : places) {
			ArrayList<Votante> vt = l.getVotes();
			for (Votante v : vt) {

				ps.println(v.getLocalità() + " " + v.getNazionalità() + " " + v.getVoto());

			}

		}

		int num_20 = 0;
		int num_21 = 0;
		int num_36 = 0;
		int num_50 = 0;
		int i = 0;
		int num_m = 0;
		int num_f = 0;
		ps.println("Il numero di votanti è : " + votes.size());
		for (Votante v : votes) {
			String[] età_possibili = { "<20", "21-35", "36-50", ">50" };
			TesterAge ta = new TesterAge(età_possibili);
			i = ta.VerifyAt(v);
			if (i == 1)
				num_20++;
			if (i == 2)
				num_21++;
			if (i == 3)
				num_36++;
			if (i == 4)
				num_50++;
			String[] generi = { "M", "F" };
			TesterGender tg = new TesterGender(generi);
			i = tg.VerifyAt(v);
			if (i == 1)
				num_m++;
			if (i == 2)
				num_f++;
		}
		ps.println("vt: " + " <20 " + num_20 + " 21-35 " + num_21 + " 36-50 " + num_36 + " >50 " + num_50);
		ps.println("Numero di maschi: " + num_m + " " + "Numero di femmine: " + num_f);

	}

	private List<Votante> votes;
	private Set<Località> places;

}
