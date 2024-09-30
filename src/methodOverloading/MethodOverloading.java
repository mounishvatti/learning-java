package methodOverloading;

public class MethodOverloading {
	
	// method overloading
	protected void m1(int a) {
		System.out.print("int-arg - ");
		System.out.println(a);
	}
	
	protected void m1(int a, int b) {
		System.out.print("2 int-arg - ");
		System.out.println(a + ", " +b);
	}
	
	protected void m1(double x) {
		System.out.print("double-arg - ");
		System.out.println(x);
	}
	
	public static void main(String[] args) {
		MethodOverloading m = new MethodOverloading();
		m.m1(10);
		m.m1(10, 12);
		m.m1(10.5);
		m.m1('a');
	}
}
