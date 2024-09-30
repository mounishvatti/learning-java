package methodOverriding;

public class MethodOverriding {
	
	public static void main(String[] args) {
		Dog d = new Dog();
		d.sound();
		
		Cat c = new Cat();
		c.sound();
		
		Animal a = new Animal();
		a.sound();
		
		Animal d1 = new Dog();
		Animal c1 = new Cat();
		
		d1.sound();
		c1.sound();
	}
	
}
