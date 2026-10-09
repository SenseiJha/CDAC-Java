package t28027_Sidhant_A05;

public class SavingsAccount_3 extends BankAccount_3 {
	double interestRate;

	public SavingsAccount_3(String accountHolderName, double balance, long accountNo, double interestRate) {
		super(accountHolderName, balance, accountNo);
		this.interestRate = interestRate;
	}
	
	public double calculateInterest() {
		return (this.balance * (this.interestRate/100));
	}
	
	public void displaySavingsDetails() {
		System.out.println("Account Number : "+this.accountNo);
		System.out.println("Account Holder Name : "+this.accountHolderName);
		System.out.println("Account Current Balance : "+this.balance);
		System.out.println("Interest : "+this.calculateInterest());
	}
}
