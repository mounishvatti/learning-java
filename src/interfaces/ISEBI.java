package interfaces;

public interface ISEBI {
	public void createDematAccount();
	public void placeOrder();
	public void cancelOrder();
	
	public void FuturesAndOptions();
	
	public void editOrder();
	public void viewPortfolio();
}


/*
 * Interfaces is used because there is no concept of multiple inheritance
 * We can extend the functionalities and they need to be implemented 
 */