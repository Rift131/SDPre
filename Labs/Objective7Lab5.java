import java.util.Scanner;

public class Objective7Lab5 {

  public static void main(String[] args) {
    // set a scanner and an unassigned variable
    Scanner scanner = new Scanner(System.in);
    int selection;
    // build a while loop so long as the boolean is true to give menu options that include an exit (falsey)
    while (true) {
      System.out.println("_____Menu_____");
      System.out.println("1: Say Hello");
      System.out.println("2: List My Favorite Foods");
      System.out.println("3: Exit");
      System.out.println();

      selection = scanner.nextInt();
      // write if statements for what to do when the user enters int
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
    // close the scanner
    scanner.close();
  }
}
