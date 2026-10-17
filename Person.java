package classobject;

/* Create a class Person with attributes name, age and country. Implement
methods to set and get these attributes. Create an object of this class, set its
attributes, and print out the details.*/

import java.util.Scanner;

public class Person {
	private int rollno;
	private String name;
	private int age;
	
	public void setPerson(int r,String n,int a) {
		rollno = r;
		name = n;
		age = a;
	}
	public void getPerson() {
		System.out.println(rollno + " " + name + " " + age);	
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Id: ");
		int i = sc.nextInt();
		
		System.out.print("Enter Name: ");
		String s1 = sc.next();
		
		System.out.print("EnterAge: ");
		int d = sc.nextInt();
		Person p = new Person();
		p.setPerson(i, s1, d);
		p.getPerson();
		
		Person p1 = new Person();
		p.setPerson(205,"King",22);
		p.getPerson();
		
		
	}
}
