package methodOverloading;

import java.util.Arrays;

public class MethodOverloading {
	
	// method overloading
	protected void m1(int a) {
		System.out.print("int-arg - ");
		System.out.println(a);
	}
	
	protected void m1(int... a) { //  This allows the method to accept zero or more int values as arguments.
		System.out.print("var-arg - ");
		System.out.println(Arrays.toString(a)); // 
	}
	
	/*
	 * When you print a using System.out.println(a);
	 * it will print the memory reference of the array rather than the actual values in the array. 
	 * If you want to print the values, you should loop through the array or use Arrays.toString().
	 */
	
	// case - 1 
	protected void m1(float x) {
		System.out.print("float-arg - ");
		System.out.println(x);
	}
	
	protected void m1(double x) {
		System.out.print("double-arg - ");
		System.out.println(x);
	}
	
	protected void m1(long x) {
		System.out.print("long-arg - ");
		System.out.println(x);
	}
	
	protected void m1(float x, int a) {
		System.out.print("float & int-arg - ");
		System.out.println(x+", "+a);
	}
	
	protected void m1(int x, float a) {
		System.out.print("Int & float-arg - ");
		System.out.println(x+", "+a);
	}
	
	protected void m2(Object O) {
		System.out.print("Object-arg - ");
		System.out.println(O);
	}
	
	protected void m2(String s1) {
		System.out.print("String-arg - ");
		System.out.println(s1);
	}
	
	protected void m2(StringBuffer s1) {
		System.out.print("StringBuffer-arg - ");
		System.out.println(s1);
	}
	
	public static void main(String[] args) {
		MethodOverloading m = new MethodOverloading();
		m.m1(10);
		m.m1(10, 12, 13);
		// m.m1(1,2); // is ambiguous because This would still call the (int, float) or (float, int) methods due to automatic promotion.
		m.m1(new int[] {1,2}); // this will forcefully invoke the var-arg method 
		m.m1(10.5f);
		m.m1(10.5d);
		m.m1(10l);
		m.m1('a'); // automatic promotion in overloading
		m.m2(new Object());
		m.m1(1,1.0f);
		m.m1(1.0f,1);
		// case - 2
		
		m.m2("Mounish");
		m.m2(new StringBuffer("Mounish"));
		// m.m2(null);
	}
}
