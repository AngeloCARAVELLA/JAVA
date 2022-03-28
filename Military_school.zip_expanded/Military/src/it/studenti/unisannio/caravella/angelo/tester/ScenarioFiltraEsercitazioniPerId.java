package it.studenti.unisannio.caravella.angelo.tester;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.Scanner;

import it.studenti.unisannio.caravella.angelo.classes.MilitarySchool;

public class ScenarioFiltraEsercitazioniPerId {

	public static void main(String[] args) throws FileNotFoundException, ParseException {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		Scanner scT= new Scanner (new File("Esercitazioni.dati"));
		Scanner scS= new Scanner(new File("Studenti.dati"));
		
		
		//creo l'oggetto gestore che legge tutto
		
		MilitarySchool aaa= new MilitarySchool(scS, scT);
		System.out.println("Inserisci l'escercitazione da ricercare: ");
		
		String es= input.nextLine();
		aaa.searchTrainingById(es);
		aaa.filterT(es).printTrainings();
	}

}
