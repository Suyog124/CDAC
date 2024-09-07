import java.util.Scanner;

class DiscountCalculator {
	private double originalPrice;
	private double discountRate;
	private double discountAmount;
	private double finalPrice;
	
	
	public void acceptRecord() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Original Price :");
		originalPrice = sc.nextDouble();
		
		System.out.print("Enter Discount Rate % : ");
		discountRate = sc.nextDouble();

		sc.close();
		
		
		
	}
	
	public void calculateDiscount() {
		discountAmount= originalPrice * (discountRate/100);
		finalPrice = originalPrice - discountAmount;
	}
	
	public void printRecord() {
		System.out.println("The discount in Rs is :"  +discountAmount);
		System.out.println("The Final Price  Rs is :"  +finalPrice);
	}
	
}

public class Problem4 {

	public static void main(String[] args) {
		DiscountCalculator c = new DiscountCalculator();
		c.acceptRecord();
		c.calculateDiscount();
		c.printRecord();

	}

}
