package Recursion;

import java.util.Scanner;

public class sumOfArray {
    public static int returnSum(int[] arr, int n) {

        if (n <= 0)
        {
            return 0;
        }
        return arr[n-1]+ returnSum(arr,n-1);
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
        System.out.println(returnSum(arr,n));


    }
}
