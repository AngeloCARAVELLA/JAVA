import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Tester2 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		PrintStream ps= new PrintStream(new File("f2.dati"));
		
		Libro lb= Libro.read();
		
		while (lb!=null) {
			lb.print(ps);
			lb= Libro.read();
		}
		
		

}

}