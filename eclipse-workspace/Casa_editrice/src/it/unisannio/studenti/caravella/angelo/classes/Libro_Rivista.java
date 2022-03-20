package it.unisannio.studenti.caravella.angelo.classes;

import java.text.ParseException;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import it.unisannio.studenti.caravella.utils.Constants;

public class Libro_Rivista {

	
	public static Libro_Rivista read(Scanner sc) throws ParseException {
		
		 //LETTURA LIBRO 
		 Set<String> autori= new HashSet<String>();
		 int n_a;
		 if(!sc.hasNextLine())return null; 
		 String tipologia= sc.nextLine();
		 
		 if(!sc.hasNextLine())return null; 
		 String id_l= sc.nextLine();
		 
		 if(!sc.hasNextLine())return null; 
		 String t_l =sc.nextLine(); 
	 
		 if(!sc.hasNextLine())return null; 
		 String numero_di_autori= sc.nextLine();
		 n_a=  Integer.parseInt(numero_di_autori);
		
		 int temp=0;
		 do {
		 if(!sc.hasNextLine())return null; 
		 String nome_aut= sc.nextLine();
		 
		 autori.add(nome_aut);
		 temp++;
		 } while( temp != n_a);
		 
		 if(!sc.hasNextLine())return null; 
		 String anno_di_pubblicazione= sc.nextLine();
		 Date a_l= Constants.mmyy.parse(anno_di_pubblicazione);
		 
		 
		 //LETTURA RIVISTA
		
		 Map<String, String> articoli= new HashMap<String, String>();
		 int n_ar;
		 
		 if(!sc.hasNextLine())return null; 
		 tipologia= sc.nextLine();
		 
		 if(!sc.hasNextLine())return null; 
		 String id_r= sc.nextLine();
		 
		 if(!sc.hasNextLine())return null; 
		 String t_r =sc.nextLine(); 
	 
		 
		 if(!sc.hasNextLine())return null; 
		 String anno_di_p= sc.nextLine();
		 Date a_r= Constants.mmyy.parse(anno_di_p);
		 
		 if(!sc.hasNextLine())return null; 
		 String numero_di_articoli= sc.nextLine();
		 n_ar=  Integer.parseInt(numero_di_articoli);
		
		 int t=0;
		 do {
		 if(!sc.hasNextLine())return null; 
		 String titolo_r= sc.nextLine();
			 	 	
		 if(!sc.hasNextLine())return null; 
		 String nome= sc.nextLine();
		 t++; 
		 articoli.put(titolo_r, nome);
		 } while( t != n_ar);
		 
		 
				 
		return new Libro_Rivista(id_l, t_l, n_a, autori, a_l ,id_r, t_r, a_r,n_ar, articoli);
	}
		
	
	

	public String toString_r() {
		return "Libro_Rivista [id_r=" + id_r + ", titolo_r=" + titolo_r + ", data_p_r=" + data_p_r + ", num_art_r="
				+ num_art_r + ", al_r=" + al_r + "]";
	}


	public String toString_l() {
		return "Libro_Rivista [id_l=" + id_l + ", titolo_l=" + titolo_l + ", num_a_l=" + num_a_l + ", autori_l="
				+ autori_l + ", anno_p_l=" + anno_p_l + "]";
	}


	/**
	 * @param id_l
	 * @param titolo_l
	 * @param num_a_l
	 * @param autori_l
	 * @param anno_p_l
	 * @param id_r
	 * @param titolo_r
	 * @param data_p_r
	 * @param num_art_r
	 * @param al_r
	 */
	public Libro_Rivista(String id_l, String titolo_l, int num_a_l, Set<String> autori_l, Date anno_p_l, String id_r,
			String titolo_r, Date data_p_r, int num_art_r, Map<String, String> al_r) {
		super();
		this.id_l = id_l;
		this.titolo_l = titolo_l;
		this.num_a_l = num_a_l;
		this.autori_l = autori_l;
		this.anno_p_l = anno_p_l;
		this.id_r = id_r;
		this.titolo_r = titolo_r;
		this.data_p_r = data_p_r;
		this.num_art_r = num_art_r;
		this.al_r = al_r;
	}






