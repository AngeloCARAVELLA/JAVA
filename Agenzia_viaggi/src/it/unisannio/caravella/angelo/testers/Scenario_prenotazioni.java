package it.unisannio.caravella.angelo.testers;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.Scanner;

import it.unisannio.caravella.angelo.classes.Gestore;

public class Scenario_prenotazioni {

	public static void main(String[] args) throws FileNotFoundException, ParseException {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		Scanner sc1 = new Scanner(new File("trips.dati"));
		Scanner sc2 = new Scanner(new File("Customers.dati"));
		Scanner sc3 = new Scanner(new File("booking.dati"));
		
		Gestore gg= new Gestore(sc1, sc2, sc3);

		
		System.out.println("Scelta di un insieme di pacchetti:");
		
		System.out.println("Inserire la durata minima");
		String input= sc.nextLine().strip();
		Double d_m= Double.parseDouble(input); 
		
		
		System.out.println("Inserire l'importo massimo che si vuole spendere:");
		String input_2= sc.nextLine().strip();
		Double i_m= Double.parseDouble(input_2);
		
		System.out.println("Inserire l'identificativo del cliente: ");
		String id= sc.nextLine().strip();
		
		gg.SearchClient(id);
		
		gg.Cerca_soluzione(d_m, i_m);
	}

}
