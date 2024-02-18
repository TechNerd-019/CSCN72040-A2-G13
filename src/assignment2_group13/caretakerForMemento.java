package assignment2_group13;

import java.util.ArrayList;

public class caretakerForMemento {

	ArrayList<locationCoordinatesMemento> savedCoordinates = new ArrayList<locationCoordinatesMemento>();
	
	public void addNewCoordinatesMemento(locationCoordinatesMemento m) { savedCoordinates.add(m); }
	
	/*
	 * As demonstrated on the professor's source code, the
	 * Memento is saved into an ArrayList.
	 * 
	 * Now we need to implement the ability to restore to that saved state.
	 */
	
	public locationCoordinatesMemento getCoordinates(int index) {return savedCoordinates.get(index);}
	

}
