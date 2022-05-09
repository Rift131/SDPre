import java.util.Scanner;

public class Objective5Lab3 {
  public static void main(String[] args) {
    // set a variable to be assigned the value the user inputs
    double userNum;
    // Set a scanner
    Scanner scanner = new Scanner(System.in);
    // request the user to input a number
    System.out.println("Please enter a number: ");
    userNum = scanner.nextDouble();
    // compare the user inputted number to 0 and give the appropriate response
    if (userNum > 0) {
      System.out.println("The number is positive");
    } else if (userNum == 0) {
      System.out.println("The number is zero");
    } else {
      System.out.println("The number is negative");
    }
  }
}
