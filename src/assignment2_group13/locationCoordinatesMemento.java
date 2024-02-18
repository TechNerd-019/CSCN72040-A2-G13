package assignment2_group13;

/*
 * Source code modeled after examples
 * provided within class material.
 */

public class locationCoordinatesMemento {

	private double coordinates[][];
	
	public locationCoordinatesMemento(double coordinates[][])
	{
		this.coordinates = coordinates;
	}
	
	public double[][] getCoordinates()
	{
		return coordinates;
	}
	

}
