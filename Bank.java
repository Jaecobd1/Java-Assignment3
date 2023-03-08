import java.util.ArrayList;
public class Bank {

	public static void main(String[] args) {
		// Create Commercial Customer 1
		Commercial c1 = new Commercial("Apple", "100 first St,"
				+ " Chicago, Illinois", "(111)222-3333",
				"Chicago", 795, "Jeff", "(493)398-3943");
		
		// Create Account 1
		CheckingAccount a1 = new CheckingAccount(1, 900.00, "default", 100.00);
		c1.addAccount(a1); // Add the Account to Customer 1
		// create ArrayList of accounts
		ArrayList<Account> accountList = new ArrayList<Account>();
		accountList.add(a1); // Add Account 1 to list		
		customerInfo(c1);	// display the customer information 		
		a1.makeDeposit(100); 	// Deposit $100 into account 1;
		customerInfo(c1);		// Display new Info
	
		//Create Personal Account
		Personal p1 = new Personal("Person", "1234 Person st. Indiana",
				"(232)232-2323", "Main", "(232)232-2333", "(323)323-3232");
		// Create Savings account with $100
		SavingsAccount a2 = new SavingsAccount(2, 100.00, 10.0);
		
		accountList.add(a2); // Add account to account list
		accountBalance(a2); // Display Account Balance
		a2.calculateInterest(); // Calculate Interest
		// Display Account Balance After Interests
		accountBalance(a2);
		
		a2.makeDeposit(100); // Make $100 Deposit
		a2.calculateInterest(); // Calculate Interest Again
		accountBalance(a2); // Display Account Balance Again		
	}
	
	public static void customerInfo(Customer customer) {
		System.out.println(customer.toString());
	}
	public static void accountBalance(Account account) {
		System.out.println("$" + account.getBalance());
	}

}
