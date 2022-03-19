package Tester;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import Classes.QG;

public class Rimozione {
	public static void main (String [] args) throws FileNotFoundException {
		

		Scanner sc=new Scanner(System.in);
		Scanner sc1= new Scanner (new File ("Esercitazioni.dati"));

		Scanner sc2= new Scanner (new File ("Iscritti.dati"));
		QG tre= new QG(sc1, sc2);
		
	
		QG quattro= new QG(sc1, sc2,"M11214" );
		quattro.printall();
	}
}
