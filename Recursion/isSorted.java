package Recursion;
import java.util.*;

public class isSorted {
    public static boolean arraySorted(int[] arr){
//        base condition 1
        if(arr.length==1){
            return true;
        }
//        base condition 2
        if(arr[0]>arr[1]){
            return false;

        }
        int[] smallArr = new int[arr.length-1];
//        now we will copy the elements of the actual array to the smaller array
        for( int i = 0; i < arr.length-1; i++){
            smallArr[i] = arr[i+1];
        }
        return arraySorted(smallArr);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the array which we have to check ");
        for( int i = 0; i < arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(arraySorted(arr));

    }
}
