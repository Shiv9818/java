import java.util.*;
class powerfunction{
    public static void power(int x,int n){
        int result=1;
        for(int i=1;i<=n;i++){
            result=result*x;
            }
            System.out.println(result);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        power(x,n);
    }
}