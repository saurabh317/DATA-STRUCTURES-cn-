package Recursion1;

public class mergeSort {
    public static void Mergesort(int[] original){
        if( original.length <= 1){
            return;
        }
        int mid = original.length/2;
        int[] arr = new int[mid];
        int[] brr = new int[original.length - mid];
//        for copying the first half of the array in the array arr
        for( int i = 0; i < mid; i++){
            arr[i] = original[i];
        }
//        for copying the 2nd half of the array in the array brr
        int k = 0;
        for( int i = mid; i < original.length; i++){
            brr[k] = original[i];
            k++;
        }
        Mergesort(arr);
        Mergesort(brr);
        merge(arr,brr,original);


    }
    public static void merge(int[] arr,int[] brr,int[] original){
        int i = 0, j = 0, k = 0;
        while (i < arr.length && j < brr.length){
            if(arr[i] <= brr[j]){
                original[k] = arr[i];
                k++;
                i++;
            }
            else{
                original[k] = brr[j];
                j++;
                k++;
            }

        }
        while(i < arr.length){
            original[k] = arr[i];
            k++;
            i++;
        }
        while(j < brr.length){
            original[k] = brr[j];
            j++;
            k++;
        }
    }
    public static void main(String[] args) {
        int[] array = {12,11,10,67,43,34};
        Mergesort(array);
        for( int p = 0; p < array.length; p++){
            System.out.println(array[p]);

        }

    }
}
