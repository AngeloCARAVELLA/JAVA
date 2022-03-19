package Tester;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Nuove_esercitazioni {



	public static void main (String [] args) throws IOException
	{
		try (Scanner input = new Scanner (System.in)) {
			try (BufferedWriter ps = new BufferedWriter(new FileWriter("Esercitazioni.dati", true))) {
				String id;
				String denominazione;
				String data_inizio;
				String data_fine;
				String nome_campo;
				String attrezzature;
				do{
				System.out.println(" Inserisci un id");
				id= input.nextLine();
				}
				while(id.equals(""));
				ps.write(id+ "\n");
				do{
					
				System.out.println(" Inserisci una denominazione");
				denominazione= input.nextLine();
				}
				while(denominazione.equals(""));
				ps.write(denominazione+ "\n");
				do {
				
				System.out.println(" Inserisci una data di inzio");
				data_inizio= 	input.nextLine();
				}
				while(data_inizio.equals(""));
				ps.write(data_inizio+ "\n");
				
				do {
				System.out.println(" Inserisci una data di fine");
				data_fine= 	input.nextLine();
				}
				while(data_fine.equals(""));
				ps.write(data_fine+ "\n");
				do {
				System.out.println(" Inserisci il nome di un campo");
				nome_campo=input.nextLine();
				}
				while(nome_campo.equals(""));
				
				ps.write(nome_campo+ "\n");
				do {
				System.out.println(" Inserisci il nome di un attrezzatura");
				attrezzature= input.nextLine();
				if(!attrezzature.equals(""))ps.write(attrezzature+ "\n");
				}
				while(!attrezzature.equals(""));
				
				
				ps.write("#"+ "\n");
			}
		}
		
		
	}
}
