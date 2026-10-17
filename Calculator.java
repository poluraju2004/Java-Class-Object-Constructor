package constructsprograms;

import java.util.Scanner;

class Operators{
	private int a;
	private int b;
	
	public Operators(int a,int b){
		this.a = a;
		this.b = b;
	}
	public double Add() {
		return a+b;
	}
	public double Sub() {
		return a-b;
	}
	public double Mul() {
		return a+b;
	}
	public double Div() {
		if(b == 0) {
			System.out.println("Division by zero");
			return Double.NaN;
		}
		return a/b;
	}
	public double Mod() {
		if(b == 0) {
			System.out.println("Modulus by zero");
			return Double.NaN;
		}
		return a%b;
	}
}
public class Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number: ");
		int a = sc.nextInt();
		System.out.print("Enter secong number:" );
		int b = sc.nextInt();
		System.out.print("Enter a operator (+,-,*,/,%) ");
		char ch = sc.next().charAt(0);
		Operators o = new Operators(a,b);
		System.out.println("Addition: " + o.Add());
        System.out.println("Subtraction: " + o.Sub());
        System.out.println("Multiplication: " + o.Mul());
        System.out.println("Division: " + o.Div());
        System.out.println("Modulus: " + o.Mod());
		

	}

}
