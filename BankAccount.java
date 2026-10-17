package constructsprograms;

/* Static Variable: Create a class BankAccount with accno, accType, Balance
and static variable interestRate. Initialize it using a static block. Implement
methods to deposit and withdraw funds. Create objects and display details.

Static Method: Add a static method to the BankAccount class from the
previous problem to calculate interest based on a given balance and interest

rate. Also, implement a method to display the account details including
balance and interest earned.
*/

public class BankAccount {
	private int accno;
	private String accType;
	private double balance;
	
	static double interestRate;
	
	static {
		interestRate = 5.0;
		System.out.println("Static block is executed: ");
	}
	
	public BankAccount(int accno ,String accType,double balance) {
		this.accno = accno;
		this.accType = accType;
		this.balance = balance;
	}
	public void deposit(double amount) {
		if(amount > 0) {
			balance += amount;
			System.out.println("Deposit Amount: " + amount);
		}else {
			System.out.println("Invalid Deposit Amount: ");
		}
	}
	
	public void withdraw(double amount) {
		if (amount <= 0) {
			System.out.println("Invalid Withdraw Amount: ");
		}
		else if(amount > balance) {
			System.out.println("Insufficient Balance: ");
		}
		else {
			balance -= amount;
			System.out.println("Withdraw Successfully: " + amount);
		} 
	}
	// Static method to calculate interest
    public static double calculateInterest(double balance, double rate) {
        return balance * rate / 100;
    }
	
	public void display() {
			double interest = calculateInterest(balance, interestRate);
		 	System.out.println("Account Number: " + accno);
	        System.out.println("Account Type: " + accType);
	        System.out.println("Balance: " + balance);
	        System.out.println("Interest Rate: " + interestRate + "%");
	        System.out.printf("Interest Earned: %.2f%n", interest);
	        System.out.printf("Balance with Interest: %.2f%n",balance + interest);
	        System.out.println("-------------------------");
	}
}
