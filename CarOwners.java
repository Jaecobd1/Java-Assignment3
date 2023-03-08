import java.util.ArrayList;
public class CarOwners {
	String name;
	String address;
	ArrayList<Cars> cars = new ArrayList<Cars>();
	CarOwners(String name, String address){
		this.name = name;
		this.address = address;
	}
	
	public String getName(){
		return this.name;
	}
	
	public String toString() {
		String string;
		string = "Owner Info: \n" +
		"Name: " + this.name 
		+ "\nAddress: " + this.address;
		return string;
	}
	
	public void addCar(Cars car) {
		cars.add(car);
	}
	
	
}
