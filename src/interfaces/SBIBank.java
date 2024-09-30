package interfaces;

public class SBIBank extends Validate implements IRBI, ISEBI{

	//Validate v = new Validate(); not possible because this is an abstract class
	
	@Override
	public void createDematAccount() {
		// TODO Auto-generated method stub
		validateAadhar();
		validatePAN();
	}

	@Override
	public void placeOrder() {
		// TODO Auto-generated method stub
		System.out.println("Placing order through YONO SBI");
		System.out.println("Order placed successfully");
	}

	@Override
	public void cancelOrder() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void editOrder() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void viewPortfolio() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void createAccount() {
		// TODO Auto-generated method stub
		validateAadhar();
		validatePAN();
		
	}

	@Override
	public void closeAccount() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void depositMoney() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void withdrawMoney() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void quarterlyReport() {
		System.out.println("Generating Quarterly for your SBI Bank Account");
		
	}

	@Override
	public void FuturesAndOptions() {
		// TODO Auto-generated method stub
		
	}

}
