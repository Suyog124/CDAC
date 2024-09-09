import java.util.Scanner;

public class BMI {
  public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      System.out.print("Enter your WEIGHT:- ");
      double Weight = in.nextDouble();
      System.out.println("Enter Your Height in meter:- ");
      double Height = in.nextDouble();
      double Bmi = Weight / (Height*Height);

      if(18.5 > Bmi){
          System.out.println("Your are under Weight ");
      } else if (24.9 < Bmi) {
          System.out.println("Your are OverWeight");

      }else {
          System.out.println("You are normal GOod !!!!!!" );
      }
  }
}
