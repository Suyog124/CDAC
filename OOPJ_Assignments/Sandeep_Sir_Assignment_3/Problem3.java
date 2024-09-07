import java.util.Scanner;

class BMITracker {
	private double weight;
	private double height;
	private double BMI;
	
	public void acceptRecord() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Your weight :");
		weight = sc.nextDouble();
				
		System.out.print("Enter Your height :");
		height = sc.nextDouble();
		sc.close();
	 
	}
	public void calculateBMI() {
		BMI = weight / (height * height);
	}
	public void classifyBMI() {
		if (BMI < 18.5) {
			System.out.println("UnderWeight ");
		}
		else if (18.5 < BMI && 24.9 > BMI) {
			System.out.print(" Normal Wieght");
			
		}
		else if (25 < BMI && 29.9 > BMI) {
			System.out.print("Overwietght");
		}
		else  {
			System.out.print("Obesity");
		}
		
	}
		public void printRecord() {
			System.out.print("The person is :" +BMI);
		}
}
	

public class Problem3 {

	public static void main(String[] args) {
		BMITracker accept = new BMITracker();
		accept.acceptRecord();
		accept.calculateBMI();
		accept.classifyBMI();
		accept.printRecord();
		
		

	}

}
