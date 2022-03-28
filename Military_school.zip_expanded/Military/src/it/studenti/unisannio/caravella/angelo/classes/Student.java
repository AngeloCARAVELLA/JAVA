package it.studenti.unisannio.caravella.angelo.classes;

import java.util.*;

public class Student {
	public Student(String id, String name, String surname, HashMap<String, Training> trainings) {
		this.id=id;
		this.name=name;
		this.surname=surname;
		this.trainings=trainings;
	}
	
	public static Student read(Scanner sc) {
		HashMap<String, Training> trainings= new HashMap<String, Training>();
		if(!sc.hasNextLine()) return null;
		String id=sc.nextLine().strip();
		
		if(!sc.hasNextLine()) return null;
		String name=sc.nextLine().strip();
		
		if(!sc.hasNextLine()) return null;
		String surname=sc.nextLine().strip();
		
		if(!sc.hasNextLine()) return null;
		String trainingS=sc.nextLine().strip();
		
		
		while(!trainingS.equals("#")) {
			trainings.put(trainingS, null);
			trainingS=sc.nextLine().strip();
		}
		return new Student(id, name, surname, trainings	);
		
	}
	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}

	public HashMap<String, Training> getTrainings() {
		return trainings;
	}

	public void addTraining(Training t) {
		trainings.put(t.getId(), t);
	}

	public void print() {
			System.out.println(toString());
			for (String st: trainings.keySet()) {
				System.out.println(st);
				
			}
	}
	private String id, name, surname;
	private HashMap<String, Training> trainings;
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", surname=" + surname +"]";
	}

}
