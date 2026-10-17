package classobject;

/*Define a class of type Student that has rollno, name and age as private
data members. Define SetData() and GetData() as public member functions
with appropriate functionality. Write a program that declares 2 student
objects, initializes the first at run-time and second by reading from the
console, and then displays both student’s data.*/


public class Student {
		// data member
		
		int id;//instance-object-Heap
		String name;//instance
		double gpa;//instance
		static String university = "ANU"; // class - Class Area
		
		//methods -- setter & getter
		public void setStudent(int i,String s,double avg) {//local variables
			id = i;
			name = s;
			gpa = avg;
		}
		public void getStudent() {
			System.out.println(id + " " + name + " "  + gpa + " " + university);
		}
}

//JVM uses runtime memories
//All Object are stored memory is heap
//All Static variable are stored in class Area
//stack Area