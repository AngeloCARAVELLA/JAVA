package it.unisannio.studenti.caravella.angelo.classes;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import it.unisannio.studenti.caravella.utils.Collezione_tester;
import it.unisannio.studenti.caravella.utils.Opera_tester;
import it.unisannio.studenti.caravella.utils.Tester;

public class Gestore {

	public Gestore(Scanner sc1, Scanner sc2) throws ParseException, FileNotFoundException {

		Libro_Rivista lr= Libro_Rivista.read(sc1);


		this.lib= new  HashMap<String, Libro_Rivista> ();
		this.riv= new HashMap<String, Libro_Rivista> ();
		while (lr!= null) {


			Libro_Rivista libro = new Libro_Rivista (lr.getId_l() , lr.getTitolo_l(), lr.getNum_a_l(), lr.getAutori_l() , lr.getAnno_p_l() ) ;

			this.lib.put(libro.getId_l(), libro);

			Libro_Rivista rivista = new Libro_Rivista (lr.getId_r(), lr.getTitolo_r(), lr.getData_p_r(), lr.getNum_art_r() , lr.getAl_r()) ;
			this.riv.put(rivista.getId_r(), rivista);


			lr= Libro_Rivista.read(sc1);
		}


		
		this.armap= new  ArrayList <HashMap<String, Opera>> ();
	
		Opera op= Opera.read(sc2);
		while( op != null) {
			HashMap hm= new HashMap<String, Opera> ();
			hm.put(op.getNome_stanza(), op);
			this.armap.add( hm);
			op= Opera.read(sc2);
		}
	setArmap(this.armap);
	}
	

	/**
	 * @return the armap
	 */
	public ArrayList<HashMap<String, Opera>> getArmap() {
		return armap;
	}


	/**
	 * @param armap the armap to set
	 */
	public void setArmap(ArrayList<HashMap<String, Opera>> armap) {
		this.armap = armap;
	}


	public void print() {
		for( Map.Entry<String, Libro_Rivista> l: this.lib.entrySet()) {
			System.out.println(l.getValue().toString_l());
			System.out.println(" ");
		}


		for( Map.Entry<String, Libro_Rivista> r: this.riv.entrySet()) {
			System.out.println(r.getValue().toString_r());
			System.out.println(" ");
		}


		this.armap= getArmap();
		int i=0;
		while( i< this.armap.size()) {
		
		System.out.println(this.armap.get(i));
			i++;
		}
	}

	public void printnum() {
		System.out.println("Il numero di libri e\': " + this.lib.size());
		System.out.println("Il numero di riviste e\': " +this.riv.size());
	}
	public void searchbookbyst(String string) {
		// TODO Auto-generated method stub

		System.out.println("L'autore chiamato: "+ string +" ha contribuito a scrivere questi libri:"  );

		for( Map.Entry<String, Libro_Rivista> l: this.lib.entrySet()) {
			Set <String> aut=l.getValue().getAutori_l();
			Iterator <String> it= aut.iterator();
			while(it.hasNext())
			{
				if(it.next().contentEquals(string)) 
				{
					System.out.println(l.getValue().getTitolo_l());

				}

			}



		}

		System.out.println("E ha scritto queste riviste:"  );

		for( Map.Entry<String, Libro_Rivista> l: this.riv.entrySet()) {
			HashMap <String,String> to= (HashMap<String, String>) l.getValue().getAl_r();

			for( Map.Entry<String, String> t: to.entrySet()) {
				if( t.getValue().equals(string))
					System.out.println(t.getKey());

			}



		}

	}
	
	


	
	public void printcolbyst(String  nome) {
		this.armap= getArmap();
		int i=0;
		while( i< this.armap.size()) {
			 HashMap<String, Opera> hm=new HashMap<String, Opera>();
			 hm= this.armap.get(i);
			 Set<String> st= hm.keySet();
			 for( String s: st) {
				 if( s.equals(nome))
				 {
					 hm.entrySet().forEach(entry-> {
						 System.out.println(entry);
						 
					 });
			 }
			i++;
		}
		
	}
	}
	

	public void printcolbyst_with_callback(String  nome) {
		this.armap= getArmap();
		int i=0;
		
		Opera_tester op= new Opera_tester(nome);
		
		while( i< this.armap.size()) {
			 HashMap<String, Opera> hm=new HashMap<String, Opera>();
			 hm= this.armap.get(i);
			 Set<String> st= hm.keySet();
			 for( String s: st) {
				 if( op.verify(hm.get(s)))
				 {
					 System.out.println("- data una collocazione, verificare se essa è occupata da un’opera e da quale");
					 hm.entrySet().forEach(entry-> {
						 System.out.println(entry);
						 
					 });
			 }
			i++;
		}
		
	}
	}

	public void printop_with_callback(int op) {
		this.armap= getArmap();
		int i=0;
		
		Collezione_tester col= new Collezione_tester(op);
		
		while( i< this.armap.size()) {
			 HashMap<String, Opera> hm=new HashMap<String, Opera>();
			 hm= this.armap.get(i);
			 Set<String> st= hm.keySet();
			 for( String s: st) {
				 if( col.verify(hm.get(s)))
				 {
					 System.out.println("- identificare la collocazione occupata da una data opera");
					 hm.entrySet().forEach(entry-> {
						 System.out.println(entry);
						 
					 });
			 }
			i++;
		}
		
	}
	}
	private HashMap<String, Libro_Rivista> lib;
	private HashMap<String, Libro_Rivista> riv;
	private ArrayList <HashMap<String, Opera>> armap;
}