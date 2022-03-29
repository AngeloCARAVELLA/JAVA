package it.unisannio.studenti.caravella.angelo.testers;
import java.util.*;

import it.unisannio.studenti.caravella.angelo.classes.Library;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.*;

public class Tester {

	public static void main(String[] args) throws FileNotFoundException, ParseException {
		// TODO Auto-generated method stub
		Scanner sc1= new Scanner ( new File( "Archivio.dati"));
		Scanner sc2= new Scanner ( new File("Prestiti.dati"));
		
		
		Library l= new Library(sc1, sc2);
		//l.printAll();
		//l.the_longest_loan();
		//l.most_loan();
		//l.most_loan_();
		l.Control();
	}

}
