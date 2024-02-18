package assignment2_group13;

import java.util.Arrays;

public class coordinatesOriginatorClass {
	
	private double coordinates[][];
	
	public void setCoordinate(double coordinates[][])
	{
		this.coordinates = coordinates;
	}
	
	/*
	 * Now that we have created the Memento class
	 * and configured our setters and getters accordingly,
	 * we can save into the Memento.
	 */
	
	public locationCoordinatesMemento storeInMemento()
	{
		System.out.println("From Originator: Saving to Memento");
		return new locationCoordinatesMemento(coordinates);
		
	}
	
	public double[][] restoreFromMemento(locationCoordinatesMemento memento)
	{
		coordinates = memento.getCoordinates();
		
		System.out.println("From Originator: Restoring Coordinate " +  Arrays.deepToString(coordinates) + "from Memento.");
		
		return coordinates;

	}

}
