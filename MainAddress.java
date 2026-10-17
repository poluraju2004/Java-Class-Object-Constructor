package constructsprograms;

/* Composition and Aggregation: Create a class Address with attributes
street, city, and state. Then create a class Person with attributes name and
an Address object. 
Demonstrate how to use com Write a Java class
representing a Student. Encapsulate the student's name, age, and grade
point average (GPA) with private access modifiers. Provide getter and setter
methods to access and modify these attributes position to model the
relationship between a person and their address.*/

public class MainAddress {

	public static void main(String[] args) {
		Address a = new Address( "Beach Road", "Visakhapatnam", "Andhra Pradesh");
		
		Person p = new Person("King" , a);
		p.displayPerson();
	}

}
