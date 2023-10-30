package uk.ac.aston.oop.inheritance.shapes;


import uk.ac.aston.oop.inheritance.util.GraphicsContextWrapper;
/**
* Shape is the parent class that every other class uses or is linked too.
*/
public class Shape {
	
	
	private double upperLeftX, upperLeftY;
	private double width, height;
	
	
	/**
	* Creates a new instance.
	*
	* @param uLX X coordinate of the upper left corner.
	* @param uLY Y coordinate of the upper left corner.
	* @param wid width of shape
	* @param hei height of shape
	*/
	
	
	public Shape (double uLX,double uLY,double wid,double hei)  {
		upperLeftX = uLX ;
		upperLeftY = uLY;
		width = wid;
		height = hei;
		
		}
	
	/**
	* Gets the upper x coordinate.
	*
	* @return the upperLeftX
	* 
	*/
	
	
	 public double getX() { 
		 return upperLeftX;

		 }

		/**
		* Gets the upper y coordinate.
		*
		* @return the upperLeftY
		* 
		*/
	
	 public double getY() { 
		 return upperLeftY;

		 }
	 

		/**
		* Gets the width.
		*
		* @return the width
		* 
		*/
	
	 public double getWidth() { 
		 return width;

		 }
	 

		/**
		* Gets the height.
		*
		* @return the height
		* 
		*/
	
	  
	 
	 public double getHeight() { 
		 return height;

		 }

		/**
		* Prints out the words I have chosen.
		*
		* A void draw method name for printing to the console.
		* @param gC GraphicsContextWrapper for generic shape
		* 
		*/
	 
	
	public void draw(GraphicsContextWrapper gC) {
		System.out.println("We can not draw the shape");
	}
	
	
	
	 
}
