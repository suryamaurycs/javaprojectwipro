package April17Task;

public class Vehicle {
	
	private String vehicleID;
	private String make;
	private String model;
	private int year;
	private double rentalRate;
	
	//constructor
	
	public Vehicle(String vehicleID, String make, String model, int year, double rentalRate) {
		this.vehicleID = vehicleID;
		
	public boolean checkAvailability() {
		//Write reservtion logic
	}
	public double calculateRentalCost(int days) {
		
	}
	}
	
	public boolean checkAvailability1() {
		return false;
		
	}
	
	Class Car extends Vehicle{
		private int numSeats;
		private String fuelType;
		
	public Car(String vehicleID, String make, String model, int year, double rentalRate, int numSeats, String fuelType) {
		
	}
	
	//Derived class : Truck
	
	class Truck extends Vehicle{
		private double cargoCapacity;
		private boolean isRentedWithDriver;
		
		//Parametrized constructor
		
	}
	
	//Derived class: Motorcycle
	
	class Motorcycle extends Vehicle{
		private double engineDisplacement;
		private boolean isHelmetProvided;
		//Parametrized constructor
	}
	
	public class Main{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Example usage 
		//Create Car, Truck, Motorcycle objects
		
		//Reserve and calculate rental cost for each vehicle 
		car.reserve();
		double carRentalCost = car.calculateRentalCost[3];
		System.out.println("Car Rental cost $"+carRentalCost);
		
		truck.reserve();
		double truckRentalCost = truck.calculateRentalCost(5);
		System.out.println("Truck rental Cost : $"+truckRentalCost);
		
		motorcycle.reserve();
		double motorcyclerentalCost = motorcycle.calculateRentalCost[2];
		System.out.println("Motorcycle rental cost: $"+ motorcycleRentalCost);
	}

}
