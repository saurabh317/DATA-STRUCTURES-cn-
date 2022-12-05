package Recursion;

public class lastIndex {
    public static int checkForLastIndex(int[] arr,int StartIndex,int x){
        if(StartIndex == arr.length){
            return -1;
        }
        int store = checkForLastIndex(arr,StartIndex+1,x);
//        System.out.println(store);
        if(store != -1){
            return store;
        }
        else if(arr[StartIndex] == x ){
            return StartIndex;
        }
        else{
            return -1;
        }
    }
    public static void main(String[] args) {
        int[] arr ={3,2,3,4,5,5};
        System.out.println(checkForLastIndex(arr,0,3));

    }
}
