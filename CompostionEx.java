package constructsprograms;

class Room{
	void display() {
		System.out.println("This is a room");
	}
}
class House{
	private Room room;
	House(){
		room = new Room();//Composition
	}
	void display() {
		System.out.println("This is a House.");
		room.display();
	}
}
public class CompostionEx {
	public static void main(String[] args) {
		House h = new House();
		h.display();
	}
}