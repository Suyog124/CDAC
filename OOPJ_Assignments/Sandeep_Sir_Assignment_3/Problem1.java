
import java.util.Scanner;
class LoanAmorizationCalculator{
	private double principalAmount;
	private double annualInterestRate;
	private int loanTerm;
	private double monthlyPayment;
	
	public void acceptRecord() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Principal Amount :");
		principalAmount = sc.nextDouble();
		
		System.out.print("Enter Annual Intrest Rate :");
		annualInterestRate = sc.nextDouble();
		
		System.out.print("Enter Loan Term : ");
		loanTerm = sc.nextInt();
		sc.close();
		
		
		
		
	}
	public void calculateMonthlyPayment(){
		double monthlyInterestRate = annualInterestRate / 12 / 100 ; 
		int numberOfMonths = loanTerm * 12; 


		monthlyPayment = principalAmount * (monthlyInterestRate * 
				Math.pow(1 + monthlyInterestRate, numberOfMonths)) / 
                (Math.pow(1 + monthlyInterestRate, numberOfMonths) - 1);
		
	}
	public void printRecord() {
		double TotalPayment = monthlyPayment*loanTerm*12;
		System.out.println("Monthly Payment : " +monthlyPayment);
		System.out.println("Total Payment : "  +TotalPayment);
		
	}
	
	
}
public class Problem1 {
	public static void main(String[] args) {
		LoanAmorizationCalculator lca = new LoanAmorizationCalculator();
		lca.acceptRecord();
		lca.calculateMonthlyPayment();
		lca.printRecord();

	}

}
