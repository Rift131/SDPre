import java.util.Scanner;

public class Objective5Lab4 {

  public static void main(String[] args) {

    // scanner with user defined variable
    Scanner numInput = new Scanner(System.in);
    double userNum;
    // Request the user to input a number
    System.out.println("Please enter a number: ");
    userNum = numInput.nextDouble();
    // based on the number inputted, tell the use if the number is even or odd
    if (userNum % 2 == 0 || userNum == 0) {
      System.out.println("The number is even");
    } else if (userNum % 2 == 1) {
      System.out.println("The number is odd");
    }
  }
}
