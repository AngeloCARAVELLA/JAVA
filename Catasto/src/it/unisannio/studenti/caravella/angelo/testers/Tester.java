package it.unisannio.studenti.caravella.angelo.testers;
import java.util.*;

import it.unisannio.studenti.caravella.angelo.classes.Gestore;

import java.io.*;
import java.text.ParseException;

public class Tester {

	public static void main(String[] args) throws FileNotFoundException, ParseException {
		// TODO Auto-generated method stub
		
		/*System.out.println("Tutte le unità abitative presenti in una certa città.\n"
				+ "Tutte le unità abitative presenti in una certa città e che costano meno di un dato importo.\n"
				+ "sI proprietari di un’unità abitativa, nati in una città diversa da quella dell’unità abitativa.\n"
				+ "Tutte le soluzioni indipendenti che hanno più di un dato di proprietari.\n"
				+ "Il valore medio ed il valore totale di tutti gli appartamenti. ..\n"
				+ "Ordinare le soluzioni indipendenti per valore decrescente.\n"
				+ "Ordinare tutte le soluzioni abitative in base al nome del comune in cui si trovano.");
		*/
		Scanner sc1= new Scanner (new File("proprietari.txt"));
		
		
		Scanner sc2= new Scanner (new File("soluzioni.txt"));
		
		Scanner sc3= new Scanner (new File("proprietà.txt"));
		
		
		Gestore gg = new Gestore( sc1, sc2, sc3);
		
		//gg.FindAb("Benevento");
		//gg.FindAb("Benevento", 520000);
		gg.PrintSolutions();
		gg.PrintAlotOfP();
	}

}
