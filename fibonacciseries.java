import java.util.*;
public class fibonacciseries {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] fib = new int[n];

    fib[0] = 0;
    fib[1] = 1;

    for (int i = 2; i < n; i++) {
      fib[i] = fib[i-1] + fib[i-2];
    }

    System.out.println("Fibonacci series:");
    for (int i = 0; i < n; i++) {
      System.out.print(fib[i] + " ");
    }
  }
}