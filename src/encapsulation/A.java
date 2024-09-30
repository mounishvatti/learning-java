package encapsulation;

public class A extends Variables {
	public static void main(String[] args) {
		A a1 = new A();
		System.out.println(a1.getPrivate_var());
		System.out.println(a1.default_var);
		System.out.println(a1.protected_var);
		System.out.println(a1.public_var);
	}
}
