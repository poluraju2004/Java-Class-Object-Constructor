package constructsprograms;

/* Composition and Aggregation: Create a class Address with attributes
street, city, and state. Then create a class Person with attributes name and
an Address object. 
Demonstrate how to use com Write a Java class
representing a Student. Encapsulate the student's name, age, and grade
point average (GPA) with private access modifiers. Provide getter and setter
methods to access and modify these attributes position to model the
relationship between a person and their address.*/

public class Address {
	private String street;
	private String city;
	private String state;
	
	public Address(String street, String city, String state) {
		this.street = street;
		this.city = city;
		this.state = state;
	}
	public void displayAddress() {
		System.out.println("Street: " + street);
		System.out.println("City: " + city);
		System.out.println("State: " + state);
	}
}
class Person{
	String name;
	Address address;// Reference to an independently created Address
	
	// Aggregation: Address is provided from outside
	public Person(String name, Address address) {
		this.name = name;
		this.address = address;
	}
	public void displayPerson() {
		System.out.println("Name: " + name);
		address.displayAddress();
	}	
}