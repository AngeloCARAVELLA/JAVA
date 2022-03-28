package it.studenti.unisannio.caravella.angelo.classes;

import java.text.ParseException;

import java.util.*;
import java.util.Map.Entry;

import it.studenti.unisannio.caravella.angelo.utils.StudentNotFoundException;
import it.studenti.unisannio.caravella.angelo.utils.Tester;
import it.studenti.unisannio.caravella.angelo.utils.TesterStudent;
import it.studenti.unisannio.caravella.angelo.utils.TesterTrainings;
import it.studenti.unisannio.caravella.angelo.utils.TesterTrainingsByTool;
import it.studenti.unisannio.caravella.angelo.utils.TesterTrainingsByToolandPlace;
import it.studenti.unisannio.caravella.angelo.utils.TrainingNotFoundException;

public class MilitarySchool {
	public MilitarySchool(Scanner scS, Scanner scT) throws ParseException {
		//leggo tutte le esercitazioni
		
		Training t= Training.read(scT);
		this.trainings= new HashMap<String, Training>();
		this.students=new HashMap<String, Student>();
		while(t!=null) {
			trainings.put(t.getId(), t);
			t=Training.read(scT);
		}
		
		//leggo gli studenti
		
		Student s= Student.read(scS);
		while(s!=null) {
			
			//prendo dallo studente le chiavi delle esercitazioni a cui partecipa
			
			Set<String> keys=s.getTrainings().keySet();
			
			//aggiungo lo studente al gestore
			
			students.put(s.getId(), s);
			
			//associo
			
			for(String st: keys) {
				//se nel gestore esiste l'esercitazione presente nello studente associo, altrimenti lancio un'eccezione che nei fatti non fa nulla, fa sì che non avvenga l'associazione
				
				try{
					Training t1=searchTrainingById(st);
					s.addTraining(t1);
					t1.addStudents(s);
				}
				catch(TrainingNotFoundException ex) {
					System.err.println("Training not found");
				}
		}
			s=Student.read(scS);	
	}
		
}
	
	public Training searchTrainingById(String id) {
		
		//sfrutto le mappe che mi permettono di cercare un oggetto direttamente tramite la chiave
		
		Training t1= trainings.get(id);
		
		//se non trova nulla lancia un'eccezione che viene poi gestita nel try del gestore
		//(non possiamo permettere che vi sia un riferimento null nel gestore, altrimenti si genera un NullPointerException quando chiamiamo un metodo su quell'oggetto che è null)
		
		if(t1==null)
			throw new TrainingNotFoundException("Training not found");
		
		//se trova l'oggetto lo restituisce correttamente per l'associazione
		
		else return t1;
	}
	public Student searchStudentById(String id) {
		
		//sfrutto le mappe che mi permettono di cercare un oggetto direttamente tramite la chiave
		
		Student s1= students.get(id);
		
		
		if(s1==null)
			throw new StudentNotFoundException("Student not found");
		
		else return s1;
	}
	
	private MilitarySchool (HashMap<String, Student> filteredStudents, HashMap<String, Training> filteredTrainings) {
		this.students=filteredStudents;
		this.trainings=filteredTrainings;
	}
	
	//questo � il metodo effettivamente chiamato dal gestore a cui passp la stringa che voglio
	
	public MilitarySchool filterTrainingsByTool(String tool) {
		
		//creo un oggetto della classe del callback che si occuperà di verificare
		
		TesterTrainingsByTool t= new TesterTrainingsByTool(tool);
		
		//chiamo il filtro generale a cui passo l'oggetto(la variabile di riferimento del metodo sottostante è di tipo interface, per poter applicare correttamente il polimorfismo)
		
		return this.filterTrainings(t);
	}
	
	private MilitarySchool filterTrainings(Tester t) {
		//creo delle mappe(o qualsiasi collezione che scelgo di utilizzare) vuote, che conterranno gli oggetti filtrati
		
		HashMap<String, Student> filteredStudents=new HashMap<String, Student>();
		HashMap<String, Training> filteredTrainings= new HashMap<String, Training>();
		Set<String> keys= trainings.keySet();
		
		//in questo caso vado a scorrere la collezione delle esercitazioni e chiamo il metodo della variabile tester a cui passo l'oggetto esercitazione
		
		for(String s: keys) {
			if(t.verify(trainings.get(s))) {
				
				//se la verifica va a buon fine aggiungo l'oggetto alla collezione
				
				filteredTrainings.put(s, trainings.get(s));
				
				//e poichè devo restituire un gestore devo "popolare" anche l'altra hashmap (o le altre se ne abbiamo altre)
				//semplicemente sappiamo che alle esercitazioni corrispondono studenti che vi partecipano, per questo li prendiamo e li aggiungiamo alla nuova mappa
				
				filteredStudents.putAll(trainings.get(s).getStudents());

			}
		}
		return new MilitarySchool(filteredStudents, filteredTrainings);
	}
	
