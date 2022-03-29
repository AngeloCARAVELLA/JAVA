package it.unisannio.studenti.caravella.angelo.classes;
import java.text.ParseException;
import java.util.*;

import it.unisannio.studenti.caravella.angelo.utils.Constants;

public class Loan implements Comparable{

	
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
	/**
	 * @param id
	 * @param inizio
	 * @param fine
	 */
	public Loan(String id, Date inizio, Date fine) {
		this.id = id;
		this.inizio = inizio;
		this.fine = fine;
	}
	/**
	 * @param id
	 * @param inizio
	 * @param fine
	 * @param us
	 */
	public Loan(String id, Date inizio, Date fine, User u, LinkedList<User> us) {
		this.id = id;
		this.inizio = inizio;
		this.fine = fine;
		this.u= u;
		this.us = us;
	}
	
	
	
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return the inizio
	 */
	public Date getInizio() {
		return inizio;
	}
	/**
	 * @param inizio the inizio to set
	 */
	public void setInizio(Date inizio) {
		this.inizio = inizio;
	}
	/**
	 * @return the fine
	 */
	public Date getFine() {
		return fine;
	}
	/**
	 * @param fine the fine to set
	 */
	public void setFine(Date fine) {
		this.fine = fine;
	}
	/**
	 * @return the us
	 */
	public LinkedList<User> getUs() {
		return us;
	}
	/**
	 * @param us the us to set
	 */
	public void setUs(LinkedList<User> us) {
		this.us = us;
	}

	
	
	
	public static Loan read(Scanner sc) throws ParseException {
		
		if(!sc.hasNextLine())return null;
		String id= sc.nextLine();
		
		
		if(!sc.hasNextLine())return null;
		String anno= sc.nextLine();
		Date anno_i= Constants.ssMMyyyy.parse(anno);
		
		if(!sc.hasNextLine())return null;
		anno= sc.nextLine();
		Date anno_f= Constants.ssMMyyyy.parse(anno);
		
		User us= User.read(sc);
		LinkedList<User> u= new LinkedList<User>();
		u.add(us);
	
		
		return new Loan(id, anno_i, anno_f, us, u);
		
	}


	/**
	 * @return the u
	 */
	public User getU() {
		return u;
	}
	/**
	 * @param u the u to set
	 */
	public void setU(User u) {
		this.u = u;
	}
	
	@Override
	public String toString() {
		return "Loan [id=" + id + ", inizio=" + inizio + ", fine=" + fine + ", us=" + us + "]";
	}


	private String id;
	private Date inizio;
	private Date fine;
	private User u;
	private LinkedList<User> us;
}
