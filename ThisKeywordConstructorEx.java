package constructsprograms;

/* Using this: Modify the Person class to include a method that displays the
name and age of the object. Use this keyword to differentiate between class
variables and method parameters. Implement a method to compare two
Person objects based on their age.*/

public class ThisKeywordConstructorEx {
	private int id;
	private String name;
	private int age;
	
	public ThisKeywordConstructorEx(int id,String name,int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	public void getPerson() {
		System.out.println("Id: " + id );
		System.out.println("Name: " + name );
		System.out.println("Age: "  + age);	
	}
	public void compareAge(ThisKeywordConstructorEx p) {
		if(age>p.age) {
			System.out.println(name + " is odler than " + p.name);
		}
		else if (age<p.age) {
			System.out.println(name + " is younger than " + p.name );
		}
		else {
			System.out.println(name + " And " + p.name + " Are of the same age" );
	}
}
}
