import java.util.*;
class greaternumber{
    public static void great(int a,int b){
        if(a>b){
        System.out.println("a is greater than b");
        }else if(b>a){
        System.out.println("b is greater than a");
        }else{
            System.out.println("a and b are equal");
        }
        }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();
        System.out.println("Enter the second number: ");
        int b = sc.nextInt();
        great(a,b);
    }
}