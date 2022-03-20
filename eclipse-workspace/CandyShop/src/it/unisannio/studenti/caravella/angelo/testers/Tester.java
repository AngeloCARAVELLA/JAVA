package it.unisannio.studenti.caravella.angelo.testers;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.*;

import it.unisannio.studenti.caravella.angelo.classes.Cassa;
import it.unisannio.studenti.caravella.angelo.utils.Constants;


public class Tester {

	public static void main (String [ ] args) throws FileNotFoundException, ParseException {
		
		Scanner sc1= new Scanner (new File("Clienti.dati"));
		
		Scanner sc2= new Scanner (new File("Acquisti.dati"));

		
		Scanner sc= new Scanner (System.in);
		Cassa cs= new Cassa(sc1, sc2);
		
		
		
		System.out.println("Determinare quanti clienti abbiano acquistato prodotti in un certo mese di un certo anno.\n"
				+ " Determinare la lista di tutti i prodotti di un certo tipo sono stati venduti in una certa data.\n"
				+ " Conoscere quante volte un certo prodotto (di un certo tipo) sia stato venduto.\n"
				+ " Ordinare i clienti per numero decrescente di acquisti eseguiti.\n"
				+ " Ordinare i clienti per importo decrescente complessivamente speso.");
		
		/*
		System.out.println("Inserisci la tipologia di prodotto da ricercare: "); 
		String tipo=sc.nextLine();
		System.out.println("Inserisci la data "); 
		String data_s= sc.nextLine();
		
		Date data= Constants.ggmmyy.parse(data_s);
		cs.NumberOfClients(tipo, data);
		cs.ProductsSold(tipo, data);
		cs.NumberOfProductsSold(tipo);
		*/
		//cs.SortClient();
		cs.SortClientCost();
	}

}
