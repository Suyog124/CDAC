public class LeapYear {
    public static void main(String[] args) {

       int year = 2024;
       int leapYearType;

   if (year % 400 == 0) {
       leapYearType = 0; 
} else if (year % 100 == 0) {
  leapYearType = 1; 
} else if (year % 4 == 0) {
  leapYearType = 2;
} else {
  leapYearType = 3; 

switch (leapYearType) {
  case 0:
      System.out.println("It is a leap year");
      break;
  case 1:
      System.out.println("It is not a leap year");
      break;
  case 2:
      System.out.println("It is a leap year");
      break;
  case 3:
      System.out.println("It is not a leap year");
      break;
  default:
      System.out.println("Invalid year");
      break;
}
  }
}
}
