package uk.ac.aston.oop.inheritance.shapes;

import javafx.scene.paint.Color;
import uk.ac.aston.oop.inheritance.util.GraphicsContextWrapper;
/**
* FilledRectangle is different because it is extended from Rectangle and has a color field.
*/
public class FilledRectangle extends Rectangle {

	private Color fill;
	

	/**
	* Creates a new instance for a filled rectangle.
	*
	* @param  c for the fill
	* @param ulX X coordinate of the upper left corner.
	* @param ulY Y coordinate of the upper left corner.
	* @param width width of shape
	* @param height height of shape
	*/
	
	public FilledRectangle(Color c,double ulX, double ulY, double width, double height)  {
		super(ulX, ulY, width, height);
		fill = c;
	}
	

	/**
	* Gets the color.
	*
	* @return the fill/color
	* 
	*/
	 public Color getfill() { 
		 return fill;

		 }
	
	 @Override
		public void draw(GraphicsContextWrapper gc) {
		 	super.draw(gc);
		 	gc.fill(fill);
			gc.fillRect(getX(), getY(), getWidth(), getHeight());
			
		}
	
	
	
	
	
	
	
	
	
	
}
