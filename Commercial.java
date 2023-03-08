
public class Commercial extends Customer{
	int creditRating;
	String contactPerson;
	String contactPhone;

	Commercial(String name, String address, String phone,
			String branch, int creditRating, String contactPerson, String contactPhone){
		super(name, address, phone, branch);
		this.creditRating = creditRating;
		this.contactPerson = contactPerson;
		this.contactPhone = contactPhone;
		
	}
	public String toString() {
		return "name: " + this.name + "\nAddress: " + this.address + 
				"\nPhone: " + this.phone + "\nBranch: " + this.branch
				+ "\nCredit Rating: " + this.creditRating + "\nContact Person: "
				+ this.contactPerson + "\nContact Person Phone: " + this.contactPhone
				+ "\nAccounts" + this.userAccounts;
	}
}
