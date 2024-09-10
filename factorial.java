
import java.util.Scanner;

class factorial{
    public static void fact(int n) {
        int f = 1;
        for(int i = n; i >= 1; i--) {
            f = f * i;
        }
        System.out.println("Factorial of " + n + " is " + f);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        fact(n);
    }
}