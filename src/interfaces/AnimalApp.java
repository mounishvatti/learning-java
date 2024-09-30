package interfaces;

public class AnimalApp {
	public static void main(String[] args) {
		Dog d1 = new Dog();
		d1.sound();
		d1.walk();
		
		System.out.println();
		
		Cat c1 = new Cat();
		c1.sound();
		c1.walk();
	}
}
