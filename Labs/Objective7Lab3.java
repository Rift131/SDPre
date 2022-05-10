public class Objective7Lab3 {

  public static void main(String[] args) {
    // set counter variable, starting at 1
    int counter = 1;
    // so long as the counter is less than or equal to 20, check for odd/even & print the number and whether it is odd or equivalen
    while (counter <= 20) {
      if (counter % 2 == 0) {
        System.out.println(counter + " is even");
      } else if (counter % 2 == 1) {
        System.out.println(counter + " is odd");
      } else {
        System.out.println("Number is out of the required range.");
      }
      // increment the counter
      counter++;
    }
  }
}
