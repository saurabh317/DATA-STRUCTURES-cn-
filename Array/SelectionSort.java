package Array;

import java.util.*;

public class SelectionSort {
    public static int[] TakeInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length of the array ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the elements of the  array ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        return arr;

    }

    public static void selectionSort(int[] arr) {
        int i;
        int min_num;
        for (i = 0; i < ((arr.length) - 1); i++) {
            min_num = i;
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[min_num] > arr[j]) {
                    int temp = arr[min_num];
                    arr[min_num] = arr[j];
                    arr[j] = temp;
                    j = min_num;
                }

            }


        }

        for (int p = 0; p < arr.length; p++) {
            System.out.println(arr[p]);
        }

    }

    public static void main(String[] args) {
        int[] z = TakeInput();
        selectionSort(z);
    }
}
