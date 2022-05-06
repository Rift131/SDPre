import java.util.Scanner;

public class Objective4Lab1 {
  public static void main(String[] args) {
    // build a scanner
    Scanner keyboard = new Scanner(System.in);

    String fName = "";
    String lName = "";
    String favoriteAnimal = "";
    String favoriteFood = "";
    String favoriteSong = "";
    // Request input from the user and assign variables their values accordingly
    System.out.print("What is your first name? ");
    fName = keyboard.nextLine();
    System.out.print("What is your last name? ");
    lName = keyboard.nextLine();
    System.out.print("What is your favorite animal? ");
    favoriteAnimal = keyboard.nextLine();
    System.out.print("What is your favorite food? ");
    favoriteFood = keyboard.nextLine();
    System.out.print("What is your favorite song? ");
    favoriteSong = keyboard.nextLine();

    // print the acquired data in the required format
    System.out.println("My name is " + fName + " " + lName + ".");
    System.out.println("My favorite animal is the " +favoriteAnimal + ".");
    System.out.println("My favorite food is " + favoriteFood + ".");
    System.out.println("My favorite sone is " + favoriteSong + ".");

    // close the Scanner
    keyboard.close();
  }
}
