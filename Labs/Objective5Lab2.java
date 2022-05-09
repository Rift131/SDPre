public class Objective5Lab2 {

  public static void main(String[] args) {
    //set string vairables to compare
    String string1 = "Bannana";
    String string2 = "Bacon";
    String string3 = "Bannana";
    // compare strings to one another and return whether they are equal
    if (string1.equals(string2)) {
      System.out.println(string1 + " is equivalent to " + string2);
    } else if (!string1.equals(string2)) {
      System.out.println(string1 + " is not equivalent to " + string2);
    }
    if (string1.equals(string3)) {
      System.out.println(string1 + " is equivalent to " + string3);
    } else if (!string1.equals(string3)) {
      System.out.println(string1 + " is not equivalent to " + string3);
    }
  }
}
