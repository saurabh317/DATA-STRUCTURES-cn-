package Array;

import java.util.Scanner;

public class SecondLargest {
    public static int[] Input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the total no. of  elements of the array");
        int n=sc.nextInt();
        int[] a=new int[n];
        System.out.println("enter the elements of the array");
        for(int i = 0; i < n; i++ ){
            a[i]=sc.nextInt();
        }
        return a;
    }
    public static void Second(int[] a){
        for( int i = 0; i < a.length; i++){
            int j = i+1;
            while(j < a.length){
                if(a[i] > a[j]){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
                j++;
            }
        }
        for( int i = 0; i < a.length; i++){
            System.out.println(a[i]);

        }
        System.out.println( "the second largest element in the array is: "+a[a.length-2]);
    }

    public static void main(String[] args) {
        int[] z= Input();
        Second(z);


    }
}
