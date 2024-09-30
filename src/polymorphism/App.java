package polymorphism;

public class App {
	public static void main(String[] args) {
		A a = new A();
		a.function_1();
		a.function_2();
		
		B b = new B();
		b.function_1();
		b.function_2();
		b.functionA();
		
		C c = new C();
		c.function_1();
		c.function_2();
		c.functionA();
		
		A a1 = new B();
		a1.function_1();
		a1.function_2();
		
		B b1 = new C();
		b1.function_1();
		b1.function_2();
		
	}
}
