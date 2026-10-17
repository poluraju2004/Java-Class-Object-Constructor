package constructsprograms;

// default and Parameterized Constructs
import java.util.Scanner;

public class ConstructStudent {
	private int id;
	private String name;
	private double gpa;
	private static String university = "ANU"; 
	// default construct
	public ConstructStudent() {
		// no code-> primary responsibility : construct instance with their defaults
	System.out.println("It is a Default constructs: ");
	}
	 //Parameterized Constructs
	public ConstructStudent(int i,String s,double avg) {
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
		ConstructStudent s = new ConstructStudent(i,s1,d); // parameterized
		s.getStudent();
		
		ConstructStudent s3 = new ConstructStudent();
		s3.getStudent(); // 0 null 0.0 
		
	}
}
