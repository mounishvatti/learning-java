package interfaces;

import java.util.Scanner;

public class Simpl extends BankingFunctions implements IRBI{

	@Override
	public void createAccount() {
		// TODO Auto-generated method stub
		
		System.out.println("Creating new Simpl Account");
		
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
	public double fetchBalanceAmount() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public double getInterestRate() {
	    int x;
	    
	    try (Scanner sc = new Scanner(System.in)) { // Automatically closes the scanner when done
	        System.out.println("Select loan type: ");
	        System.out.println("1: Home loan");
	        System.out.println("2: Car loan");
	        System.out.println("3: Education loan");
	        x = sc.nextInt();
	    }

	    switch (x) {
	        case 1:
	            System.out.println("Home loan selected");
	            return 7.5;

	        case 2:
	            System.out.println("Car loan selected");
	            return 7.75;

	        case 3:
	            System.out.println("Education loan selected");
	            return 9.5;

	        default:
	            System.out.println("Invalid option, applying default interest rate.");
	            return 7.5;
	    }
	}
	public void applyLoan(double loanAmount) {
		System.out.print("Loan applied for"+loanAmount+" successfully");
	}
	
	public void greetingMessage() {
		System.out.println("-- Welcome to Jupiter Banking --");
	}
	
}
