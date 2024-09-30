package interfaces;

public class MyApp {
	public static void main(String[] args) {
		Simpl acc1 = new Simpl();
		acc1.createAccount();
		acc1.login();
		acc1.depositMoney();
		acc1.fetchBalanceAmount();
		acc1.getInterestRate();
		acc1.logout();
		
		Jupiter account1 = new Jupiter();
		account1.createAccount();
	}
}
