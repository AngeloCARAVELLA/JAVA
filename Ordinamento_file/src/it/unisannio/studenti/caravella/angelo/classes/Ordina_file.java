package it.unisannio.studenti.caravella.angelo.classes;

import java.io.*;
import java.text.ParseException;
import java.util.*;

public class Ordina_file {

	public Ordina_file(Scanner sc1, Scanner sc2) throws ParseException {
		// TODO Auto-generated constructor stub

		Libro l = Libro.read(sc1);
		this.sl = new TreeSet<Libro>().descendingSet();
		while (l != null) {

			this.sl.add(l);
			l = Libro.read(sc1);
		}
		Libro L = Libro.read(sc2);

		while (L != null) {

			this.sl.add(L);
			L = Libro.read(sc2);
		}

	}

	public void Print(PrintStream ps) {
		// TODO Auto-generated method stub
		for (Libro l : this.sl) {

			System.out.println(l.toString());
			ps.println(l.getAutore());
			ps.println(l.getTitolo());
			ps.println(l.getAnno());
			
		}
	}

	private Set<Libro> sl;

}
