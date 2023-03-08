import java.util.ArrayList;
public class Customer {
	String name;
	String address;
	String phone;
	String branch;
	ArrayList<Account> userAccounts = new ArrayList<Account>();
	
	public Customer(String name, String address, String phone, String branch) {
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.branch = branch;
	}
	public String toString() {
		return "name: " + this.name + "\nAddress: " + this.address + 
				"\nPhone: " + this.phone + "\nBranch: " + this.branch
				+ "\nAccounts" + this.userAccounts
				;
	}
	
	public void addAccount(Account account) {
		this.userAccounts.add(account);
	}
	
	
	
}
