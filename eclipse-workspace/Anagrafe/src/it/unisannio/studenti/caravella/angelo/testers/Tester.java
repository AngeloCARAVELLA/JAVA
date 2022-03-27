package it.unisannio.studenti.caravella.angelo.testers;
import java.util.*;
import java.io.*;
import java.text.ParseException;

import it.unisannio.studenti.caravella.angelo.classes.Istat;
public class Tester {

	public static void main(String[] args) throws FileNotFoundException, ParseException {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner (new File( "Anagrafe.dati"));
		
		Istat i= new Istat(sc);
		
		i.printCity("Bologna");
	//	System.out.println("");
	//	i.printCityAndPeriod("Venezia");
		i.MostOld();
		i.MostYoung();
		//i.MostOldC("Napoli");
	//	i.printSameCity();
	}

}
