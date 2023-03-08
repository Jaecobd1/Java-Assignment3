
public class SedanCar extends Cars {
	int doors;
	int trunkSize;
	public SedanCar(String make, String model, int year, int vinNumber, CarOwners owner,
			int doors, int trunkSize) {
		super(make,model,year,vinNumber, owner);
		this.doors = doors;
		this.trunkSize = trunkSize;
	}
	public String toString() {
		String string;
		string = "Sedan Info\n" +
				"Make: " + this.make + "\nModel: " + this.model 
				+ "\nYear: " + this.year + "\nVin Number: " + this.vinNumber
				+ "\nDoors: " + this.doors + "\nTrunk Size: " + this.trunkSize
				+ "\nOwner: " + this.ownerName;
		return string;
	}
}
