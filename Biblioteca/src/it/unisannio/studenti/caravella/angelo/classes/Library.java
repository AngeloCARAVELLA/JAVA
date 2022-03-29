package it.unisannio.studenti.caravella.angelo.classes;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.*;
import java.util.function.BiFunction;

public class Library {

	public Library(Scanner sc1, Scanner sc2) throws ParseException {

		String id = null;
		this.sp = new HashMap<String, PhysicalMedium>();
		do {
			if (!sc1.hasNextLine())
				break;
			id = sc1.nextLine();
			if (id.startsWith("l", 0)) {

				PhysicalMedium v = Book.read(id, sc1);
				this.sp.put(v.getId(), v);

			} else if (id.startsWith("d", 0)) {

				PhysicalMedium d = DVD.read(id, sc1);
				this.sp.put(d.getId(), d);

			}
		} while (id != null);
		this.sl = new HashSet<Loan>();
		this.ul = new HashMap<User, Loan>();
		Loan l = Loan.read(sc2);

		while (l != null) {
			User u = l.getU();
			Loan l_d = new Loan(l.getId(), l.getInizio(), l.getFine());
			this.ul.put(u, l_d);
			this.sl.add(l);
			l = Loan.read(sc2);
		}

	}

	public void printAll() {
		Set<String> sp = this.sp.keySet();
		for (String s : sp) {

			System.out.println(this.sp.get(s).getTitolo());
		}

		sl.forEach(entry -> {

			System.out.println(entry.toString());
		});

	}

	public void the_longest_loan() {
		// TODO Auto-generated method stub
		int temp = 0;
		int distance = 0;
		for (Loan l : sl) {
			LocalDate d_i = l.getInizio().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
			LocalDate d_f = l.getFine().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
			distance = Period.between(d_i, d_f).getDays();

			if (distance > temp)
				temp = distance;

		}

		for (Loan l : sl) {
			LinkedList<User> lo = l.getUs();
			LocalDate d_i = l.getInizio().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
			LocalDate d_f = l.getFine().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
			distance = Period.between(d_i, d_f).getDays();
			if (distance == temp) {

				for (User u : lo) {
					System.out.println("Il cliente : " + u.getNome() + " " + u.getCognome() + " " + " ha utilizzato "
							+ "il prodotto: " + l.getId() + " per tot giorni : " + temp);

				}
			}

		}

	}

	public void most_loan() {
		// TODO Auto-generated method stub
		User u = null;
		for (Loan l : this.sl) {
			u = l.getU();
			Search(u.getCodice_fiscale());
		}

		for (Loan l : this.sl) {
			u = l.getU();
			u = Print(u.getCodice_fiscale());
		}

		System.out.println(u.toString());

	}

	private void Search(String c) {

		int i = 0;
		for (Map.Entry<User, Loan> u : this.ul.entrySet()) {

			if (u.getKey().getCodice_fiscale().equals(c)) {
				i++;
				if (i > this.k)
					this.k = i;
			}

		}

	}

	private User Print(String c) {

		int i = 0;
		User ul = null;
		for (Map.Entry<User, Loan> u : this.ul.entrySet()) {

			if (u.getKey().getCodice_fiscale().equals(c)) {
				i++;
				if (i > this.k)
					this.k = i;
				if (i == this.k)
					return u.getKey();

			}

		}
		return ul;

	}

	public void most_loan_() {
		// TODO Auto-generated method stub
		User u = null;
		for (Loan l : this.sl) {

			Search_(l.getId());
		}

		HashSet<Loan> lo = new HashSet<Loan>();
		for (Loan l : this.sl) {

			lo.add(Print_(l.getId()));
		}

		for (Loan h : lo) {
			if (h != null)
				System.out.println(
						" I prestiti o il prestito che è  sono stato / stati più effettuato/i :" + h.toString());
		}
	}

	private void Search_(String c) {

		int i = 0;
		for (Map.Entry<User, Loan> u : this.ul.entrySet()) {

			if (u.getValue().getId().equals(c)) {
				i++;
				if (i > this.k)
					this.k = i;
			}

		}

	}

	private Loan Print_(String c) {

		int i = 0;
		Loan l = null;
		for (Map.Entry<User, Loan> u : this.ul.entrySet()) {

			if (u.getValue().getId().equals(c)) {
				i++;
				if (i > this.k)
					this.k = i;
				if (i == this.k)
					return u.getValue();

			}

		}
		return l;

	}

	
	public void Control() {
		TreeSet<Loan> tr= new TreeSet<Loan>();
		
		tr.addAll(this.sl);
		
		for (Loan l : tr) {
			if(l.getInizio().after(l.getFine()))
				System.err.println("Attenzione ! la data di inzio sta dopo la data di fine!");
			else Search_l(l.getId() , l.getInizio(), l.getFine());
				
		}
	}
	
	private void Search_l(String id, Date i ,Date f) {

		
		for (Map.Entry<User, Loan> u : this.ul.entrySet()) {

			if(u.getValue().getId().equals(id) && !u.getValue().getInizio().equals(i) &&! !u.getValue().getFine().equals(f) && u.getValue().getInizio().before(f)) {
				
			
					System.err.print("Attenzione la data di inzio del successivo prestito sta prima della di fine di quello precedente");
			}
			}
		}
	

	
	private Map<String, PhysicalMedium> sp;
	private Set<Loan> sl;
	private Map<User, Loan> ul;
	private int k = 0;
}
