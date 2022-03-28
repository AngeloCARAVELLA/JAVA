package it.studenti.unisannio.caravella.angelo.tester;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.Scanner;

import it.studenti.unisannio.caravella.angelo.classes.MilitarySchool;

public class ScenarioFiltraStudentiPerMatricola {
	
	public static void main(String [] args ) throws FileNotFoundException, ParseException {
	
	Scanner input = new Scanner(System.in);
			
	Scanner scT= new Scanner (new File("Esercitazioni.dati"));
	Scanner scS= new Scanner(new File("Studenti.dati"));
	
	//creo l'oggetto gestore che legge tutto
	
	MilitarySchool aaa= new MilitarySchool(scS, scT);
	
		System.out.println( "Inserisci la matricola: ");
		String matr= input.nextLine();
		aaa.searchStudentById(matr);
		
		aaa.filterStudentByImm(matr).printStudents();
		
	
	
	}
}
