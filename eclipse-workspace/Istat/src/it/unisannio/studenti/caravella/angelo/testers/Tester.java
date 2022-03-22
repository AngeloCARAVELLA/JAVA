package it.unisannio.studenti.caravella.angelo.testers;
import java.io.*;
import java.util.*;

import it.unisannio.studenti.caravella.angelo.classes.Istat;
public class Tester {



	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner sc1= new Scanner ( new File( "regioni.dati"));
		Scanner sc2= new Scanner ( new File( "province.dati"));
		Istat is= new Istat(sc1, sc2);
		
		
		System.out.println("- data una provincia, calcolare il numero di persone residenti nella stessa, sia totale, "
				+ "sia distinto tra maschi e femmine\n"
				+ "- data una provincia, indicarne il comune con il numero più alto di residenti\n"
				+ "- per ciascuna regione, calcolare il numero di persone residenti nella regione, "
				+ "sia totale sia distinti tra maschi e femmine, "
				+ "ed indicare la regione con più popolazione\n"
				+ "");
		
		//is.Printall();
		
		//is.Provincia("Milano");
		//is.Regione_num("Lombardia");
		is.Regione();
	}
		
}
