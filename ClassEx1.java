package classobject;
import java.util.Scanner;
class Sample{
	private int id;
	private String name;
	public void setData(int id ,String name) {
		this.id = id;
		this.name = name;
		
	}
	void display() {
		System.out.println("Id:" + id  + " Name:" + name );
	}
	
}

public class ClassEx1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		System.out.print("Enter a name:" );
		String s = sc.next();
		Sample s1 = new Sample();
		s1.setData(n,s);
		s1.display();
		

	}

}
