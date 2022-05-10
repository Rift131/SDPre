import java.util.Scanner;

public class Objective9Lab5 {

  public static void main(String[] args) {
    // establish a scanner and variables for 2 ints, a boolean, an unassigned variable and a double intially set to 0
    Scanner kb = new Scanner(System.in);
    double num1, num2;
    boolean keepGoing = true;
    int choice;
    double answer = 0.0;
    // ask the user to provide numbers for num1 and number2
    System.out.println("Please provide a number with no more than two decimal places: ");
      num1 = kb.nextDouble();
    System.out.println("Please provide a second number with no more than two decimal places: ");
      num2 = kb.nextDouble();
      // while keepGoing is true, provide the user the menu, ask what they would like to do and reassign int choice with the user input
      while (keepGoing) {
        printMenu();
        System.out.println("Which would you like to do? ");
        choice = kb.nextInt();

        // Build a switch for each of the user selections (choice)
        switch(choice) {
            case 1:
            System.out.println(num1 + " + " + num2 + " = " + findSum(num1, num2));
            break;
            case 2:
            System.out.println("The average of " + num1 + " and " + num2 + " is: " + findAverage(num1, num2));
            break;
            case 3:
            System.out.println("The amount in tax to be collected from a purchase of " + num1 + " and " + num2 + " is: $" + calcTax(num1, num2));
            break;
            case 4:
            System.out.println("You've chosen to quit.");
            return;
            default:
            System.out.println("Invalid entry. Please try again");
            break;
        }
      }
      // close the scanner
      kb.close();
  }
  // method for the menu options
  public static void printMenu() {
    System.out.println();
    System.out.println("========= MENU =========");
    System.out.println("|                      |");
    System.out.println("|    1. Add Numbers    |");
    System.out.println("|    2. Find Average   |");
    System.out.println("|    3. Calculate Tax  |");
    System.out.println("|    4. Exit           |");
    System.out.println("|                      |");
    System.out.println("========================");
    System.out.println("                        ");


  }
  // method called findSum
  public static double findSum(double x, double y) {
    double sum = Math.round((x + y) * 100) / 100.00;
    return sum;
  }
  // method called findAverage
  public static double findAverage(double x, double y) {
    double average = (x + y) / 2;
    double averageRounded = Math.round(average * 100) / 100.00;
    return averageRounded;
  }
  // method called calcTax (8.31%) that returns ONLY the tax, not the total
  public static double calcTax(double x, double y) {
    double currentTax = .0831;
    double taxTotal = Math.round(((x + y) * currentTax) * 1000) / 1000.000;
    return taxTotal;
  }

}
