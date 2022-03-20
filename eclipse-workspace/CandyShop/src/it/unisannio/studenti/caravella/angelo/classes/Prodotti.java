package it.unisannio.studenti.caravella.angelo.classes;

import java.util.Scanner;

public class Prodotti {

	
	@Override
	public String toString() {
		return "Prodotti [tipologia=" + tipologia + ", marca=" + marca + ", colore=" + colore + ", taglia=" + taglia
				+ ", prezzo=" + prezzo + "]";
	}

	public static Prodotti read(String label ,Scanner sc) {
		
		if( label.equals("")|| label.equals("#"))return null;
		
	
		if(!sc.hasNextLine())return null; 
		String marca= sc.nextLine();
		
		if(!sc.hasNextLine())return null; 
		String colore= sc.nextLine();
		
		if(!sc.hasNextLine())return null; 
		String taglia= sc.nextLine();
		
		if(!sc.hasNextLine())return null; 
		String prezzo_s= sc.nextLine();
		Double p=0.0;
		
		try {
		p= Double.parseDouble(prezzo_s);
		}
		catch(NumberFormatException ex) {
			
			System.err.println("Attenzione , NumberFormatException !");
		}
		
		
		return new Prodotti( label, marca, colore, taglia, p); 
		
	}
	
	/**
	 * @return the tipologia
	 */
	public String getTipologia() {
		return tipologia;
	}
	/**
	 * @param tipologia the tipologia to set
	 */
	public void setTipologia(String tipologia) {
		this.tipologia = tipologia;
	}
	/**
	 * @return the marca
	 */
	public String getMarca() {
		return marca;
	}
	/**
	 * @param marca the marca to set
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}
	/**
	 * @return the colore
	 */
	public String getColore() {
		return colore;
	}
	/**
	 * @param colore the colore to set
	 */
	public void setColore(String colore) {
		this.colore = colore;
	}
	/**
	 * @return the taglia
	 */
	public String getTaglia() {
		return taglia;
	}
	/**
	 * @param taglia the taglia to set
	 */
	public void setTaglia(String taglia) {
		this.taglia = taglia;
	}
	/**
	 * @return the prezzo
	 */
	public Double getPrezzo() {
		return prezzo;
	}
	/**
	 * @param prezzo the prezzo to set
	 */
	public void setPrezzo(Double prezzo) {
		this.prezzo = prezzo;
	}
	/**
	 * @param tipologia
	 * @param marca
	 * @param colore
	 * @param taglia
	 * @param prezzo
	 */
	public Prodotti(String tipologia, String marca, String colore, String taglia, Double prezzo) {
		this.tipologia = tipologia;
		this.marca = marca;
		this.colore = colore;
		this.taglia = taglia;
		this.prezzo = prezzo;
	}
	public Prodotti() {
		// TODO Auto-generated constructor stub
	}
	private String tipologia;
	private String marca;
	private String colore;
	private String taglia;
	private Double prezzo;
	
}
