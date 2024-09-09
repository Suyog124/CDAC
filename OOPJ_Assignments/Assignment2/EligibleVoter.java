import java.util.Scanner;

public class EligibleVoter {
  public static void main(String[] args) {
    Scanner in  = new Scanner(System.in);
    System.out.print("Enter your age:- ");
    int age = in.nextInt();

    if(age > 18){
      System.out.println("You are eligible  for voteing");

    }else{
    System.out.println("you are not eligible");
    }
    
  }
  
}
