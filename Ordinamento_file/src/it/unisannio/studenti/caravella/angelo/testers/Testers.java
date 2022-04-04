package it.unisannio.studenti.caravella.angelo.testers;

import java.io.*;
import java.text.ParseException;
import java.util.*;

import it.unisannio.studenti.caravella.angelo.classes.Ordina_file;

public class Testers {

	public static void main(String[] args) throws FileNotFoundException, ParseException {
		// TODO Auto-generated method stub
		Scanner sc1 = new Scanner(new File("f1.txt"));
		Scanner sc2 = new Scanner(new File("f2.txt"));
		PrintStream ps = new PrintStream(new File("f3.txt"));
		Ordina_file gg = new Ordina_file(sc1, sc2);

		gg.Print(ps);
	}

}
