package it.unisannio.caravella.angelo.classes;

import java.text.ParseException;
import java.util.*;
import it.unisannio.caravella.angelo.utils.Constants;

public class Prenotazioni {


	public static Prenotazioni read(Scanner sc) throws ParseException{
		
		if(!sc.hasNext())return null;
		String id_c= sc.next().strip(); 
		
		if(!sc.hasNext())return null;
		String id_v= sc.next().strip();
		
		if(!sc.hasNext())return null;
		String num= sc.next().strip(); 
		double num_p= Double.parseDouble(num);
		
		if(!sc.hasNext())return null;
		String date= sc.next().strip();
		Date date_p= Constants.sdfdmy.parse(date);
		
		return new Prenotazioni (id_c, id_v, num_p , date_p);
	}
	/**
	 * @param identificativo_cliente
	 * @param identificativo_viaggio
	 * @param numero_posti_prenotati
	 * @param data_di_partenza
	 */
	public Prenotazioni(String identificativo_cliente, String identificativo_viaggio, double  numero_posti_prenotati,
			Date data_di_partenza) {
		super();
		this.identificativo_cliente = identificativo_cliente;
		this.identificativo_viaggio = identificativo_viaggio;
		this.numero_posti_prenotati = numero_posti_prenotati;
		this.data_di_partenza = data_di_partenza;
	}
	@Override
	public String toString() {
		return "Prenotazioni [identificativo_cliente=" + identificativo_cliente + ", identificativo_viaggio="
				+ identificativo_viaggio + ", numero_posti_prenotati=" + numero_posti_prenotati + ", data_di_partenza="
				+ data_di_partenza + "]";
	}
	private String identificativo_cliente;
	private String  identificativo_viaggio;
	private double  numero_posti_prenotati;
	private Date data_di_partenza;
	/**
	 * @return the identificativo_cliente
	 */
	public String getIdentificativo_cliente() {
		return identificativo_cliente;
	}
	/**
	 * @param identificativo_cliente the identificativo_cliente to set
	 */
	public void setIdentificativo_cliente(String identificativo_cliente) {
		this.identificativo_cliente = identificativo_cliente;
	}
	/**
	 * @return the identificativo_viaggio
	 */
	public String getIdentificativo_viaggio() {
		return identificativo_viaggio;
	}
	/**
	 * @param identificativo_viaggio the identificativo_viaggio to set
	 */
	public void setIdentificativo_viaggio(String identificativo_viaggio) {
		this.identificativo_viaggio = identificativo_viaggio;
	}
	/**
	 * @return the numero_posti_prenotati
	 */
	public double getNumero_posti_prenotati() {
		return numero_posti_prenotati;
	}
	/**
	 * @param numero_posti_prenotati the numero_posti_prenotati to set
	 */
	public void setNumero_posti_prenotati(int numero_posti_prenotati) {
		this.numero_posti_prenotati = numero_posti_prenotati;
	}
	/**
	 * @return the data_di_partenza
	 */
	public Date getData_di_partenza() {
		return data_di_partenza;
	}
	/**
	 * @param data_di_partenza the data_di_partenza to set
	 */
	public void setData_di_partenza(Date data_di_partenza) {
		this.data_di_partenza = data_di_partenza;
	}
	
	}
