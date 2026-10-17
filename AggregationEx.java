package constructsprograms;

class Teacher{
	String name;
	Teacher(String name){
		this.name = name;
	}
}

class Department{
	String dname;
	Teacher teacher; // Aggregation
	public Department(String dname, Teacher teacher) {
		this.dname = dname;
		this.teacher = teacher;
	}
	void display() {
		System.out.println(teacher.name+" is a Teacher" );
		System.out.println( dname + " Departmnet ");
		
	}
}

public class AggregationEx {

	public static void main(String[] args) {
		Teacher t = new Teacher("Raju");
		Department d = new Department("Comupter Science " ,t);
		d.display();
	}
}
