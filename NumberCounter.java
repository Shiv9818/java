import java.util.Scanner;

public class NumberCounter {
  public static void main(String[] args) {
    int positiveCount = 0;
    int negativeCount = 0;
    int zeroCount = 0;

    Scanner sc = new Scanner(System.in);

    while (true) {
      System.out.print("Enter a number (or '1000' to quit): ");
      double num = sc.nextDouble();

      if (num==1000) {
        break;
      }
         if (num > 0) {
          positiveCount++;
        } else if (num < 0) {
          negativeCount++;
        } else {
          zeroCount++;
        }
    }

    System.out.println("Results:");
    System.out.println("Positive numbers: " + positiveCount);
    System.out.println("Negative numbers: " + negativeCount);
    System.out.println("Zeroes: " + zeroCount);
  }
}