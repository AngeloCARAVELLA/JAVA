package it.studenti.unisannio.caravella.angelo.classes;

import java.io.PrintStream;


public abstract class Ordination implements Comparable <Ordination > {
	public Ordination(String name, String type, double cost) {
		this.name=name;
		this.type=type;
		this.cost=cost;
		this.t=null;
	}
	public String getName() {
		return name;
	}
	public String getType() {
		return type;
	}

	public double getCost() {
		return cost;
	}
	

	
	
	public Table getTable() {
		return t;
	}

	public void setTable(Table t) {
		this.t = t;
	}
	
	public boolean equals(Object o) {
		Ordination or=null;
		if(o instanceof Ordination) {
			or=(Ordination) o;
			if(or.name.equals(this.name))
				return true;
		}
		return false;
	}
	
	public int hashCode() {
		return this.name.hashCode();
	}
	
	public abstract void print();
	public abstract void print(PrintStream ps);
	
	private String name, type;
	private double cost;
	private Table t;
	
}
