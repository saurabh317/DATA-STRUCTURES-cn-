package Array;

import java.util.Scanner;

public class MergeSort {
    public static int[] TakeInput() {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the elements of  the array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

//    public static int[] PrintArray(int[] arr) {
//        System.out.println("your sorted array is: ");
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
//        return arr;
//    }

    public static int[] Mergesort(int[] arr, int[] b) {
        int i = 0;
        int j = 0;
        int k = 0;
        int m = b.length;
        int n = arr.length;
        int[] arr3 = new int[m + n];
        while (i < arr.length && j < b.length) {
            if (arr[i] <= b[j]) {
                arr3[k] = arr[i];
                i++;
                k++;
            } else {
                arr3[k] = arr[j];
                j++;
                k++;
            }

        }
        if (i < arr.length) {
            arr3[k] = arr[i];
            i++;
            k++;
        }
        if (j < b.length) {
            arr3[k] = b[j];
            j++;
            k++;
        }
//
        for (int p = 0; p < (m + n); p++) {
            System.out.println(arr3[p]);
        }
        return arr3;


    }

    public static void main(String[] args) {
//        System.out.println("enter the elements of 1st array");
        int[] z = TakeInput();
//        System.out.println("enter the elements of 2nd array");
        int[] x = TakeInput();
        int[] h = Mergesort(z, x);
        System.out.println(h);

    }
}
