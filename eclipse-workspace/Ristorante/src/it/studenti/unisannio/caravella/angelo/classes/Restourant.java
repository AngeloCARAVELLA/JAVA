package it.studenti.unisannio.caravella.angelo.classes;


import java.io.PrintStream;

import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


import it.studenti.unisannio.caravella.angelo.utils.OrdinationNotFoundException;
import it.studenti.unisannio.caravella.angelo.utils.TableNotFoundException;

public class Restourant {

public Restourant(Scanner sc) throws ParseException {
	
	this.ordinations=new HashMap<String, Ordination>();
	this.tables=new HashMap<String, Table>();
	
	String label=sc.nextLine();
	
	while(!label.equals("")) {
		
		if(label.equals("Wine")) {
			Ordination o= Wine.read(sc);
			ordinations.put(o.getName(), o);
		}
		else if(label.equals("Plate")) {
			Ordination o= Plate.read(sc);
			ordinations.put(o.getName(), o);
		}
		label=sc.nextLine();
	}
}

public Table searchTablebyId(String id) {
	Table t=tables.get(id);
	if(t!=null) return t;
	else
		throw new TableNotFoundException("Table not found");
}

public Ordination searchOrdinationbyName(String name) {
	Ordination o=ordinations.get(name);
	if(o!=null) return o;
	else
		throw new OrdinationNotFoundException("Ordination not found");
}

public String addTable() {
	Table t= Table.read();
	tables.put(t.getId(), t);
	
	return t.getId();
}

public void addOrdination(String id, String name) {
	Table t=null;
	try{
		t= searchTablebyId(id);
	}
	catch(TableNotFoundException ex) {
		System.err.println("Catched an exception of type TableNotFoundException while reading the object: "+ name+""+ ex.getMessage());
		
	}
	Ordination o=null;
	try{
		o= searchOrdinationbyName(name);
	}
	catch(OrdinationNotFoundException ex) {
		System.err.println("Catched an exception of type OrdinationNotFoundException while reading the object: "+ name+""+ ex.getMessage());
		
	} 
	t.addOrdination(o);
	o.setTable(t);
}

public void printReceipt(String id, PrintStream ps) {
	Table t=null;
	try{
		t= searchTablebyId(id);
	}
	catch(TableNotFoundException ex) {
		System.err.println("Catched an exception of type TableNotFoundException while reading the object: "+ id+""+ ex.getMessage());
		
	}
	t.print(ps);
}


public Map<String, Ordination> getOrdinations() {
	return ordinations;
}
public Map<String, Table> getTables() {
	return tables;
}



private Map<String, Ordination> ordinations;
private Map<String, Table> tables;

}
