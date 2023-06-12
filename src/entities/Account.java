package entities;

public class Account {
	
	public static final double drawRate = 5.00; 
	
	private int accountNumber;
	
	private String accountHolder;
	
	private double accountBalance;
	
	//constructor to 'y' response
	public Account(int accountNumber, String accountHolder, double initialDeposit) {
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		doDeposit(initialDeposit);
	}
	

	//constructor to 'n' response
	public Account(int accountNumber, String accountHolder) {
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
	}
	
	
	public int getAccountNumber() {
		return accountNumber;
	}

	public String getAccountHolder() {
		return accountHolder;
	}

	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}

	
	public void doDeposit(double amount) {
		 accountBalance += amount;
	}
	
	public void withDraw(double amount) {
		 accountBalance -= amount;
	}

	
}
