import java.util.Scanner;
import java.time.LocalDate;
import java.time.Month;


public class Objective4Lab3 {
  public static void main(String[] args) {
    // set variables for birth year calculation
    int birthYear = 0;
    int age;
    int birthMonth = 0;
    // set up variables for determining the current year
    LocalDate currentDate = LocalDate.now();
    int currentYear = currentDate.getYear();
    Month currentMonth = currentDate.getMonth();
    int monthNum = currentMonth.getValue();
    // build the scanner with an inquiry for age of the user
    Scanner input = new Scanner(System.in);
    System.out.print("How old are you? ");
    age = input.nextInt();
    System.out.print("During which month were you born? Please specify using numbers 1-12. ");
    birthMonth = input.nextInt();
    int monthsDelta = monthNum - birthMonth;
    // birth year computations
    birthYear = currentYear - age;
      if (monthsDelta < 0) {
        birthYear--;
      }
    // return message with the users birth birthYear
    System.out.print("You were born in " + birthYear);
    // close the scanner
    input.close();
  }
}
