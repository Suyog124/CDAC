import java.util.Scanner;

public class CalculateArea {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Welcome to the Area calculator");
    System.out.println("1. For circle");
    System.out.println("2. For Rectangle");
    System.out.println("3. For Square");
    System.out.println("4. For Triangle");
    int choice = in.nextInt();

    switch (choice) {
      case 1:
      System.out.print("Enter radius: ");
      double radius = in.nextDouble();
      double circleArea = Math.PI * radius * radius;
      System.out.println("Area of Circle: " + circleArea);
      break;
      case 2:
      System.out.print("Enter length: ");
                double length = in.nextDouble();
                System.out.print("Enter width: ");
                double width = in.nextDouble();
                double rectangleArea = length * width;
                System.out.println("Area of Rectangle: " + rectangleArea);
                break;
                case 3:
                System.out.print("Enter side length: ");
                double side = in.nextDouble();
                double squareArea = side * side;
                System.out.println("Area of Square: " + squareArea);
                break;
                case 4:
                System.out.print("Enter base: ");
                double base = in.nextDouble();
                System.out.print("Enter height: ");
                double height = in.nextDouble();
                double triangleArea = 0.5 * base * height;
                System.out.println("Area of Triangle: " + triangleArea);
                break;
                
      default:
      System.out.println("Invalid choice!");
        break;
    }
    
  }
  
}
