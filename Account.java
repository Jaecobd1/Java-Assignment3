import java.util.Date;
public class Account {
	int accountNumber;
	double balance;
	Date dateOpened;
	
	public Account(int accountNumber, double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.dateOpened = new Date();
	}
	
	public void makeDeposit(int depositAmount) {
		this.balance = this.balance + depositAmount;
	}
	public void makeWithdraw(int withdrawAmount) {
		this.balance = this.balance - withdrawAmount;
	}
	
	public String toString() {
		String res = "Account: #" + this.accountNumber 
				+ " Balance: $" + this.balance
				+ " Date Created: " + this.dateOpened;
		return res;
	}
	public double getBalance() {
		return this.balance;
	}
	
}
