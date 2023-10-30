package uk.ac.aston.oop.inheritance.shapes;

import uk.ac.aston.oop.inheritance.util.GraphicsContextWrapper;
/**
* Circle is specified as center and radius.
*/



public class Circle extends Ellipse {

	
	/**
	* Creates a new circle instance.
	*
	* @param centerX X coordinate of the circle center.
	* @param centerY Y coordinate of the circle center.
	* @param radius radius of shape
	* 
	*/
	

	public Circle(double centerX, double centerY, double radius) {
		super(centerX-radius, centerY-radius, radius*2,radius*2);
	}


	/**
	* Gets the RADIUS.
	*
	* @return width/2
	* 
	*/

	
	public double getRadius() { 
		
		return getWidth()/2; }
	
}
