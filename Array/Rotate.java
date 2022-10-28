package Array;

import java.util.Scanner;

public class Rotate {

    public static int[] TakeInput() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the elements of the array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        return arr;
    }

    public static void rotate(int[] arr) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the value of d");
        int d = s.nextInt();
//        for copying the elements  to the temporary array after the d
        int [] temp = new int[arr.length];
        int j = 0;
        for( int i = d; i < arr.length; i++){
            temp[j] = arr[i];
            j++;

        }
//        for copying the elements  to the temporary array before the d
        for (int i = 0; i < d; i++){
            temp[j] = arr[i];
            j++;

        }
//        for copying the elements  to the temporary array again to the original array
        for ( int i = 0; i < arr.length; i++){
            arr[i] = temp[i];
        }
        for( int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }

    }
    
    public static void main(String[] args) {
//
        int[] z = TakeInput();
        rotate(z);
    }
}