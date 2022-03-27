package it.studenti.unisannio.caravella.angelo.classes;

import java.io.PrintStream;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

import it.studenti.unisannio.caravella.angelo.utils.Constants;
import it.studenti.unisannio.caravella.angelo.utils.InvalidDateException;

public class Wine extends 	Ordination  {


	public Wine(String nome, String tipo, Double costo, Date anno) {
		super(nome, tipo, costo);
		// TODO Auto-generated constructor stub
		this.annata=anno;
	}
	public static Wine read(Scanner sc) throws ParseException {
		if( !sc.hasNextLine())return null;
		String nome= sc.nextLine();
		
		if( !sc.hasNextLine())return null;
		String tipo= sc.nextLine();
		
		if( !sc.hasNextLine())return null;
		String costo= null;
		Double prezzo = 0.0; 
		try {
			costo= sc.nextLine();
			prezzo= Double.parseDouble(costo);
			
		}
		catch ( NumberFormatException ex) {
			System.err.println("Catturata un'eccezione di tipo NumberFormatException per l'oggetto di nome: "+ nome + ex.getMessage());
			System.err.println("Per favore inserisca il costo di nuovo: ");
			Scanner input = new Scanner (System.in);
			costo = input.nextLine();
			prezzo= Double.parseDouble(costo);
			
		}
		
		
		Date data_v= null;
		
		try {

			if( !sc.hasNextLine())return null;
			String data= sc.nextLine();
			data_v= Constants.yyyy.parse(data);
		}
		catch ( ParseException ex ) {
			System.err.println( "Catturata un'eccezione di tipo ParseException sull'oggetto : "+ nome+ ex.getMessage());
			System.err.println("La data sarà settata a quella di default:  ");
			data_v= new Date();
		}
		nome=nome.strip();
		tipo =tipo.strip();
		
		return new Wine ( nome, tipo, prezzo, data_v);
	}
	public static Wine read() throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Inserisci il nome del vino:");
		String nome= sc.nextLine();
		if(nome.equals(""))return null;
		
		System.out.println("Inserisci il tipo di vino :");
		String tipo= sc.nextLine();
		if( tipo.equals(""))return null;
		
		System.out.println("Inserisci il costo del vino");
		String costo= null;
		Double prezzo = 0.0; 
		try {
			costo= sc.nextLine();
			if( costo.equals(""))return null;
			prezzo= Double.parseDouble(costo);
			
		}
		catch ( NumberFormatException ex) {
			System.err.println("Catturata un'eccezione di tipo NumberFormatException per l'oggetto di nome: "+ nome + ex.getMessage());
			System.err.println("Per favore inserisca il costo di nuovo: ");
			Scanner input = new Scanner (System.in);
			costo = input.nextLine();
			prezzo= Double.parseDouble(costo);
			
		}
		
		
		String data= sc.nextLine();
		if(data.equals(""))return null;
		Date data_v= null;
		
		Date datacorrente= Constants.yyyy.parse("2022");
		try {
		data_v= Constants.yyyy.parse(data);
		if( data_v.after(datacorrente))
			throw new InvalidDateException( "La data  del vino non è corretta");
		}
		catch ( ParseException ex ) {
			System.err.println( "Catturata un'eccezione di tipo ParseException sull'oggetto : "+ nome+ ex.getMessage());
			System.err.println("La data sarà settata a quella di default:  ");
			data_v= new Date();
		}
		catch ( InvalidDateException ex ) {
			System.err.println( "Catturata un'eccezione di tipo InvalidDateException  sull'oggetto : "+ nome+ ex.getMessage());
			System.err.println("La data sarà settata a quella di default:  ");
			data_v= new Date();
		}
		nome=nome.strip();
		tipo =tipo.strip();
		
		return new Wine ( nome, tipo, prezzo, data_v);
	}




	private String nome;
	private String tipo;
	private Double prezzo;
	private Date annata;
	@Override
	public int compareTo(Ordination o) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public void print() {
		// TODO Auto-generated method stub
		this.print(System.out);
	}
	@Override
	public void print(PrintStream ps) {
		// TODO Auto-generated method stub
		
		ps.println( this.getName());
		ps.println( this.getType());
		ps.println( this.getCost());
		ps.println( this.getAnnata());
		
	}
	/**
	 * @return the annata
	 */
	public Date getAnnata() {
		return annata;
	}
	/**
	 * @param annata the annata to set
	 */
	public void setAnnata(Date annata) {
		this.annata = annata;
	}
	
}
