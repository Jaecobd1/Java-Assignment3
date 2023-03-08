
public class Personal extends Customer {
	String homePhone;
	String workPhone;
	
	Personal(String name, String address, String phone, String branch, String homePhone, String workPhone){
		super(name, address, phone, branch);
		this.homePhone = homePhone;
		this.workPhone = workPhone;
	}
	
}
