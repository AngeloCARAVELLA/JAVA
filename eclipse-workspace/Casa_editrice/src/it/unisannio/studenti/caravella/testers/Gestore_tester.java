package it.unisannio.studenti.caravella.testers;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.Scanner;

import it.unisannio.studenti.caravella.angelo.classes.Gestore;

public class Gestore_tester {

	
	public static void  main( String [] args) throws FileNotFoundException, ParseException {
	
	Scanner input = new Scanner(System.in);
	
	
	
	Scanner sc1= new Scanner (new File("Opere.dati"));
	
	Scanner sc2= new Scanner (new File("Collocazioni.dati"));
	

	Gestore gg= new Gestore(sc1, sc2);
	gg.print();
	
	gg.printnum();
	

	gg.searchbookbyst("Pietro Vito");

	//gg.printcolbyst("st008");
	gg.printcolbyst_with_callback("st007");
	gg.printop_with_callback(452);
	}
}
