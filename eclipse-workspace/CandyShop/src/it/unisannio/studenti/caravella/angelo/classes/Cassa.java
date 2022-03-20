package it.unisannio.studenti.caravella.angelo.classes;
import java.text.ParseException;

import java.util.*;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

import it.unisannio.studenti.caravella.angelo.utils.ClientNotFoundException;

public class Cassa {

	public Cassa(Scanner sc1, Scanner sc2) throws ParseException {
		// TODO Auto-generated constructor stub

		this.cl =new HashMap<String , Clienti> ();
		Clienti lc= Clienti.read(sc1);

		while(lc!= null) {
			this.cl.put(lc.getCodice_fiscale(), lc);
			lc= Clienti.read(sc1);
		}

		this.aq= new HashMap<String ,Acquisti> ();
		Acquisti aq= Acquisti.read(sc2);

		while(aq!= null)

		{	

			Clienti cliente= SearchClient(aq.getCodice_fiscale() );
			if(cliente== null) {
				cliente= Clienti.read();
				this.cl.put(cliente.getCodice_fiscale(), cliente);

			}
			this.aq.put(aq.getId(), aq);
			aq= Acquisti.read(sc2);

		}



	}

	public void printall() {

		this.aq.entrySet().forEach(entry-> {

			System.out.println( entry.getKey()+entry.getValue().toString() );
		});

		this.cl.entrySet().forEach(entry-> {

			System.out.println( entry.getKey()+entry.getValue().toString());
		});
	}

	public void NumberOfClients(String tipo ,Date data) {

		int i=0;


		for(Map.Entry<String ,Acquisti> q: this.aq.entrySet() ) {

			if( q.getValue().getData().equals(data))
			{
				for( Map.Entry<String , Prodotti > pp: q.getValue().getPr().entrySet() ) {

					if( pp.getValue().getTipologia().equals(tipo))
						i++;
				}
			}
		}

		System.out.println("Sono stati trovati tot clienti: "+ i);

	}

	public void ProductsSold(String tipo, Date data ) {



		for(Map.Entry<String ,Acquisti> q: this.aq.entrySet() ) {

			if( q.getValue().getData().equals(data))
			{
				for( Map.Entry<String , Prodotti > pp: q.getValue().getPr().entrySet() ) {

					if( pp.getValue().getTipologia().equals(tipo))
						System.out.println(pp.getValue().toString());
				}
			}
		}


	}
	public void NumberOfProductsSold(String tipo ) {


		int i=0;
		for(Map.Entry<String ,Acquisti> q: this.aq.entrySet() ) {


			for( Map.Entry<String , Prodotti > pp: q.getValue().getPr().entrySet() ) {

				if( pp.getValue().getTipologia().equals(tipo))
					i++;
			}

		}

		System.out.println("Sono stati trovati tot prodotti: "+ i);
	}

	public void SortClient() {

int temp= 0; 

		LinkedList<String> ew= new 	LinkedList<String>();
		
		for(Map.Entry<String ,Acquisti> q: this.aq.entrySet() ) {
		
		if(q.getValue().getPr().size()>temp)
		{
			temp= q.getValue().getPr().size();
			
			ew.add(q.getValue().getCodice_fiscale());
		}
		else 
		
		ew.addFirst(q.getValue().getCodice_fiscale());
	
	}
		
		for (int i = 0; i <ew.size(); i++) {
            System.out.println(i +" = "+ew.get(i));
        }		
		
	}
	
	public void SortClientCost() {

		double temp= 0; 

				LinkedList<String> ew= new 	LinkedList<String>();
				
			for( Map.Entry<String ,Acquisti> wew: this.aq.entrySet()) {
				
				for( Map.Entry<String ,Prodotti> wsa: wew.getValue().getPr().entrySet() ) {
					
					if(wsa.getValue().getPrezzo()>temp) {
						temp= wsa.getValue().getPrezzo();
						ew.add(wew.getValue().getCodice_fiscale());
					}
					else
						ew.addFirst(wew.getValue().getCodice_fiscale());
					
				}
				
			}
			for (int i = 0; i <ew.size(); i++) {
	            System.out.println(i +" = "+ew.get(i));
	        }	
				
			}
	public Clienti SearchClient(String id) {

		Clienti cl= this.cl.get(id);

		if( cl != null) return cl;

		else throw new  ClientNotFoundException("Non esiste nessun cliente collegato a quell' acquisto");


	}


	private HashMap<String , Clienti> cl;
	private HashMap<String ,Acquisti> aq;
}