	public MilitarySchool filterTrainingsByToolandPlace(String tool, String  place) {
		
		//creo un oggetto della classe del callback che si occuperà di verificare
		
		TesterTrainingsByToolandPlace tp= new TesterTrainingsByToolandPlace(tool, place);
		
		//chiamo il filtro generale a cui passo l'oggetto(la variabile di riferimento del metodo sottostante è di tipo interface, per poter applicare correttamente il polimorfismo)
		
		return this.filterTrainingsTP(tp);
	}
	
	private MilitarySchool filterTrainingsTP(Tester t) {
		//creo delle mappe(o qualsiasi collezione che scelgo di utilizzare) vuote, che conterranno gli oggetti filtrati
		
		HashMap<String, Student> filteredStudents=new HashMap<String, Student>();
		HashMap<String, Training> filteredTrainings= new HashMap<String, Training>();
		Set<String> keys= trainings.keySet();
		
		//in questo caso vado a scorrere la collezione delle esercitazioni e chiamo il metodo della variabile tester a cui passo l'oggetto esercitazione
		
		for(String s: keys) {
			if(t.verify(trainings.get(s))) {
				
				//se la verifica va a buon fine aggiungo l'oggetto alla collezione
				
				filteredTrainings.put(s, trainings.get(s));
				
				//e poichè devo restituire un gestore devo "popolare" anche l'altra hashmap (o le altre se ne abbiamo altre)
				//semplicemente sappiamo che alle esercitazioni corrispondono studenti che vi partecipano, per questo li prendiamo e li aggiungiamo alla nuova mappa
				
				filteredStudents.putAll(trainings.get(s).getStudents());
	

			}
		}
		return new MilitarySchool(filteredStudents, filteredTrainings);
	}
	
	
	
	
	public MilitarySchool filterStudentByImm (String matricola) {
		
		
		TesterStudent st= new TesterStudent( matricola);
		
	
		return this.filterStudents(st);

	}
	
	
	private MilitarySchool filterStudents(Tester t) {
	
		
		HashMap<String, Student> filteredStudents=new HashMap<String, Student>();
		HashMap<String, Training> filteredTrainings= new HashMap<String, Training>();
		Set<String> keys= students.keySet();
		
		
		for(String s: keys) {
			if(t.verify(students.get(s))) {
				
				//se la verifica va a buon fine aggiungo l'oggetto alla collezione
				
				filteredTrainings.putAll(students.get(s).getTrainings());
				filteredStudents.put(s, students.get(s));

			}
		}
		return new MilitarySchool(filteredStudents, filteredTrainings);
	}
	
	
	public MilitarySchool filterT(String id) {
		TesterTrainings tp= new TesterTrainings(id);
		
		return this.filterTraining(tp);
	
	}
	
	private MilitarySchool filterTraining(Tester t) {
		HashMap<String, Student> filteredStudents=new HashMap<String, Student>();
		HashMap<String, Training> filteredTrainings= new HashMap<String, Training>();
		Set<String> keys= trainings.keySet();

		for(String s: keys) {
			if(t.verify(trainings.get(s))) {
				
				//se la verifica va a buon fine aggiungo l'oggetto alla collezione
				
				filteredTrainings.put(s, trainings.get(s));
				
		
				filteredStudents.putAll(trainings.get(s).getStudents());
	

			}
		}
		return new MilitarySchool(filteredStudents, filteredTrainings);
	}
	
	
	
	
	private  int filterMax() {
		
		int temp=0; 
		for ( Entry<String, Student> st: this.students.entrySet() )
		{
			if(temp< st.getValue().getTrainings().size())
				temp= st.getValue().getTrainings().size();
			
		}
		
		return temp;
		
	}
	
	public   void  printMax() {
		
		int temp= filterMax();
		for ( Entry<String, Student> st: this.students.entrySet() )
		{
			if(temp== st.getValue().getTrainings().size())
				System.out.println(st.getValue().toString());
			
		}
		
		
		
	}
	public void printStudents() {
		Set<String> keys=this.students.keySet();
		for(String s: keys) {
			students.get(s).print();
		}
	}
	

	public void printTrainings() {
		Set<String> keys=this.trainings.keySet();
		for(String s: keys) {
			trainings.get(s).print();
		}
	}

	private HashMap<String, Student> students;
	private HashMap<String, Training> trainings;

}
