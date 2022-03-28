package it.studenti.unisannio.caravella.angelo.utils;

import it.studenti.unisannio.caravella.angelo.classes.Training;

public class TesterTrainingsByToolandPlace implements Tester {

	public TesterTrainingsByToolandPlace(String tool, String place) {
		this.tool=tool;
		this.place=place;
			
	}
	
	
	@Override
	public boolean verify(Object o) {
		// TODO Auto-generated method stub
		Training t= null;
		if( o instanceof Training) {
		t= (Training) o;
		if(t.getTools().contains(tool) && t.getCampName().equals(place))
		return true;
		}
		return false;
		
	}
	
	private String tool;
	private String place;

}
