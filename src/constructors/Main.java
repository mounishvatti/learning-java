package constructors;

public class Main {
	
	Main(){
		System.out.println("This is a constructor");
	}
	
	void Main() { // This is considered as a method because it has a return type
		System.out.println("This is a method");
	}
	
	 public static void main(String[] args) {
		Main m = new Main();
		m.Main();
	}}



// A constructor should not have any return type