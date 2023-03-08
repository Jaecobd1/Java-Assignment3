
public class SavingsAccount extends Account{
	double interestRate;
	
	public SavingsAccount(int accountNumber, double balance, double interestRate){
		super(accountNumber,balance);
		this.interestRate = interestRate;
	}
	
	public void calculateInterest() {
		this.balance = this.balance + (this.balance * (this.interestRate * 0.01));
	}
}
