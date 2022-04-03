package it.unisannio.studenti.caravella.angelo.classes;

import java.io.PrintStream;
import java.text.ParseException;
import java.util.*;

public class Gestore {

	public Gestore(Scanner sc1, Scanner sc2) throws ParseException {
		// TODO Auto-generated constructor stub
		String i = null;
		int intero = 0;
		this.so1 = new TreeSet<Integer>().descendingSet();

		if (sc1.hasNextLine())
			i = sc1.nextLine();
		intero = Integer.parseInt(i);

		while (sc1.hasNextLine()) {

			this.so1.add(intero);
			i = sc1.nextLine();
			intero = Integer.parseInt(i);

		}


		if (sc2.hasNextLine())
			i = sc2.nextLine();
		intero = Integer.parseInt(i);

		while (sc2.hasNextLine()) {

			this.so1.add(intero);
			i = sc2.nextLine();
			intero = Integer.parseInt(i);

		}

	}

	public void PrintO1(PrintStream ps ) {

		
			for( Integer s: this.so1) {
				
				ps.println(s);
			}
		
		

	}

	

	private Set<Integer> so1;
}
