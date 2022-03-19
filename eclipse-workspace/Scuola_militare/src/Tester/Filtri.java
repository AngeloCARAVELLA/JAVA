package Tester;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import Classes.QG;
import Utils.ErrorNotFoundInformation;
import Utils.ExNotFoundException;
import Utils.FreshNotFoundException;
import Utils.IdNotFoundException;

import java.util.*;

public class Filtri {
	public static void main(String [] args) throws FileNotFoundException {


		Scanner sc=new Scanner(System.in);
		Scanner sc1= new Scanner (new File ("Esercitazioni.dati"));

		Scanner sc2= new Scanner (new File ("Iscritti.dati"));
		QG tre= new QG(sc1, sc2);


		tre.printall();

		System.out.println("Inserisci il codice identificativo dell'esercitazione che vuoi cercare: ");
		String id_C= sc.nextLine();
		String message="Al momento l' esercitazione non esiste ancora... ";
		if(!tre.searchid(id_C)) new IdNotFoundException(message);
		else tre.searchid_(id_C);

		message="Purtroppo il cadetto corrispondente a questa matricola non c'è ancora.. ";

		System.out.println("Inserisci la matricola che vuoi cercare ");
		String matr= sc.nextLine();
		if(!tre.freshman_(matr))new FreshNotFoundException(message);
		else tre.freshman(matr);



		System.out.println("Visualizzazione di tutte le esercitazioni a cui un iscritto partecipa data la matricola");
		matr= sc.nextLine();
		message="Siamo spiacenti a questa matricola non corrisponde nessuna esercitazione...";
		if(!tre.printex_(matr)) new ExNotFoundException(message);
		else tre.printex(matr);

		System.out.println("Visualizzazione dello/degli iscritto/iscritti con il numero più alto di esercitazioni: ");
		tre.printmaxex();

		System.out.println("Inserisci prima l'attrezzatura");

		String attrezzatura = sc.nextLine();

		System.out.println("e poi il nome del campo per cui vuoi vedere i corrispondenti iscritti");
		String campo = sc.nextLine();
		
		message="Attenzione, le informazioni che hai inserito non sono presenti... ";
		if(!tre.excamp(attrezzatura , campo.strip())) new ErrorNotFoundInformation(message);
		tre.findtizioattcamp( attrezzatura , campo.strip());
			
		
		
	}
}
