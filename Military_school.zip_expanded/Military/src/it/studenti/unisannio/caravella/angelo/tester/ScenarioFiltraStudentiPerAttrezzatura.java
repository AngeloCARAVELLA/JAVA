package it.studenti.unisannio.caravella.angelo.tester;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.Scanner;

import it.studenti.unisannio.caravella.angelo.classes.MilitarySchool;

public class ScenarioFiltraStudentiPerAttrezzatura {

	
		public static void main(String a[]) throws FileNotFoundException, ParseException {
			
			Scanner input = new Scanner(System.in);
			
			
			Scanner scT= new Scanner (new File("Esercitazioni.dati"));
			Scanner scS= new Scanner(new File("Studenti.dati"));
			
			//creo l'oggetto gestore che legge tutto
			
			MilitarySchool aaa= new MilitarySchool(scS, scT);
			
			//invoco il filtro che prende il paramentro secondo cui vuole filtrare e stampo gli studenti del nuovo oggetto gestore che si crea
			
			//aaa.filterTrainingsByTool("scarpe").printStudents();
			
			System.out.println("Inserisci l'attrezzatura: ");
			
			String atre= input.nextLine().strip();
			
			System.out.println("Inserisci il campo ");
			String camp= input.nextLine().strip();
			
			aaa.filterTrainingsByToolandPlace(atre, camp).printStudents();
			
			//aaa.filterTrainingsByToolandPlace("Pinne ", "Scuola militare di Livorno ").printStudents();
			
		}

	

}
