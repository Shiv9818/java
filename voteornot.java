import java.util.*;
class voteornot{
    public static void vote(int age){
        if(age>=18){
            System.out.println("you can vote");
            }
            else{
                System.out.println("you can't vote");
                }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age : ");
        int age = sc.nextInt();
        vote(age);
    }
}