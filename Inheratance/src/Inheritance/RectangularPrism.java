package Inheritance;

public class RectangularPrism extends Rectangle 
{
	private double height;
	private double surfaceArea;
	private double volume;

	public RectangularPrism()
	{
		this(1,2,3);
		System.out.println("I am entering the RectangularPrism's Normal constructor");
	    System.out.println("I am exiting the RectangularPrism's Normal constructor");
	}
	public RectangularPrism (double height) 
	{
		this(1,2,height);
		System.out.println("I am entering the RectangularPrism's Overloaded constructor");
	    System.out.println("I am exiting the RectangularPrism's Overloaded constructor");
		
	}
	public RectangularPrism(double length, double width, double height) 
	{
	super(length, width);
	this.height = height;
	System.out.println("I am entering the RectangularPrism's Overloaded constructor");
    System.out.println("I am exiting the RectangularPrism's Overloaded constructor");
	}
	public void setHeight(double height) 
	{
		this.height = height;
	}
	public double getHeight() 
	{
		return height;
	}
	public double getVolume()
	{
		return volume;
	}
	public double getSurfaceArea() 
	{
		return surfaceArea;
	}
	public String toString() 
	{
		return "I am a Rectangular Prism with width" + this.getWidth() + " and a length of " + this.getLength() +
	            " and a height of " + this.getHeight();
	}


}