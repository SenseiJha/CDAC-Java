package t28027_Sidhant_A04;


import java.util.Scanner;

class BankAccount_2 {
    long accountNumber;
    String customerName;
    double balance;

    Scanner sc = new Scanner(System.in);

    void read() {
        System.out.print("Enter Account Number: ");
        accountNumber = sc.nextLong();
        sc.nextLine();

        System.out.print("Enter Customer Name: ");
        customerName = sc.nextLine();

        System.out.print("Enter Initial Balance: ");
        balance = sc.nextDouble();
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
        } else if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful.");
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    void display() {
        System.out.println("\n--- Account Details ---");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Current Balance: " + balance);
    }
    public static void main(String[] args) {
        BankAccount_2 account = new BankAccount_2();

        account.read();

        System.out.print("Enter deposit amount: ");
        double depositAmount = account.sc.nextDouble();
        account.deposit(depositAmount);

        System.out.print("Enter withdrawal amount: ");
        double withdrawalAmount = account.sc.nextDouble();
        account.withdraw(withdrawalAmount);

        account.display();
    }
}
