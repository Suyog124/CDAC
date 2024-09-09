import java.util.Scanner;

public class CorrespomdingSeason {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter month in number :- ");
    int choice = in.nextInt();


    switch (choice) {
      case 1,2,3:
      System.out.println("It is an winter");
      System.out.println("Thank you!");
        break;
        case 4,5,6:
        System.out.println("it is an Summer ");
        System.out.println("Thank you!");
        break;
        case 7,8,9:
        System.out.println("It is an Spring ");
        System.out.println("Thank you!");
        break;
        case 10 ,11,12:
        System.out.println("It is an Autumn");
        System.out.println("Thank you!");
        break;
      default:
      System.out.println("Enter the valid number between 1 TO  12");
        break;
    }
    

  }
  
}
