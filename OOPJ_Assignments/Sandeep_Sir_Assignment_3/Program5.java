import java.util.Scanner;

class TollBoothRevenueManager{
	private int carRate;
	private int truckRate;
	private int Motorcycle;
	private int numberOfCars;
	private int numberOfTruck;
	private int numberOfMotorCycles;
	private int totalRevenue;
	
	
	public void setTollRates(int carRate, int truckRate, int Motorcycle ) {
		this.carRate = carRate;
		this.truckRate = truckRate;
		this.Motorcycle = Motorcycle;
	}
	
	public void acceptRecord() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number of cars gone :");
		numberOfCars = sc.nextInt();
		
		System.out.print("Enter Number of trucks gone :");
		numberOfTruck = sc.nextInt();
		
		System.out.print("Enter Number of Motorcycle gone :");
		 numberOfMotorCycles= sc.nextInt();
		
		sc.close();
	}
	
	public void calculateRevenue() {
		totalRevenue = (numberOfCars * carRate) + (numberOfTruck * truckRate) +  (numberOfMotorCycles * Motorcycle);
	}
	public void printRecord() {
		int totalVehicle = numberOfCars + numberOfTruck + numberOfMotorCycles;
		System.out.println("The total number of vehicle are :" +totalVehicle);
		System.out.println("The total revenue of vehicle is Rs :" +totalRevenue);
	}
	
}

public class Program5 {
	public static void main(String[] args) {
		
		TollBoothRevenueManager t = new TollBoothRevenueManager();
		t.setTollRates(100,20,30);
		t.acceptRecord();
		t.calculateRevenue();
		t.printRecord();
		
		
	}

}
