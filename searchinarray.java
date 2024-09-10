import java.util.*;
class searchinarray{
    public static void main(String[] args) {
        int row;
        int col;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        row = sc.nextInt();
        System.out.println("Enter the number of columns");
        col = sc.nextInt();
        int[][] arr = new int[row][col];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j] = sc.nextInt();
                }
                }
                System.out.println("Enter the element to be searched");
                int x= sc.nextInt();

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(arr[i][j]==x){
                    System.out.println("The element is present at "+i+" "+j);
                }
            }
        }
    }
}