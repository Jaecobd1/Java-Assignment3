public class Cars {
	String make;
	String model;
	int year;
	int vinNumber;
	CarOwners owner;
	String ownerName;
	
	
	
	// Constructor
	Cars(String make, String model, int year, int vinNumber, CarOwners owner){
		// Set Info
		this.make = make;
		this.model = model;
		this.year = year;
		this.vinNumber = vinNumber;
		// Get Owners Name
		this.owner = owner;
		this.ownerName = owner.getName();
		
	}
	public String toString() {
		String string;
		string = "Make: " + this.make + "\nModel: " + this.model 
				+ "\nYear: " + this.year + "\nvinNumber: " + this.vinNumber 
				+ "\nOwner: " + this.ownerName;
		return string;
	}
	
	
	public int getVinNumber() {
		return this.vinNumber;
	}
	

}
