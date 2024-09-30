package interfaces;

public abstract class Validate {
	public void validateAadhar() {
		System.out.println("Validated Aadhar Card");
	}
	
	public void validatePAN() {
		System.out.print("Validated PAN Card");
	}
	
	public abstract void quarterlyReport(); // want this to be mandatory for all but have their own logic to implement
}


// Validate cannot be instantiated as it is an abstract class

