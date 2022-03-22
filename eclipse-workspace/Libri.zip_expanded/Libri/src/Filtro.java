import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Filtro {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		PrintWriter pw = new PrintWriter("f3.dati");
        

        BufferedReader br1 = new BufferedReader(new FileReader("f1.dati"));
        BufferedReader br2 = new BufferedReader(new FileReader("f2.dati"));
          
          
        String line1 = br1.readLine();
        String line2 = br2.readLine();
          
  
        while (line1 != null || line2 !=null)
        {
            if(line1 != null)
            {
                pw.println(line1);
                line1 = br1.readLine();
            }
              
            if(line2 != null)
            {
                pw.println(line2);
                line2 = br2.readLine();
            }
        }
      
        pw.flush();
          
        
        br1.close();
        br2.close();
        pw.close();
          
        Scanner sc = new Scanner(new File("f3.dati"));
          
        
        ArrayList<Libro> lbr=new ArrayList<Libro>();        

      		Libro lb= Libro.read(sc);
      		
      		while(lb != null){
      			lbr.add(lb);
      			lb = Libro.read(sc);
      		}
      		
      		
      		 System.out.println("Prima del sort");
      	        for (int i=0; i<lbr.size(); i++)
      	            System.out.println(lbr.get(i));
      		
      	      System.out.println(" \n");
      	
      		Collections.sort(lbr, new Sort_by_year());
      		 
  	
      	     System.out.println("Dopo il sort in base all' anno");
      	     for (int i=0; i<lbr.size(); i++)
      	         System.out.println(lbr.get(i));
      	     
                  
    }
}


