package interfaces;

public class Cat implements Animals{
	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("The cat meows");
		
	}

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		System.out.println("The cat walks");
	}
}
