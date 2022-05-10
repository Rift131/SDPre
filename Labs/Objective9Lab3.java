import java.util.Scanner;

public class Objective9Lab3 {

  public static void main(String[] args) {
    // set the scanner and an unassigned variable
    Scanner scanner = new Scanner(System.in);
    int selection;
      // iterate so long as the condition is truthy
      while (true) {
        printMenu();
        selection = scanner.nextInt();
        // if else statements for users input
        if (selection == 1) {
          System.out.println("Hello World");
        } else if (selection == 2) {
          System.out.println("Apple, Banana, Coconut");
        } else if (selection == 3) {
          break;
        } else {
          System.out.println("Only enter numbers 1 through 3. Please try again!");
        }
      }
    // close the Scanner
    scanner.close();
    }
  // method for the menu presented to the user
  public static void printMenu() {
    System.out.println("_____Menu_____");
    System.out.println("1: Say Hello");
    System.out.println("2: List My Favorite Foods");
    System.out.println("3: Exit");
  }
}
