package constructsprograms;

public class CompositionAddress {
	String street;
	String city;
	String state;
	public CompositionAddress(String street, String city, String state) {
		super();
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
class Person1{
	String name;
	private Address address;
	
	 // COMPOSITION: Person creates and owns its Address component
	Person1(String name,String street, String city, String state){
		this.name = name;
		
		 // Address object is created inside the Person constructor
		this.address = new Address(street,city,state);
	}
	void displayPerson() {
		System.out.println("Name: " + name);
		address.displayAddress();
	}
}
