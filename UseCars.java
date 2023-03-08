import java.util.ArrayList;
import java.util.Scanner;
public class UseCars {

	public static void main(String[] args) {
		ArrayList<Cars> allCars = new ArrayList<Cars>();
		//Create Car owner
		CarOwners o1 = new CarOwners("Jake", "1234 home st");
		// Create Car
		SedanCar c1 = new SedanCar("Hyundi","Sonata",2011,138382, o1, 4, 5);
		// Second Owner
		CarOwners o2 = new CarOwners("Mom", "Parents Ave.");
		SedanCar c2 = new SedanCar("Honda", "Crv", 2018, 420823, o2, 4, 10);
		allCars.add(c1);
		allCars.add(c2);
	
		
		CarOwners owner = createNewOwner(allCars);
		// Search Car by Vin
		searchByVin(420823, allCars);
		
		System.out.println("\nAll Cars: ");
		for(Cars c: allCars) {
			System.out.println(c);
		}
		
	}
	
	public static CarOwners createNewOwner(ArrayList<Cars>allCars) {
		ArrayList<Cars> carsList = new ArrayList<Cars>();
		
		Scanner in = new Scanner(System.in);
		System.out.println("What is the Driver's name?");
		String name = in.nextLine();
		System.out.println("What is the Driver's Address?");
		String address = in.nextLine();
		CarOwners owner = new CarOwners(name, address);
		
		System.out.println("How many cars do they have?");
		int cars = in.nextInt();
		in.nextLine();
		for(int i = 0; i < cars; i++) {
			System.out.println("What kind of Car? (Sport or Sedan)");
			
			String answer = in.nextLine();
			if (answer.equals("Sport")| answer.equals("sport")) {
				Cars car = createSportsCar(owner);
				carsList.add(car);
				allCars.add(car);
			} else if(answer.equals("Sedan") | answer.equals("sedan")) {
				Cars car = createSedanCar(owner);
				allCars.add(car);
				carsList.add(car);
			} else {
				System.out.print("Please Enter Sport or Sedan\n");
				i--;
			}
			
		}
		
		System.out.println("Created: Driver:" + owner.getName() + "With cars: " + carsList);
		return owner;
	}
	
	// Method to search cars by Vin
	public static void searchByVin(int vin, ArrayList<Cars> cars) {
		for (Cars c: cars) {
			int currentVin = c.vinNumber;
			if(vin == currentVin) {
				System.out.println("Found by vin: \n" + c);
			}
		}
	}
	
	// Method to create Sports Cars from prompt
	public static Cars createSportsCar(CarOwners owner) {
		Scanner in = new Scanner(System.in);
		System.out.println("What is the Make of the car?");
		String make = in.nextLine();
		System.out.println("What is the Model of the car?");
		String model = in.nextLine();
		System.out.println("What is the Year of the car?");
		int year = in.nextInt();
		System.out.println("What is the Vin Number?");
		int vinNumber = in.nextInt();
		System.out.println("What is the raceStats?");
		int raceStats = in.nextInt();
		SportsCar car = new SportsCar(make, model, year, vinNumber, owner, raceStats);
		return car;
		
	}
	
	// Method to create Sedans from prompt
	public static Cars createSedanCar(CarOwners owner) {
		Scanner in = new Scanner(System.in);
		System.out.println("What is the Make of the car?");
		String make = in.nextLine();
		System.out.println("What is the Model of the car?");
		String model = in.nextLine();
		System.out.println("What is the Year of the car?");
		int year = in.nextInt();
		System.out.println("What is the Vin Number?");
		int vinNumber = in.nextInt();
		System.out.println("How many Doors does the car have?");
		int doors = in.nextInt();
		System.out.println("How large is the trunk 1-10?");
		int trunkSize = in.nextInt();
		SedanCar car = new SedanCar(make, model, year, vinNumber, owner, doors, trunkSize);
		return car;
	}

}
