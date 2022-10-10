package com.ARRAY;

import java.util.*;

public class PrintArr {
    public static int[] TakeInput() {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("enter the element of the array at " + i + " position");
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    public static void PrintArray(int[] arr){
        System.out.println("your array is: ");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);

        }
    }
    public static void main(String[] args){
        int[] arr=TakeInput();
        PrintArray(arr);
    }
}
