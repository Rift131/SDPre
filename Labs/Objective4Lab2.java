// import the scanner utility
import java.util.Scanner;

public class Objective4Lab2 {
  public static void main(String[] args) {
    // assign a variable to new instances of the scanner
    Scanner keyboard = new Scanner(System.in);
    // create variables with a value of 0 (later updated by the user)
    int num1 = 0, num2 = 0, num3 = 0;
    double dub1 = 0.0, dub2 = 0.0, dub3 = 0.0;
    // prompt the user to submit desired numbers for each variable above
    System.out.print("Please enter the first whole number you would like to add. ");
    num1 = keyboard.nextInt();
    System.out.print("Please enter the second whole number you would like to add. ");
    num2 = keyboard.nextInt();
    System.out.print("Please enter the third whole number you would like to add. ");
    num3 = keyboard.nextInt();
    System.out.print("Please enter the first decmial number you would like to add. ");
    dub1 = keyboard.nextDouble();
    System.out.print("Please enter the second decimal number you would like to add. ");
    dub2 = keyboard.nextDouble();
    System.out.print("Please enter the third decimal number you would like to add. ");
    dub3 = keyboard.nextDouble();
    // assign variables to represent sums based on the user inputs above
    int intSum = num1 + num2 + num3;
    double dubSum = (dub1 + dub2 + dub3);
    // assign a vairable to be a formatter for the Double variables value to the tenth place
    double dubSumTenth = Math.round(dubSum * 10) /10.0;
    // print each of the integers and their sum
    System.out.println("The sum of " + num1 + " + " + num2 + " + " + num3 + " = " + intSum);
    // print each of the double variables and their sum
    System.out.println("The sum of " + dub1 + " + " + dub2 + " + " + dub3 + " = " + dubSumTenth);
    // close the Scanner
    keyboard.close();
    }
}
