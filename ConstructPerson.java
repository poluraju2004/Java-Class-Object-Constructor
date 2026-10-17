package constructsprograms;
/* Constructor Overloading: Extend the Person class from the previous
problem and add multiple constructors (default, parameterized, etc.) to
initialize the attributes. Also, include a method to display the details.*/

// default and Parameterized Constructs
import java.util.Scanner;
public class ConstructPerson {
		private int id;
		private String name;
		private double gpa;
		private static String university = "ANU"; 
		// default construct
		public ConstructPerson() {
			// no code-> primary responsibility : construct instance with their defaults
		System.out.println("It is a Default constructs: ");
		}
		 //Parameterized Constructs
		public ConstructPerson(int i,String s,double avg) {
			id = i;
			name = s;
			gpa = avg;
		}
		public void getStudent() {
			System.out.println(id + " " + name + " "  + gpa + " " + university);
		}
		public static void main(String args[]) {
			Scanner sc = new Scanner(System.in);
			
			System.out.print("Enter id: ");
			int i = sc.nextInt();
			
			System.out.print("Enter name: ");
			String s1 = sc.next();
			
			System.out.print("Enter GPA: ");
			double d = sc.nextDouble();
			ConstructPerson s = new ConstructPerson(i,s1,d); // parameterized
			s.getStudent();
			
			ConstructPerson s3 = new ConstructPerson();
			s3.getStudent(); // 0 null 0.0 
			
	}
}

