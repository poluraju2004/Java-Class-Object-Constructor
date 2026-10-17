package constructsprograms;
/*8.Class and methods: Create a class Calculator with relevant data members
and a constructor. Implement methods for basic arithmetic operations
(addition, subtraction, multiplication, division, modulus) and demonstrate
their usage.*/

public class ArithmeticOperations {
		private int a;
		private int b;
		public ArithmeticOperations(int a,int b){
			this.a = a;
			this.b = b;
		}
		public void Calculate(char ch) {
			switch(ch) {
			case '+' :
				System.out.println("A+B: " + (a+b));
				break;
			case '-' :
				System.out.println("A-B: " + (a-b));
				break;
			case '*' :
				if(b!=0)
				System.out.println("A+B: " + (a*b));
				else
					System.out.println("Divide by zero");
				break;
			case '/' :
				System.out.println("A+B: " + (a/b));
				break;
			case '%':
                if (b != 0) 
                    System.out.println("Modulus: " + (a % b));
                 else 
                    System.out.println("Modulus by zero is not allowed.");
                break;
			default:
				System.out.println("Invalid Operater: ");	
		}
	}
}