package constructsprograms;

import java.util.Scanner;

/*Using this in Constructors: Create a class Rectangle with attributes length
and width. Implement a parameterized constructor that initializes these
attributes. Use this to differentiate between class variables and constructor
parameters. Include methods to calculate the area and perimeter.

Formula
Area of Rectangle: Area = length×width 
Perimeter of Rectangle: Perimeter = 2×(length+width)
*/

class Rectangle1 {
	private double length;
	private double width;
	Rectangle1(double length,double width){
		this.length = length;
		this.width = width;
	}
	public double Area() {
		return length * width;
	}
	public double Perimeter() {
		return 2*(length+width);
	}
}
public class Rectangle{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a length: ");
		double l = sc.nextDouble();
		System.out.print("Enter a width: ");
		double w = sc.nextDouble();
		
		Rectangle1 r = new Rectangle1(l,w);
		System.out.println("Area = " + r.Area());
		System.out.println("Perimeter = " + r.Perimeter());
	}
}


