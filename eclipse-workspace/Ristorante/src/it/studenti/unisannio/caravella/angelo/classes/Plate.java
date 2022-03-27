package it.studenti.unisannio.caravella.angelo.classes;

import java.io.PrintStream;



import java.util.Scanner;



public class Plate extends Ordination {

	
	public Plate(String name, String type, double cost) {
		super(name,type,cost);
	}
	
	public static Plate read(Scanner sc) {
		if(!sc.hasNextLine()) return null;
		String name=sc.nextLine();
		if(!sc.hasNextLine()) return null;
		String type=sc.nextLine();
		if(!sc.hasNextLine()) return null;
		String costS="";
		double cost=0;
		try {
			costS=sc.nextLine();
			cost=Double.parseDouble(costS);
		}
		catch(NumberFormatException ex) {
			System.err.println("Catched an exception of type NumberFormatException while reading the object: "+ name+""+ ex.getMessage());
			System.err.println("Please insert the cost again");
			Scanner scT= new Scanner (System.in);
			costS=scT.nextLine();
			cost=Double.parseDouble(costS);
		}
		
		return new Plate(name, type, cost);
		
	}
	
	public static Plate read() {
		Scanner sc= new Scanner (System.in);
		
		String name=sc.nextLine();
		if(name.equals("")) return null;
		String type=sc.nextLine();
		if(name.equals("")) return null;
		String costS="";
		double cost=0;
		try {
			costS=sc.nextLine();
			if(costS.equals("")) return null;
			cost=Double.parseDouble(costS);
			
		}
		catch(NumberFormatException ex) {
			System.err.println("Catched an exception of type NumberFormatException while reading the object: "+ name+""+ ex.getMessage());
			System.err.println("Please insert the cost again");
			Scanner scT= new Scanner (System.in);
			costS=scT.nextLine();
			cost=Double.parseDouble(costS);
		}
		
		return new Plate(name, type, cost);
	}

	
	public int compareTo(Plate o) {
		
		return 0;
	}
	
	public void print() {
		this.print(System.out);
	}
	
	public void print(PrintStream ps) {
		ps.println(this.getName());
		ps.println(this.getType());
		ps.println(this.getCost());
	}

	@Override
	public int compareTo(Ordination o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}

