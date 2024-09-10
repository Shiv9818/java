import java.util.*;
class addnumbersandreturnsum{
    int a;
    int b;
    public static int sum(int a,int b){
        int sums = a+b;
        return sums;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sums = sum(a,b);
        System.out.println(sums);
    }
}