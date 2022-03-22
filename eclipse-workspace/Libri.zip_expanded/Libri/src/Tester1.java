import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.*;

public class Tester1 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		PrintStream ps= new PrintStream(new File("f1.dati"));
	
		Libro lb= Libro.read();
		
		while (lb!=null) {
			lb.print(ps);
			lb= Libro.read();
			
		}
		
	
	
	}
	

}
