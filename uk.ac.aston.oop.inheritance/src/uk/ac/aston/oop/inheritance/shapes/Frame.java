package uk.ac.aston.oop.inheritance.shapes;

import uk.ac.aston.oop.inheritance.util.GraphicsContextWrapper;
/**
* Frame extends Shape and inner and outerRectangle are protected..
*/
public class Frame extends Shape{
	
	

	/**
	* Inner Rectangle of Frame.
	*
	* 
	* 
	*/
	protected Rectangle innerRectangle;

	/**
	* Outer Rectangle of Frame.
	*
	* 
	* 
	*/
	protected Rectangle outerRectangle;
	
	private static final int FRAME_THICKNESS = 10;
	
	/**
	* Creates a new instance for a frame.
	*
	* 
	* @param uLX X coordinate of the upper left corner.
	* @param uLY Y coordinate of the upper left corner.
	* @param wid width of shape
	* @param hei height of shape
	*/
	
	public Frame (double uLX, double uLY, double wid, double hei) {
		 super(uLX,uLY, wid,hei);
		outerRectangle = new Rectangle(uLX,uLY, wid,hei);
		innerRectangle = new Rectangle(
				uLX+FRAME_THICKNESS,uLY+FRAME_THICKNESS, 
				wid-FRAME_THICKNESS*2,hei-FRAME_THICKNESS*2);
		
	}
	
	@Override
	public void draw(GraphicsContextWrapper gc) {
		outerRectangle.draw(gc);
		innerRectangle.draw(gc);
		
		
	}
	
	
	
	
}
