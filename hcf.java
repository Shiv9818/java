import java.util.*;
class hcf{
    public static void gcd(int a,int b){
     if(a>b){
        for(int i=b;i>=1;i--){
            if(a%i==0 && b%i==0){
                System.out.println("HCF of "+a+" and "+b+" is "+i);
                break;
                }
        }
     }
     else{
        for(int i=a;i>=1;i--){
            if(a%i==0 && b%i==0){
                System.out.println("HCF of "+a+" and "+b+" is "+i);
                break;
                }
                }
                }
    } 
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        gcd(a,b);
    }
}