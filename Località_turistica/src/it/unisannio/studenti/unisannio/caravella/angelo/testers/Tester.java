package it.unisannio.studenti.unisannio.caravella.angelo.testers;

import java.util.*;

import it.unisannio.studenti.unisannio.caravella.angelo.classes.Segreteria;

import java.io.*;

public class Tester {

	public static void main(String[] args) throws FileNotFoundException {

		PrintStream ps1 = new PrintStream("preferenze.dati");
		PrintStream ps2 = new PrintStream("statistiche.dati");

		Segreteria sg = new Segreteria(ps1, ps2);

	}

}
