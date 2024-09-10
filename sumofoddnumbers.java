import java.util.*;
class sumofoddnumbers{
    public static int sumOfOdd(int a){
        int sum=0;
        for(int i=1;i<=2*a;i+=2){
            sum+=i;
        }
        System.out.println(sum);
        return sum;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sumOfOdd(n);
    }
}