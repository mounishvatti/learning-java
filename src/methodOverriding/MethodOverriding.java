package methodOverriding;

public class MethodOverriding {
	
	public static void main(String[] args) {
		Dog d = new Dog();
		d.sound();
		
		Cat c = new Cat();
		c.sound();
		
		Animal a = new Animal();
		a.sound();
	}
	
}
