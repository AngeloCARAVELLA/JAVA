package it.unisannio.studenti.caravella.angelo.testers;
import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.*;

import it.unisannio.studenti.caravella.angelo.classes.Agenzia;
public class Tester {

	public static void main(String[] args) throws FileNotFoundException, ParseException {
		// TODO Auto-generated method stub
		Scanner sc1 = new Scanner(new File("anagrafica.dati"));
		Scanner sc2 = new Scanner(new File("redditi.dati"));

		Agenzia ag = new Agenzia(sc1, sc2);

		System.out.println(" quanto ha guadagnato il signor Pasquale Rossi nel 2008 ?"
				+ "- qual è il reddito minimo del signor Mario Bianchi ed in che anno si è avuto ?"
				+ "- che è stato il cittadino che ha guadagnato di più nel 2004 ?"
				+ "- quanti sono i cittadini che hanno guadagnato più di 13.000 euro nell’anno 2004 ?"
				+ "- quali sono i cittadini fra i 30 e 45 anni che hanno nel 2011 hanno guadagnato meno di"
				+ "9000 euro" + "- quanto hanno guadagnato, in media, i cittadini ultrasessantenni nel 2010 ");

		/*ag.printAll();
		ag.reddito("Pasquale", "Rossi", "2005");
		ag.redditoMinimo("Mario", "Bianchi");
		ag.guadagnoMaggiore("2004");
		*/
	//	ag.DateFind("2011", 9000);
		ag.Old2010( "2010");
	}

}
