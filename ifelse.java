
import java.util.Scanner;

class ifelse{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks : ");
        int marks = sc.nextInt();
        if(marks>=33){
            System.out.println("Pass bhot ache ");
        }
        else{
            System.out.println("Fail hai tu padhle beta");
        }
    }
}