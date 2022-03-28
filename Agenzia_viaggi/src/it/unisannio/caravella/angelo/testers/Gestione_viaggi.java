package it.unisannio.caravella.angelo.testers;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.text.ParseException;
import java.util.Scanner;

import it.unisannio.caravella.angelo.classes.Gestore;

public class Gestione_viaggi {

	public static void main(String[] args) throws ParseException, FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		Scanner sc1 = new Scanner(new File("trips.dati"));
		Scanner sc2 = new Scanner(new File("Customers.dati"));
		Scanner sc3 = new Scanner(new File("booking.dati"));
		

		Gestore gg= new Gestore(sc1, sc2, sc3);
		
		
		System.out.println("Inserisci l'oggetto da eliminare in base al suo id: ");

		String id_el= input.nextLine().strip(); 
		gg.SearchTrip(id_el);
		PrintStream elim= new PrintStream (new File ("trips.dati" ));
			
		gg.Printwithout(id_el,elim);
		
		

		System.out.println("Inserisci l'oggetto da ricercare in base al suo id: ");

		String id= input.nextLine().strip(); 
		gg.Cerca_viaggi(id);
	
		
		
		
	}

	
	
	
}
