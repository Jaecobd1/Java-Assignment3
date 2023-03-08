
public class SportsCar extends Cars {
	int raceStats;
	public SportsCar(String make, String model, int year, CarOwners owner, int vinNumber, int raceStats) {
		super(make, model, year, vinNumber, owner);
		this.raceStats = raceStats;
	}
	public SportsCar(String make, String model, int year, int vinNumber,  CarOwners owner, int raceStats) {
		super(make, model, year, vinNumber, owner);
		this.raceStats = raceStats;
	}
	
	public String toString() {
		String string;
		string = "Sports Car Info: \n" +
				"Make: " + this.make + "\nModel: " + this.model 
				+ "\nYear: " + this.year + "\nvinNumber: " + this.vinNumber
				+ "\nRace Stats: " + this.raceStats + "\nOwner: " + this.ownerName;
		return string;
	}
}
