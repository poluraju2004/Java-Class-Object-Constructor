package constructsprograms;

/*Static Variable: Create a class BankAccount with accno, accType, Balance
and static variable interestRate. Initialize it using a static block. Implement
methods to deposit and withdraw funds. Create objects and display details.

Static Method: Add a static method to the BankAccount class from the
previous problem to calculate interest based on a given balance and interest

rate. Also, implement a method to display the account details including
balance and interest earned.
*/

import java.util.Scanner;
public class MainBankAccount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter account number: ");
        int accno = sc.nextInt();

        System.out.print("Enter account type: ");
        String accType = sc.next();

        System.out.print("Enter opening balance: ");
        double balance = sc.nextDouble();

        BankAccount b = new BankAccount(accno, accType, balance);

        System.out.print("Enter deposit amount: ");
        double depositAmount = sc.nextDouble();
        b.deposit(depositAmount);

        System.out.print("Enter withdrawal amount: ");
        double withdrawAmount = sc.nextDouble();
        b.withdraw(withdrawAmount);

        System.out.println("\n--- Account Details ---");
        b.display();

	}

}
