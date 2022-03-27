package it.studenti.unisannio.caravella.angelo.testers;

import java.io.File;

import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.Scanner;

import it.studenti.unisannio.caravella.angelo.classes.Restourant;

public class Tester {


	public static void main(String[] args) throws FileNotFoundException, ParseException {
		// TODO Auto-generated method stub
		
		Scanner  sc= new Scanner ( new File("menu.dati") ) ;
		Scanner  in= new Scanner(System.in);
		Restourant cas= new Restourant(sc);
		
		String id= cas.addTable();
		
		System.out.println("Inserisci un piatto o un vino ");
		
		cas.addOrdination(id,in.nextLine().strip() );
		cas.printReceipt(id, System.out);
	}

}
