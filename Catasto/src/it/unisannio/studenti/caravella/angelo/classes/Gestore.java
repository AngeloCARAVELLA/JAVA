package it.unisannio.studenti.caravella.angelo.classes;

import java.text.ParseException;
import java.util.*;

public class Gestore {

	public Gestore(Scanner sc1, Scanner sc2, Scanner sc3) throws ParseException {
		// TODO Auto-generated constructor stub

		Proprietari po = Proprietari.read(sc1);
		this.sp = new HashSet<Proprietari>();

		while (po != null) {
			this.sp.add(po);
			po = Proprietari.read(sc1);

		}

		String input_label;

		input_label = sc2.nextLine();
		this.sa = new TreeSet<Abitazioni>();
		while (input_label != null) {

			if (input_label.equals("appartamento")) {

				Abitazioni ab = Appartamenti.read(sc2);
				this.sa.add(ab);
				if (!sc2.hasNextLine())
					break;
				input_label = sc2.nextLine();
			}

			else if (input_label.equals("indipendente")) {
				Abitazioni ab = Soluzioni.read(sc2);
				this.sa.add(ab);
				if (!sc2.hasNextLine())
					break;
				input_label = sc2.nextLine();
			}

		}
	
		this.st=new TreeMap<String, String>();
		String s1, s2 = null;
		do {
			if (!sc3.hasNextLine())
				break;
			s1 = sc3.nextLine();
			
			
			if (!sc3.hasNextLine())
				break;
			s2 = sc3.nextLine();
			Abitazioni a= new Abitazioni(s2);
			this.st.put(a.getId(), s2);
			
		} while (s2!= null && s1 != null );

	}

	public void FindAb(String string) {
		// TODO Auto-generated method stub
		for (Abitazioni a : this.sa) {
			if (a.getComune().equals(string))
				System.out.println(a.getId());
		}
	}

	public void FindAb(String string, int i) {
		// TODO Auto-generated method stub
		for (Abitazioni a : this.sa) {
			if (a.getComune().equals(string) && a.getValore() < i)
				System.out.println(a.getId());
		}
	}

	public void PrintSolutions() {
		this.st.entrySet().forEach(entry->{
			
			if(Search(entry.getKey()))
				System.out.println( entry.getKey()+ " " + entry.getValue());
		});
		
	}
	
	private boolean Search(String ss) {
		boolean status=false;
		String luogo= null;
		for(Abitazioni s: this.sa) {
				if( s.getId().equals(ss))
					luogo = s.getComune() ;
		}
		for( Proprietari s: this.sp) {
			if( s.getLuogo().equals(luogo)) status=true;
		}
		
		return status;
	}
	public void PrintAlotOfP() {
		// TODO Auto-generated method stub
		
	}
	private Set<Abitazioni> sa;
	private Set<Proprietari> sp;
	
	private Map<String, String> st;

	
}
