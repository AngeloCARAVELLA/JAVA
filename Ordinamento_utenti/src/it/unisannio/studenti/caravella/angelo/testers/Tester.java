package it.unisannio.studenti.caravella.angelo.testers;
import java.io.*;
import java.text.ParseException;
import java.util.*;

import it.unisannio.studenti.caravella.angelo.classes.Gestore;

public class Tester {

	public static void main( String[] args) throws FileNotFoundException, ParseException {
		
		Scanner sc= new Scanner (new File("file.txt"));
	
		Gestore gg=new Gestore( sc);
	}
}
