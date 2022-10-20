package Array;

import java.util.Scanner;

public class BubbleSort {
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
    public static void bubbleSort(int[] arr){
        for(int p = 0; p < arr.length; p++ ) {

            for (int i = 0; i < (arr.length - 1); i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
        for( int j = 0; j < arr.length; j++){
            System.out.println(arr[j]);
        }
    }

    public static void main(String[] args){
        int[] z= TakeInput();
        bubbleSort(z);


    }
}
