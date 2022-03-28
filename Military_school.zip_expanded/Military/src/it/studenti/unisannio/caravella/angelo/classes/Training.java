package it.studenti.unisannio.caravella.angelo.classes;

import java.text.ParseException;

import java.util.*;

import it.studenti.unisannio.caravella.angelo.utils.Constants;

public class Training {
	public Training(String id, String name, Date startDate, Date endDate, String campName, TreeSet<String> tools) {
		this.id=id;
		this.name=name;
		this.startDate=startDate;
		this.endDate=endDate;
		this.campName=campName;
		this.tools=tools;
		this.students=new HashMap<String, Student>();
	}
	
	public static Training read(Scanner sc) throws ParseException {
		TreeSet<String> tools= new TreeSet<String>();
		if(!sc.hasNextLine()) return null;
		String id=sc.nextLine().strip();
		
		if(!sc.hasNextLine()) return null;
		String name=sc.nextLine().strip();
		
		if(!sc.hasNextLine()) return null;
		String startDateS=sc.nextLine().strip();
		Date startDate=Constants.sdfdmy.parse(startDateS);
		
		if(!sc.hasNextLine()) return null;
		String endDateS=sc.nextLine().strip();
		Date endDate=Constants.sdfdmy.parse(endDateS);
		
		if(!sc.hasNextLine()) return null;
		String campName=sc.nextLine().strip();
		
		if(!sc.hasNextLine()) return null;
		String tool=sc.nextLine().strip();
			
		while(!tool.equals("#")) {
			tools.add(tool);
			tool=sc.nextLine().strip();
		}
		return new Training(id, name, startDate, endDate, campName, tools);
		
	}
	
	

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getCampName() {
		return campName;
	}

	public Date getStartDate() {
		return startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public TreeSet<String> getTools() {
		return tools;
	}

	public HashMap<String,Student> getStudents() {
		return students;
	}

	public void addStudents(Student s) {
		this.students.put(s.getId(), s);
	}
	
	public void print() {
		System.out.println(toString());

	}



	@Override
	public String toString() {
		return "Training [id=" + id + ", name=" + name + ", campName=" + campName + ", startDate=" + startDate
				+ ", endDate=" + endDate +"]";
	}



	private String id, name, campName;
	private Date startDate, endDate;
	private TreeSet<String> tools;
	private HashMap<String, Student> students;
}
