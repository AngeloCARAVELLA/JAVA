package it.studenti.unisannio.caravella.angelo.classes;

import java.io.PrintStream;



import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;


public class Table implements Comparable <Table>{



	public Table(String id, double peopleNumber) {
		this.id=id;
		this.peopleNumber=peopleNumber;
		this.ordinations=new TreeMap<String, Ordination>();
	}

	public static Table read() {
		Scanner sc= new Scanner (System.in);
		System.out.println("Inserisci id del tavolo");
		String id=sc.nextLine();
		if(id.equals("")) return null;
		System.out.println("Inserisci numero di persone");
		String peopleNumberS=sc.nextLine();
		if(peopleNumberS.equals("")) return null;
		double peopleNumber=0;
		try {
			peopleNumber=Double.parseDouble(peopleNumberS);
		}
		catch(NumberFormatException ex) {
			System.err.println("Catched an exception of type NumberFormatException while reading the object: "+ id+" "+ ex.getMessage());
			System.err.println("Please insert the cost again");
			Scanner scT= new Scanner (System.in);
			peopleNumberS=scT.nextLine();
			peopleNumber=Double.parseDouble(peopleNumberS);
		}
		return new Table(id, peopleNumber);
	}
	
	public String getId() {
		return id;
	}
	public double getPeopleNumber() {
		return peopleNumber;
	}

	public Map<String, Ordination> getOrdinations() {
		return ordinations;
	}
	
	public void addOrdination(Ordination o) {
		this.ordinations.put(o.getName(), o);
	}
	
	public double calcPay() {
		double totalCost=0;
		
		Set<String> keys= ordinations.keySet();
		
		for(String s: keys) {
			totalCost=totalCost+ordinations.get(s).getCost();
		}
		return totalCost;
	}
	
	public boolean equals(Object o) {
		Table t=null;
		if(o instanceof Table) {
			t=(Table) o;
			if(t.id.equals(id))
				return true;
		}
		return false;
	}
	
	public int hashCode() {
		return this.id.hashCode();
	}
	


	public void print() {
		System.out.println(this.id);
		System.out.println(this.peopleNumber);
		this.printOrdinations();
		System.out.println(this.calcPay());
		
	}
	
	public void printOrdinations() {
		Set<String> set= ordinations.keySet();
		for(String s: set) {
			ordinations.get(s).print();
		}
	}
	public void printOrdinations(PrintStream ps) {
		Set<String> set= ordinations.keySet();
		for(String s: set) {
			ordinations.get(s).print(ps);
		}
	}
	
	public void print(PrintStream ps) {
		ps.println(this.id);
		ps.println(this.peopleNumber);
		this.printOrdinations(ps);
		ps.println(this.calcPay());
	}
	

	private String id;
	private double peopleNumber;
	private Map<String, Ordination> ordinations;
	@Override
	public int compareTo(Table o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
