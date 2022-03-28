package it.unisannio.caravella.angelo.classes;

import java.util.Scanner;

public class Pacchetti_viaggio {

	
	//public static Pacchetti_viaggio read(Scanner sc) {}
	
	public static Pacchetti_viaggio read(Scanner sc) {
		
		 if(!sc.hasNextLine())return null; 
		 String identificativo= sc.nextLine();
		 
		 if(!sc.hasNextLine())return null; 
		 String destinazione= sc.nextLine(); 
	 
		 if(!sc.hasNextLine())return null; 
		 String numero_di_giorni= sc.nextLine();
		 double n_p= Double.parseDouble(numero_di_giorni);
		 
		 if(!sc.hasNextLine())return null; 
		 String numero_di_p_d= sc.nextLine(); 
		 double n_p_d= Double.parseDouble(numero_di_p_d);
		 
		 if(!sc.hasNextLine())return null; 
		 String cost_p= sc.nextLine(); 
		 double cost= Double.parseDouble(cost_p);
		
		 
		 return new Pacchetti_viaggio( identificativo, destinazione, n_p , n_p_d, cost);
	}
		
	private String identificativo;
	private String destinazione; 
	private double numero_di_giorni;
	private double numero_di_p_d;
	private double cost_p;
	@Override
	public String toString() {
		return "Pacchetti_viaggio [identificativo=" + identificativo + ", destinazione=" + destinazione
				+ ", numero_di_giorni=" + numero_di_giorni + ", numero_di_p_d=" + numero_di_p_d + ", cost_p=" + cost_p
				+ "]";
	}

	
	
	
	
	/**
	 * @return the identificativo
	 */
	public String getIdentificativo() {
		return identificativo;
	}

	/**
	 * @param identificativo the identificativo to set
	 */
	public void setIdentificativo(String identificativo) {
		this.identificativo = identificativo;
	}

	/**
	 * @return the destinazione
	 */
	public String getDestinazione() {
		return destinazione;
	}

	/**
	 * @param destinazione the destinazione to set
	 */
	public void setDestinazione(String destinazione) {
		this.destinazione = destinazione;
	}

	/**
	 * @return the numero_di_giorni
	 */
	public double getNumero_di_giorni() {
		return numero_di_giorni;
	}

	/**
	 * @param numero_di_giorni the numero_di_giorni to set
	 */
	public void setNumero_di_giorni(double numero_di_giorni) {
		this.numero_di_giorni = numero_di_giorni;
	}

	/**
	 * @return the numero_di_p_d
	 */
	public double getNumero_di_p_d() {
		return numero_di_p_d;
	}

	/**
	 * @param numero_di_p_d the numero_di_p_d to set
	 */
	public void setNumero_di_p_d(double numero_di_p_d) {
		this.numero_di_p_d = numero_di_p_d;
	}

	/**
	 * @return the cost_p
	 */
	public double getCost_p() {
		return cost_p;
	}

	/**
	 * @param cost_p the cost_p to set
	 */
	public void setCost_p(double cost_p) {
		this.cost_p = cost_p;
	}

	/**
	 * @param identificativo
	 * @param destinazione
	 * @param numero_di_giorni
	 * @param numero_di_p_d
	 * @param cost_p
	 */
	public Pacchetti_viaggio(String identificativo, String destinazione, double numero_di_giorni, double numero_di_p_d,
			double cost_p) {
		super();
		this.identificativo = identificativo;
		this.destinazione = destinazione;
		this.numero_di_giorni = numero_di_giorni;
		this.numero_di_p_d = numero_di_p_d;
		this.cost_p = cost_p;
	}

	
}
