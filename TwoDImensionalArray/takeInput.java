package TwoDImensionalArray;
import java.util.*;
public class takeInput {
    static Scanner sc=new Scanner(System.in);
    public  static int[][] TakeInput(){
        System.out.println("enter the no. of rows");
        int m = sc.nextInt();
        System.out.println("enter the no. of columns");
        int n = sc.nextInt();
        int[][]arr=new int[m][n];
        System.out.println("enter the elements of the array");
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("our array is: ");
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                System.out.println(arr[i][j]);
            }
        }
        return arr;

    }
//    public static void PrintResult(int[][] arr){
//
//
//    }
    public static void main(String[] args) {
        int[][] temp = TakeInput();
        System.out.println(temp);
//        PrintResult(temp);

    }
}
