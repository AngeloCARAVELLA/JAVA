package it.unisannio.studenti.caravella.angelo.classes;
import java.util.*;
import java.io.*;
import java.text.ParseException;

public class Tester {

	public static void main(String []args ) throws FileNotFoundException, ParseException {

		Scanner sc1= new Scanner( new File( "f1.txt"));
		Scanner sc2= new Scanner(new File( "f2.txt") );
		PrintStream p= new PrintStream(new File( "f3.txt") );
		
		Gestore gg=new Gestore(sc1, sc2);
	
		gg.PrintO1(p);
	
		
	}

}
