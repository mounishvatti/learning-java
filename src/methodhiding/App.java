package methodhiding;

public class App {
	public static void main(String[] args) {
		Parent p = new Parent();
		Child c = new Child();
		
		Parent.m(); // Parent class
		p.m(); // Parent class
		
		System.out.println();
		
		c.m(); // Child class
		Child.m(); // Child class
		
		System.out.println();
		
		Parent p1 = new Child();
		p1.m(); // Parent class 
		
		// not method overriding, this is method hiding
	}
}
