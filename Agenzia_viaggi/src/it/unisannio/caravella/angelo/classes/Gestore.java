package it.unisannio.caravella.angelo.classes;

import java.io.File;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

import it.unisannio.caravella.angelo.utils.Tester;
import it.unisannio.caravella.angelo.utils.TesterPrenotazioni;
import it.unisannio.caravella.angelo.utils.TesterTripById;
import it.unisannio.caravella.angelo.utils.TripNotFoundException;

public class Gestore {
	/**
	 * @param ac
	 * @param pv
	 */	
	public Gestore(Scanner sc1, Scanner sc2, Scanner sc3 ) throws ParseException {


		this.pv= new  HashMap<String, Pacchetti_viaggio>();
		Pacchetti_viaggio pav= Pacchetti_viaggio.read(sc1);

		while( pav!= null) {
			this.pv.put(pav.getIdentificativo(), pav);
			pav= Pacchetti_viaggio.read(sc1);
		}

		this.ac= new HashMap<String, Archivio_di_clienti>();
		Archivio_di_clienti cl= Archivio_di_clienti.read(sc2);

		while( cl!= null) {
			this.ac.put(cl.getIdentificativo(),cl);
			cl = Archivio_di_clienti.read(sc2);
		}

		this.sn= new  HashMap <String , Prenotazioni >();
		Prenotazioni pn= Prenotazioni.read(sc3);

		while(pn!= null) {
			SearchClient(pn.getIdentificativo_cliente());
			this.sn.put(pn.getIdentificativo_cliente(), pn);
			pn= Prenotazioni.read(sc3);
		}

	}

	public 	Gestore Cerca_viaggi(String id) {


		TesterTripById ts= new TesterTripById(id);


		return this.Cerca_viaggi_(ts); 

	}

	public Gestore Cerca_soluzione( double durata_m, double importo_massimo) {
		TesterPrenotazioni tp = new TesterPrenotazioni(durata_m , importo_massimo);


		return this.Cerca_soluzione(tp);
	}

	
	private Gestore Cerca_soluzione(Tester tp) {
		
		HashMap<String, Pacchetti_viaggio> c= new HashMap<String, Pacchetti_viaggio>();
		Set<String >keys=this.pv.keySet();

		for(String s: keys ) {
			if( tp.verify(pv.get(s))) {

				c.put(s,pv.get(s));

			}	
		}
		c.entrySet().forEach(entry -> {
			System.out.println( entry.getKey() + " = " + entry.getValue());	
		});
		
		return new Gestore( c);
		
	}

	private Gestore Cerca_viaggi_(Tester ts) {

		HashMap<String, Pacchetti_viaggio> filteredpv= new HashMap<String, Pacchetti_viaggio>();
		Set<String >keys=this.pv.keySet();

		for(String s: keys ) {
			if( ts.verify(pv.get(s))) {

				filteredpv.put(s,pv.get(s));

			}	
		}
		filteredpv.entrySet().forEach(entry -> {

			System.out.println( entry.getKey() + " = " + entry.getValue());

		});

		return new Gestore(filteredpv);
	}


	public void SearchTrip(String  id) {

		Pacchetti_viaggio pav= pv.get(id);

		if( pav== null) {	
			//System.out.println( "Il viaggio desiderato NON esiste!");

			throw new TripNotFoundException("Trip not found");
		}
		else System.out.println( "Il viaggio desiderato esiste!");
	}
	public  void  SearchClient(String  id) {
		Archivio_di_clienti c1= ac.get(id);

		if(c1==null) {
			System.out.println("Creazione di un nuovo cliente con quell' id: ");
			Archivio_di_clienti c2= Archivio_di_clienti.read();
			while( c2!= null) {
				this.ac.put(id,c2);
				c2= Archivio_di_clienti.read();
			}
		}
	}

	/**
	 * @param ac
	 * @param pv
	 * @param sn
	 */
	public Gestore(HashMap<String, Archivio_di_clienti> ac, HashMap<String, Pacchetti_viaggio> pv,
			HashMap<String, Prenotazioni> sn) {
		super();
		this.ac = ac;
		this.pv = pv;
		this.sn = sn;
	}


	public Gestore(HashMap<String, Pacchetti_viaggio> filteredpv) {
		// TODO Auto-generated constructor stub
		this.pv=filteredpv;
	}

	public void Printwithout(String imm, PrintStream ps) throws FileNotFoundException {

		for(Map.Entry<String, Pacchetti_viaggio > d: this.pv.entrySet()) {
			Printwithout(imm);
			if( !d.getValue().getIdentificativo().equals(imm)) {
				ps.println(d.getValue().getIdentificativo());
				ps.println(d.getValue().getDestinazione());
				ps.println(d.getValue().getNumero_di_giorni());
				ps.println(d.getValue().getNumero_di_p_d());
				ps.println(d.getValue().getCost_p());

			}
		}


	}


	public void Printwithout(String imm) throws FileNotFoundException {

		PrintStream ps= new PrintStream (new File ("booking.dati" ));
		for(Entry<String, Prenotazioni> d: this.sn.entrySet()) {

			if(!d.getValue().getIdentificativo_viaggio().equals(imm)) {

				ps.print(d.getValue().getIdentificativo_viaggio());
				ps.print(d.getValue().getIdentificativo_cliente());
				ps.print(d.getValue().getNumero_posti_prenotati());
				ps.print(d.getValue().getData_di_partenza());
			}


		}


	}

	public void Printwithout_(String imm, PrintStream ps) {


		for(Map.Entry<String, Archivio_di_clienti > d: this.ac.entrySet()) {

			if( !d.getValue().getIdentificativo().equals(imm)) {
				ps.println(d.getValue().getIdentificativo());
				ps.println( d.getValue().getNome());
				ps.println(d.getValue().getCognome());
				ps.println(d.getValue().getCittà_di_residenza());
				ps.println(d.getValue().getNumero_tel());

			}



		}
	}
	private HashMap<String, Archivio_di_clienti> ac;
	private HashMap<String, Pacchetti_viaggio> pv;
	private HashMap <String , Prenotazioni > sn;
}
