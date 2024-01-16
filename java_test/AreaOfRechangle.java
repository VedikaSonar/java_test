// Q1. Write a Java program to create a class called Shape with a method called getArea(). 
//Create a subclass called Rectangle that overrides the getArea() method to calculate
//the area of a rectangle.

package java_test;

// parent class
  class Shape{
	public double getArea() {
		return 0;
	}
}
//subclass 
  
 class Rectangle extends Shape{
	
    double length;
    double width;
    
    public Rectangle(double length, double width) {
    	this.length=length;
    	this.width=width;
    	
    }
    
    public double getArea() {
    	return length * width;
    }
}
 //main class
public class AreaOfRechangle{
	 public static void main(String args[]) {
		 Rectangle rectangle = new Rectangle(6,20);
		 double area=rectangle.getArea();
		 System.out.println("the area of rectangle is: "+area);
	 }
}
