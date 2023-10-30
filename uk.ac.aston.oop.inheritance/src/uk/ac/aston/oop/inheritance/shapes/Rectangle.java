package uk.ac.aston.oop.inheritance.shapes;

import uk.ac.aston.oop.inheritance.util.GraphicsContextWrapper;
/**
* Rectangle is very basic and uses Shape with little change.
*/
public class Rectangle extends Shape {

	/**
	* Creates a new instance for a rectangle.
	*
	* 
	* @param ulX X coordinate of the upper left corner.
	* @param ulY Y coordinate of the upper left corner.
	* @param width width of shape
	* @param height height of shape
	*/
	public Rectangle(double ulX, double ulY, double width, double height)  {
		super(ulX, ulY, width, height);
	}

	
	@Override
	public void draw(GraphicsContextWrapper gc) {
		gc.lineWidth(5);

		gc.rect(getX(),getY(),getWidth(),getHeight());
		
	}

}
