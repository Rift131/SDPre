public class Objective7Lab4 {

  public static void main(String[] args) {
    // set a variable to be a total sum, start at 0
    int totalSum = 0;
    // set a variable to be added to the counter
    int increments = 0;
    // while loop so long as the incremented counter is  less than or equal to 20
    while (increments < 20) {
    // add one to the increment counter
    increments++;
    // add the increment counter to the total sum vairable
    totalSum += increments;
}
    // OUTSIDE if the while loop, print the total sum vairable
    System.out.println(totalSum);
  }
}
