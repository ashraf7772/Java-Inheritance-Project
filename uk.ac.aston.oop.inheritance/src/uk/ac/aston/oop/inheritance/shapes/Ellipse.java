package uk.ac.aston.oop.inheritance.shapes;

import uk.ac.aston.oop.inheritance.util.GraphicsContextWrapper;
/**
* Ellipse is nothing special and uses the get() methods in Shape.
*/
public class Ellipse extends Shape {


	/**
	* Creates a new ellipse instance.
	*
	* @param upperLeftX X coordinate of the upper left corner.
	* @param upperLeftY Y coordinate of the upper left corner.
	* @param width for width of shape
	* @param height for height of shape
	*/
	public Ellipse(double upperLeftX, double upperLeftY, double width, double height) {
		super(upperLeftX, upperLeftY, width, height);
	}

	
	@Override
	public void draw(GraphicsContextWrapper gc) {
		gc.oval(getX(),getY(),getWidth(),getHeight());
	}
	
}
