package t28027_Sidhant_A05;

public class CurrentAccount_3 extends BankAccount_3 {
	double overdraftLimit;
	
	public CurrentAccount_3(String accountHolderName, double balance, long accountNo, double overdraftLimit) {
		super(accountHolderName, balance, accountNo);
		this.overdraftLimit = overdraftLimit;
	}
	
	public boolean checkOverdraftLimit() {
		return (this.overdraftLimit > this.balance);
	}
	
	public void displayCurrentAccountDetails() {
		System.out.println("Account Number : "+this.accountNo);
		System.out.println("Account Holder Name : "+this.accountHolderName);
		System.out.println("Account Current Balance : "+this.balance);
		System.out.println("OverDraft Limit Status : "+this.checkOverdraftLimit());
	}
}