	private String id_l;
	private String titolo_l;
	private int num_a_l;
	private Set<String> autori_l;
	private Date anno_p_l;
	
	/**
	 * @param id_r
	 * @param titolo_r
	 * @param data_p_r
	 * @param num_art_r
	 * @param al_r
	 */
	public Libro_Rivista(String id_r, String titolo_r, Date data_p_r, int num_art_r, Map<String, String> al_r) {
		super();
		this.id_r = id_r;
		this.titolo_r = titolo_r;
		this.data_p_r = data_p_r;
		this.num_art_r = num_art_r;
		this.al_r = al_r;
	}



	/**
	 * @param id_l
	 * @param titolo_l
	 * @param num_a_l
	 * @param autori_l
	 * @param anno_p_l
	 */
	public Libro_Rivista(String id_l, String titolo_l, int num_a_l, Set<String> autori_l, Date anno_p_l) {
		super();
		this.id_l = id_l;
		this.titolo_l = titolo_l;
		this.num_a_l = num_a_l;
		this.autori_l = autori_l;
		this.anno_p_l = anno_p_l;
	}



	private String id_r;
	private String titolo_r; 
	private Date data_p_r;
	private int  num_art_r; 
	private Map<String, String> al_r;
	/**
	 * @return the id_l
	 */
	public String getId_l() {
		return id_l;
	}



	/**
	 * @param id_l the id_l to set
	 */
	public void setId_l(String id_l) {
		this.id_l = id_l;
	}



	/**
	 * @return the titolo_l
	 */
	public String getTitolo_l() {
		return titolo_l;
	}



	/**
	 * @param titolo_l the titolo_l to set
	 */
	public void setTitolo_l(String titolo_l) {
		this.titolo_l = titolo_l;
	}



	/**
	 * @return the num_a_l
	 */
	public int getNum_a_l() {
		return num_a_l;
	}



	/**
	 * @param num_a_l the num_a_l to set
	 */
	public void setNum_a_l(int num_a_l) {
		this.num_a_l = num_a_l;
	}



	/**
	 * @return the autori_l
	 */
	public Set<String> getAutori_l() {
		return autori_l;
	}



	/**
	 * @param autori_l the autori_l to set
	 */
	public void setAutori_l(Set<String> autori_l) {
		this.autori_l = autori_l;
	}



	/**
	 * @return the anno_p_l
	 */
	public Date getAnno_p_l() {
		return anno_p_l;
	}



	/**
	 * @param anno_p_l the anno_p_l to set
	 */
	public void setAnno_p_l(Date anno_p_l) {
		this.anno_p_l = anno_p_l;
	}



	/**
	 * @return the id_r
	 */
	public String getId_r() {
		return id_r;
	}



	/**
	 * @param id_r the id_r to set
	 */
	public void setId_r(String id_r) {
		this.id_r = id_r;
	}



	/**
	 * @return the titolo_r
	 */
	public String getTitolo_r() {
		return titolo_r;
	}



	/**
	 * @param titolo_r the titolo_r to set
	 */
	public void setTitolo_r(String titolo_r) {
		this.titolo_r = titolo_r;
	}



	/**
	 * @return the data_p_r
	 */
	public Date getData_p_r() {
		return data_p_r;
	}



	/**
	 * @param data_p_r the data_p_r to set
	 */
	public void setData_p_r(Date data_p_r) {
		this.data_p_r = data_p_r;
	}



	/**
	 * @return the num_art_r
	 */
	public int getNum_art_r() {
		return num_art_r;
	}



	/**
	 * @param num_art_r the num_art_r to set
	 */
	public void setNum_art_r(int num_art_r) {
		this.num_art_r = num_art_r;
	}



	/**
	 * @return the al_r
	 */
	public Map<String, String> getAl_r() {
		return al_r;
	}



	/**
	 * @param al_r the al_r to set
	 */
	public void setAl_r(Map<String, String> al_r) {
		this.al_r = al_r;
	}
	
	
	
	
	
}