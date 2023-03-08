
public class CheckingAccount extends Account {
	String checkStyle;
	double minimumBalance;
	public CheckingAccount(int accountNumber, double balance, String checkStyle, double minimumBalance) {
		super(accountNumber, balance);
		this.checkStyle = checkStyle;
		this.minimumBalance = minimumBalance;
	}
	
	public String toString() {
		String res = "Account: #" + this.accountNumber 
				+ " Balance: $" + this.balance
				+ " Date Created: " + this.dateOpened
				+ "\nCheck Style: " + this.checkStyle
				+ " Min Balance: " + this.minimumBalance
				;
		return res;
	}
}
