package constructsprograms;

import java.util.Scanner;

/*8.Class and methods: Create a class Calculator with relevant data members
and a constructor. Implement methods for basic arithmetic operations
(addition, subtraction, multiplication, division, modulus) and demonstrate
their usage.*/

public class MainArithmeticOperations {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number: ");
		int a = sc.nextInt();
		System.out.print("Enter secong number:" );
		int b = sc.nextInt();
		System.out.print("Enter a operator (+,-,*,/,%) ");
		char ch = sc.next().charAt(0);
		ArithmeticOperations ao = new ArithmeticOperations(a,b);
			ao.Calculate(ch);
		sc.close();
	}
}
