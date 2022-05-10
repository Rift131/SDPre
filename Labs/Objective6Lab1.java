public class Objective6Lab1 {

  public static void main(String[] args) {
    // set a variable to mimic user input of a number to be translated into it's respective month
    int month = 6;
    // establish a switch with cases representing what to do with numbers 1-12 and what to do when something else is entered
    switch (month) {
      case 1:
      System.out.println("January");
      break;
      case 2:
      System.out.println("February");
      break;
      case 3:
      System.out.println("March");
      break;
      case 4:
      System.out.println("April");
      break;
      case 5:
      System.out.println("May");
      break;
      case 6:
      System.out.println("June");
      break;
      case 7:
      System.out.println("July");
      break;
      case 8:
      System.out.println("August");
      break;
      case 9:
      System.out.println("September");
      break;
      case 10:
      System.out.println("October");
      break;
      case 11:
      System.out.println("November");
      break;
      case 12:
      System.out.println("December");
      break;
      // default for when user makes an invalid entry
      default:
      System.out.println("That is not a valid month");
      break;
    }
  }
}
