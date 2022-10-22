package Array;
import java .util.*;

public class insertionSort {
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
    public static void InsertionSort(int[] arr){
        for(int i = 1; i < arr.length; i++){
            int j = i-1;
            int temp = arr[i];
            while(j>=0 && arr[j]>temp){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;
        }
    }
    public static int[] PrintArray(int[] arr){
        System.out.println("your sorted array is: ");
        for( int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
        return arr;
    }
    public static void main(String[] args){
        int[] z=TakeInput();
        InsertionSort(z);
        int[] p=PrintArray(z);
        System.out.println(p);

    }
}
