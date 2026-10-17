package classobject;

/*Define a class of type Student that has rollno, name and age as private
data members. Define SetData() and GetData() as public member functions
with appropriate functionality. Write a program that declares 2 student
objects, initializes the first at run-time and second by reading from the
console, and then displays both student’s data.*/

//Main Class and Driver class
import java.util.*;
public class MainStudent {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter id: ");
		int i = sc.nextInt();
		
		System.out.print("Enter name: ");
		String s1 = sc.next();
		
		System.out.print("Enter GPA: ");
		double d = sc.nextDouble();
		
		Student s = new Student();//creating an object
		s.setStudent(i,s1,d);
		s.getStudent();
		
		Student s2 = new Student();//creating an object
		s2.setStudent(101,"Raju",82);
		s2.getStudent();
		
	}
}