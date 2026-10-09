package t28027_Sidhant_A05;

public class BankAccount_3 {
	
	String accountHolderName;
	double balance;
	long accountNo;
	
	public BankAccount_3(String accountHolderName, double balance, long accountNo) {
		this.accountHolderName = accountHolderName;
		this.balance = balance;
		this.accountNo = accountNo;
	}

	public void deposit(double amount) {
		this.balance += amount;
	}
	
	public void withdraw(double amount) {
		this.balance -= amount;
	}
	
	public void displayAccountDetails() {
		System.out.println("Account Number : "+this.accountNo);
		System.out.println("Account Holder Name : "+this.accountHolderName);
		System.out.println("Account Current Balance : "+this.balance);
	}
	
	public static void main(String[] args) {
		CurrentAccount_3 ca = new CurrentAccount_3("SJ", 43190493, 234565333, 274732);
		ca.displayCurrentAccountDetails();
		System.out.println();	
		SavingsAccount_3 sa = new SavingsAccount_3("IJ", 2190493, 234565334, 20);
		sa.displaySavingsDetails();
	}
}
