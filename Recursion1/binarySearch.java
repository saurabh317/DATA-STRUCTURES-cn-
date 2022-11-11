package Recursion1;

public class binarySearch {
    public static int search(int[] arr, int low,int high,int key){
        if(low >high){
            return -1;
        }
        int mid = (low+high)/2;
        if(key == arr[mid]){
            return mid;
        }
        else if(key >arr[mid]){
            return search(arr,mid+1, arr.length, key);
        }else {
            return search(arr, 0, mid-1, key);
        }
    }
    public static void main(String[] args) {
        int[] arr = {12,34,56,78,90};
//        int n = arr.length;
        System.out.println(search(arr,0, arr.length, 78));

    }
}
