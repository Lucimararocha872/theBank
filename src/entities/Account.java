package entities;

public class Account {
	
	public static final double drawRate = 5.00; 
	
	private int accountNumber;
	
	private String accountHolder;
	
	private double accountBalance;
	
	public void doDeposit(double amount) {
		 accountBalance += amount;
	}
	
	public void withDraw(double amount) {
		 accountBalance -= amount;
	}

	
}
