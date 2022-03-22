import java.io.PrintStream;
import java.util.Scanner;

public class Libro {

	
	public Libro() {
		
	}
	
	public Libro(String autore, String titolo ,int  anno) {
		this.autore=autore;
		this.titolo=titolo;
		this.anno=anno;
	}
	

	
	public static Libro read() {
		
		//autore/i, titolo ed anno di pubblicazione
		Scanner input = new Scanner(System.in);
		
		System.out.println("Nome: ");
		String autore = input.nextLine();
		if(autore.equals("")) return null;
		
		System.out.println("Titolo: ");
		String titolo = input.nextLine();
		if(titolo.equals("")) return null;
		
		System.out.println("Anno di pubblicazione: ");
		int anno = input.nextInt();
		if(anno == 0 ) return null;
		
		return new Libro( autore , titolo , anno);
		
	}
	
	public static Libro read(Scanner sc) {
		
		//autore/i, titolo ed anno di pubblicazione
		
		if(!sc.hasNext()) return null;
		String autore = sc.next();
		
		if(!sc.hasNext()) return null;
		String titolo = sc.next();
		
		if(!sc.hasNextInt()) return null;
		int  anno = sc.nextInt();
		
		return new Libro( autore, titolo , anno);
		
	}
	
	
	public void print(PrintStream ps) {
		ps.print(autore + " ");
		ps.print(titolo + " ");
		ps.print(anno+ " ");
	
}
	
	public String toString()
    {
        return this.autore + " " + this.titolo +
                           " " + this.anno;
    }
	
	public void print() {
		System.out.println(autore + " ");
		System.out.println(titolo + " ");
		System.out.println(anno+ " ");


	}
	
	
	public String set_autore() {
		
	return this.autore;	
	}
	
	public String set_titolo() {
		
	return this.titolo;
	}
	
	public int set_anno() {

	return this.anno;
	}
		
	private String autore;
	private String titolo;
	private int  anno;
}
