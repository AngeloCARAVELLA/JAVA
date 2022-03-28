package it.studenti.unisannio.caravella.angelo.tester;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.Scanner;

import it.studenti.unisannio.caravella.angelo.classes.MilitarySchool;

public class ScenarioFiltraStudentiMaxEs {
	public static void main(String a[]) throws FileNotFoundException, ParseException {
		Scanner scT= new Scanner (new File("Esercitazioni.dati"));
		Scanner scS= new Scanner(new File("Studenti.dati"));
		
		//creo l'oggetto gestore che legge tutto
		
		MilitarySchool aaa= new MilitarySchool(scS, scT);
		aaa.printMax();
		
		
		
	}
}
