package it.unisannio.caravella.angelo.classes;


import java.util.Scanner;

public class Archivio_di_clienti {

	public static Archivio_di_clienti read(Scanner sc) {

		if(!sc.hasNextLine())return null; 
		String identificativo= sc.nextLine().strip(); 
		
		if(!sc.hasNextLine())return null; 						 
		String nome= sc.nextLine().strip(); 
		
		if(!sc.hasNextLine())return null; 						 
		String cognome= sc.nextLine().strip(); 
		
		if(!sc.hasNextLine())return null; 						 
		String città_di_residenza= sc.nextLine().strip(); 
		
		if(!sc.hasNextLine())return null; 						 
		String numero_tel= sc.nextLine().strip(); 
		
		return new Archivio_di_clienti(identificativo , nome, cognome, città_di_residenza , numero_tel);
	}

	public static Archivio_di_clienti read() {
	Scanner sc= new Scanner (System.in);
	 
	System.out.println( "Inserisci il nome: "); 
	String nome= sc.nextLine().strip(); 
	if(nome.equals(""))return null;
 	
	System.out.println( "Inserisci il cognome: "); 
	String cognome= sc.nextLine().strip(); 
	if(cognome.equals(""))return null;
						 
	System.out.println( "Inserisci la città di residenza "); 	
	String città_di_residenza= sc.nextLine().strip(); 
	if(città_di_residenza.equals(""))return null;
						 
	System.out.println( "Inserisci il numero di telefono "); 
	String numero_tel= sc.nextLine().strip(); 
	if(numero_tel.equals(""))return null;

	return new Archivio_di_clienti( nome, cognome, città_di_residenza , numero_tel);
	}
	
	
	
	/**
	 * @param nome
	 * @param cognome
	 * @param città_di_residenza
	 * @param numero_tel
	 */
	public Archivio_di_clienti(String nome, String cognome, String città_di_residenza, String numero_tel) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.città_di_residenza = città_di_residenza;
		this.numero_tel = numero_tel;
	}
	private String identificativo; 
	private String nome; 
	private String cognome; 
	private String città_di_residenza;
	private String numero_tel;
	/**
	 * @param identificativo
	 * @param nome
	 * @param cognome
	 * @param città_di_residenza
	 * @param numero_tel
	 */
	public Archivio_di_clienti(String identificativo, String nome, String cognome, String città_di_residenza,
			String numero_tel) {
		super();
		this.identificativo = identificativo;
		this.nome = nome;
		this.cognome = cognome;
		this.città_di_residenza = città_di_residenza;
		this.numero_tel = numero_tel;
	}
	public Archivio_di_clienti() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Archivio_di_clienti [identificativo=" + identificativo + ", nome=" + nome + ", cognome=" + cognome
				+ ", città_di_residenza=" + città_di_residenza + ", numero_tel=" + numero_tel + "]";
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
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}
	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	/**
	 * @return the cognome
	 */
	public String getCognome() {
		return cognome;
	}
	/**
	 * @param cognome the cognome to set
	 */
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	/**
	 * @return the città_di_residenza
	 */
	public String getCittà_di_residenza() {
		return città_di_residenza;
	}
	/**
	 * @param città_di_residenza the città_di_residenza to set
	 */
	public void setCittà_di_residenza(String città_di_residenza) {
		this.città_di_residenza = città_di_residenza;
	}
	/**
	 * @return the numero_tel
	 */
	public String getNumero_tel() {
		return numero_tel;
	}
	/**
	 * @param numero_tel the numero_tel to set
	 */
	public void setNumero_tel(String numero_tel) {
		this.numero_tel = numero_tel;
	}


}
