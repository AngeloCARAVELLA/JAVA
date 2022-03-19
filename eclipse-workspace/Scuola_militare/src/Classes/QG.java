package Classes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import Utils.IdNotFoundException;

public class QG {
	private QG(HashMap<String, Esercitazioni> cl, HashMap<String, Iscritto> aqs) {
		this.cl=cl;
		this.aqs=aqs;
	}

	public QG(Scanner sc1, Scanner sc2) {
		this.cl= new HashMap<String, Esercitazioni> ();
		Esercitazioni cll= Esercitazioni.read(sc1);

		while(cll != null) {

			this.cl.put(cll.getId(), cll);
			cll= Esercitazioni.read(sc1);
		}


		this.aqs=new HashMap<String, Iscritto>();
		Iscritto aq= Iscritto.read(sc2);

		while(aq != null ) {		

			this.aqs.put(aq.getMatricola(), aq);
			aq= Iscritto.read(sc2);

		}
	}	
	
	
	
	public QG(Scanner sc1, Scanner sc2, String  input) {
		this.cl= new HashMap<String, Esercitazioni> ();
		Esercitazioni cll= Esercitazioni.read(sc1);

		while(cll != null) {

			this.cl.put(cll.getId(), cll);
			cll= Esercitazioni.read(sc1);
		}


		this.aqs=new HashMap<String, Iscritto>();
		Iscritto aq= Iscritto.read(sc2);

		while(aq != null ) {		
			if(!aq.getMatricola().equals(input))
			this.aqs.put(aq.getMatricola(), aq);
			aq= Iscritto.read(sc2);

		}
	}	  
	/*
	public void remove(String  input) {
		
		for (Map.Entry<String, Iscritto> d : this.aqs.entrySet()) 
		{
			if(d.getValue().getMatricola().equals(input)) {
				this.aqs.remove(input);
				System.out.println(this.aqs);
				
			}
			
		
		}
		
	}	
	
	*/
	
	public boolean searchid(String obj) {

		boolean vr=false;
		for (Map.Entry<String, Esercitazioni> e : this.cl.entrySet()) {
			if(e.getValue().getId().equals(obj)) vr=true;

		}


		return vr;
	}
	public void searchid_(String obj) {


		for (Map.Entry<String, Esercitazioni> e : this.cl.entrySet()) {
			if(e.getValue().getId().equals(obj)) System.out.println( e.getKey()+ e.getValue());


		}


	}
	public void printall( ) {


		for (Map.Entry<String, Esercitazioni> e : this.cl.entrySet()) {
			System.out.println(e.getKey()+ e.getValue());
			System.out.println(" ");
		}

		for (Map.Entry<String, Iscritto> d : this.aqs.entrySet()) 
		{

			System.out.println(d.getKey()+ d.getValue());
			System.out.println(" ");
		}

	}
	public boolean freshman_(String obj) {
		boolean vr=false;
		for (Map.Entry<String, Iscritto> d:this.aqs.entrySet())
		{ 

			if(d.getValue().getMatricola().equals(obj))vr= true;
		}

		return vr;
	}

	public void freshman(String obj) {

		for (Map.Entry<String, Iscritto> d:this.aqs.entrySet())
		{ 

			if(d.getValue().getMatricola().equals(obj))
				System.out.println(d.getValue().toString());

		}
	}

	public int findmaxex() {

		int size=0;

		for (Map.Entry<String, Iscritto> d:this.aqs.entrySet())
		{ 
			if( d.getValue().getEs().size()>size) 
				size= d.getValue().getEs().size();
		}
		return size;

	}
	public void printmaxex() {
		int size= findmaxex();

		for (Map.Entry<String, Iscritto> d:this.aqs.entrySet())
		{ 
			if( d.getValue().getEs().size()==size) 

				System.out.println("Il numero di esercitazioni per il soldato " + d.getValue().getNome()+ " e\' "+ size + " e' il più volenteroso");



		}


	}



	public boolean  printex_(String obj) {
		boolean vr=false;
		for (Map.Entry<String, Iscritto> d:this.aqs.entrySet())
		{ 
			if(d.getValue().getMatricola().equals(obj))
			{
				if(d.getValue().getEs().size()==0)System.out.println("Attenzione il cadetto "+ d.getValue().getNome()+ " non ha esercitazioni in corso " );
				vr= true;
			}
		}

		return vr;
	}

	public void  printex(String obj) {

		for (Map.Entry<String, Iscritto> d:this.aqs.entrySet())
		{ 

			if(d.getValue().getMatricola().equals(obj)&& (d.getValue().getEs().size()!= 0))
			{
				System.out.println(" Il cadetto di nome "+ d.getValue().getNome()+ " partecipa alle seguenti esercitazioni");
				ArrayList<String> at= d.getValue().getEs();
				for(int i=0; i<at.size(); i++) {
					System.out.println( at.get(i));
				}
			}

		}
	}
	public  void findtizioattcamp(String atr , String c ) {


		for (Map.Entry<String, Esercitazioni > d:this.cl.entrySet())
		{


			if(d.getValue().getNome_campo().strip().equals(c)) 
			{
				System.out.println( "Il campo esiste ");
				this.id=d.getValue().getId();

				ArrayList<String> atre= d.getValue().getSt();
				for ( int i =0 ; i< atre.size(); i++ ) {

					if( atre.get(i).equals(atr))  {
						System.out.println( "I seguenti cadetti hanno utilizzato l'attrezzatura: "+ atre.get(i));
						findtizioattcamp_(); 
					}
				}
			}}


	}



	public  boolean excamp (String atr , String c ) {

		boolean vr=false;
		for (Map.Entry<String, Esercitazioni > d:this.cl.entrySet())
		{


			if(d.getValue().getNome_campo().strip().equals(c)) 
			{
				System.out.println( "Il campo esiste ");
				this.id=d.getValue().getId();
				vr=true;
				ArrayList<String> atre= d.getValue().getSt();
				for ( int i =0 ; i< atre.size(); i++ ) {

					if( atre.get(i).equals(atr))  {
						System.out.println( "L'attrezzatura esiste ");
						vr=true;
					
					}

				}
			}



		}
		return vr;

	}


	public void findtizioattcamp_() {	


		for (Map.Entry<String, Iscritto> d:this.aqs.entrySet())
		{ 
			ArrayList<String> ast=  d.getValue().getEs();
			for ( int i =0 ; i< ast.size(); i++ ) {

				if( ast.get(i).equals(this.id)) System.out.println(d.getValue().getMatricola()) ;
			}
		}


	}	


	private HashMap<String, Esercitazioni> cl;
	private HashMap <String, Iscritto> aqs; 
	private String id;

}
