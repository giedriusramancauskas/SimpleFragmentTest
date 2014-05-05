package fizzbuzz.start.test;

import java.text.NumberFormat;

public class FizzBuzz {

  static int COUNTER = 0;

  private static String word = "";
 
 //This is a Random comment

  public static void main(String[] args) {
    // System.out.println(word);

    int numberOfOlives = 1_000_000_000;
    NumberFormat formater = NumberFormat.getInstance();
    System.out.println(formater.format(numberOfOlives));

    while (COUNTER < 100) {
      if (COUNTER % 3 == 0) {
        System.out.println(COUNTER + " " + word + "Buzz");
        System.out.println();

      }

      if (COUNTER % 5 == 0) {
        System.out.println(COUNTER + " " + word + "FizzBuzz");

      }
      else {
        System.out.println(COUNTER + " " + word + "Fizz");
      }
      COUNTER++;

    }
  }

}
