package inheritance;

public class Vehicle {
	String brand;
	String type;
	
	public void move() {
		System.out.println("Your vehicle is moving");
	}
	
	public void stop() {
		System.out.print("Vehicle halted!!");
	}
	
	public void printDetails() {
		System.out.println(this.brand+", "+this.type);
	}
}


