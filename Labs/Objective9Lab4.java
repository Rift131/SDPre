import java.util.Scanner;

public class Objective9Lab4 {

  public static void main(String[] args) {
    // set a scanner with two unassigned variables
    Scanner kb = new Scanner(System.in);
    double num1, num2;
    // have the user submit two numbers
    System.out.print("Please give me a number: ");
      num1 = kb.nextDouble();
    System.out.print("Please give me another number: ");
      num2 = kb.nextDouble();
    // invoke a method by assigning it to a variable with arguments of num1 and num2
    double average = findAverage(num1, num2);
    System.out.println("The average of " + num1 + " and " + num2 + " is: " + average);
    // close out the Scanner
    kb.close();
  }
  // create a method for taking in two doubles and returning their findAverage
  public static Double findAverage(double number1, double number2) {
    double result = (number1 + number2) / 2;
    double resultRounded = Math.round(result * 10) / 10.0;
    return resultRounded;
  }
}
