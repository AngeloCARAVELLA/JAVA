package it.unisannio.studenti.caravella.angelo.testers;
import java.util.*;

import it.unisannio.studenti.caravella.angelo.classes.Luogo_gestore;

import java.io.*;

public class Tester {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		Scanner sc1= new Scanner (new File("province.txt"));
		Scanner sc2= new Scanner (new File("regioni.txt"));
		Luogo_gestore p= new Luogo_gestore(sc1,sc2);
		//stampa tutto
		p.PrintAll();
		System.out.println(" ");
		/*- data una provincia, calcolare il numero di persone residenti nella stessa, sia totale, sia distinto tra 
		maschi e femmine 
		- data una provincia, indicarne il comune con il numero più alto di residenti 
		*/
		p.PrintNum("Caltana");
		System.out.println(" ");
		
		/*
		 - per ciascuna regione, calcolare il numero di persone residenti nella regione, sia totale sia distinti tra 
		maschi e femmine, ed indicare la regione con più popolazione 
		
		 */
		p.Regioni();
	

	}

}
