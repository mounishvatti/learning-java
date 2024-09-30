package interfaces;

public abstract class BankingFunctions {
	public void login() {
		System.out.print("Successfully logged in");
	}
	public void logout() {
		System.out.print("Successfully logged out");
	}
	
	public abstract double fetchBalanceAmount();
	
	public abstract double getInterestRate();
	
	public abstract void applyLoan(double loanAmount);
	
	public abstract void greetingMessage();
}

