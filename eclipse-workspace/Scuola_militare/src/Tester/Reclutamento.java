package Tester;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

import Classes.Iscritto;

public class Reclutamento {


		public static void main (String [] args) throws IOException {
			    
				try (Scanner input = new Scanner (System.in)) {
					try (BufferedWriter ps = new BufferedWriter(new FileWriter("Iscritti.dati", true))) {
						String matricola;
						String nome;
						String cognome;
						String esercitazione;
						
						do{
						System.out.println(" Inserisci la matricola");
						matricola= input.nextLine();
						ps.write (matricola + "\n");
						}
						while(matricola.equals(""));
						do{
							
						System.out.println(" Inserisci il nome del cadetto");
						nome= input.nextLine();
						ps.write (nome + "\n");
						}
						while(nome.equals(""));

						do {
						
						System.out.println(" Inserisci il cognome del cadetto");
						cognome= 	input.nextLine();
						ps.write(cognome+ "\n");
						}
						while(cognome.equals(""));

						
						
						do {
						System.out.println(" Inserisci il nome dell'esercitazione");
						esercitazione= input.nextLine();
						if(!esercitazione.equals(""))ps.write(esercitazione+ "\n");
						}
						while(!esercitazione.equals(""));
					
						ps.write("#"+ "\n");
					}
				}
		
	
}
		
}


