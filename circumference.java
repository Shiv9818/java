import java.util.*;
class circumference{
    public static void circum(double r){
        double c=2*Math.PI*r;
        System.out.println("The circumference of the circle is "+c);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        double radius = sc.nextDouble();
        circum(radius);
    }
}