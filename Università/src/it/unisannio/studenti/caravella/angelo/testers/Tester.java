package it.unisannio.studenti.caravella.angelo.testers;
import java.util.*;

import it.unisannio.studenti.caravella.angelo.classes.Segreteria;
import it.unisannio.studenti.caravella.angelo.utils.Constants;

import java.io.*;
import java.text.ParseException;


public class Tester {

	public Tester() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws FileNotFoundException, ParseException {
		// TODO Auto-generated method stub

		Scanner sc1= new Scanner (new File("Docenti.txt"));
		Scanner sc2= new Scanner (new File("Corsi.txt"));
		Scanner sc= new Scanner(System.in);	
		Segreteria s= new Segreteria( sc1, sc2);

		//s.CercaCorso("CRVNGLO2D29G596R");
		/*
		if(s.CercaDocente("Angelo","Pizzuco")) {
			System.out.println( "Attenzione ci sono degli omonimi, per favore inserisca anche la data di nascita:");


			String d = sc.nextLine();

			Date d_n = Constants.ssMMyyyy.parse(d);
			
			s.CercaDocente("Angelo","Pizzuco", d_n);
		}
		
		*/
		
		//s.InfDoc("SASA");
		//s.ElenDoc("Elettronica per sistemi embedded");
		s.CorsL("Ingegneria elettronica magistrale");
		
	}

}
