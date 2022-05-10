public class Objective8Lab3 {

  public static void main(String[] args) {
    // iterate beginning with a value of 1
    for (int i = 1; i <= 20; i++) {
      // if the value of i is even, print the number and that it's even & vice versa
      if (i % 2 == 0) {
        System.out.println(i + " is even");
      } else if(i % 2 == 1) {
        System.out.println(i + " is odd");
      } else {
        System.out.println("Number is not within the expected range of 1-20.");
      }
    }
  }
}
