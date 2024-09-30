package inheritance;

public class App {
	
	public static void main(String[] args) {
		Car c1 = new Car("Audi", "EV");
		
		Bike b1 = new Bike("Ducati", "Petrol");
		
		c1.printDetails();
		b1.printDetails();
	}
}
	
