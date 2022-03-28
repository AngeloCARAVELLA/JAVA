package it.studenti.unisannio.caravella.angelo.utils;

import it.studenti.unisannio.caravella.angelo.classes.Training;

public class TesterTrainingsByTool implements Tester{
	public TesterTrainingsByTool(String tool) {
		this.tool=tool;
	}

	@Override
	public boolean verify(Object o) {
		Training t= null;
		
		if(o instanceof Training) {
			t=(Training) o;
			if(t.getTools().contains(tool))
				return true;
		}
		return false;
	}
	
	private String tool;

	
}
