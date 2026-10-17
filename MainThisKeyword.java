package constructsprograms;

/* Using this: Modify the Person class to include a method that displays the
name and age of the object. Use this keyword to differentiate between class
variables and method parameters. Implement a method to compare two
Person objects based on their age.*/

import java.util.Scanner;

public class MainThisKeyword {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter id: ");
		int i = sc.nextInt();
		
		System.out.print("Enter name: ");
		String s1 = sc.next();
		
		System.out.print("Enter Age: ");
		int d = sc.nextInt();
		
		ThisKeywordConstructorEx t = new ThisKeywordConstructorEx(i,s1,d);
		System.out.println("Person 1 Details: ");
		t.getPerson();
		
	System.out.println("-------------------------------------------");
		System.out.print("Enter id: ");
		int i1 = sc.nextInt();
		
		System.out.print("Enter name: ");
		String s2 = sc.next();
		
		System.out.print("Enter Age: ");
		int d1 = sc.nextInt();
		
		ThisKeywordConstructorEx t1 = new ThisKeywordConstructorEx(i1,s2,d1);
		
		System.out.println("Person 2 Details: ");
		t1.getPerson();
		
		System.out.println("Age Comparison ");
		t.compareAge(t1);
		
		
	}
}
