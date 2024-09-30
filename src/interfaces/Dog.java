package interfaces;

public class Dog implements Animals{

	@Override
	public void sound() {
		System.out.println("The dog barks");
		
	}

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		System.out.println("The dog walks");
	}

}
