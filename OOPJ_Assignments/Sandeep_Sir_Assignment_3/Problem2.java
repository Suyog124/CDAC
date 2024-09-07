import java.util.Scanner;

class example {

	  
    double principal;
    double annualInterestRate;
    int numberOfCompounds;
    int years;
    double futureValue;
    double totalInterest;

    
    public void acceptRecord() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter initial investment amount (₹): ");
        principal = sc.nextDouble();

        System.out.print("Enter annual interest rate (in %): ");
        annualInterestRate = sc.nextDouble() / 100;  // Convert percentage to decimal

        System.out.print("Enter the number of times interest is compounded per year: ");
        numberOfCompounds = sc.nextInt();

        System.out.print("Enter the duration of investment (in years): ");
        years = sc.nextInt();
        sc.close();
    }

    public void calculateFutureValue() {
        futureValue = principal * Math.pow(1 + (annualInterestRate / numberOfCompounds), numberOfCompounds * years);
        totalInterest = futureValue - principal;
    }

  
    public void printRecord() {
        System.out.printf("Future Value of the Investment: ₹%.2f%n", futureValue);
        System.out.printf("Total Interest Earned: ₹%.2f%n", totalInterest);
    }
}
public class Problem2{
  public static void main(String[] args) {
    example calculator = new example();

      
      calculator.acceptRecord();

      calculator.calculateFutureValue();

      
      calculator.printRecord();
    
  }
}