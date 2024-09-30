package methodOverloading;

public class MethodOverloading {
	
	// method overloading
	public void m1(int a) {
		System.out.println(a);
	}
	
	public void m1(int a, int b) {
		System.out.println(a + ", " +b);
	}
	
	
	public static void main(String[] args) {
		MethodOverloading m = new MethodOverloading();
		m.m1(10);
		m.m1(10, 12);
	}
}
