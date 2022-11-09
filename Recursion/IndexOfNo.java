package Recursion;

public class IndexOfNo {
    public static int check(int[] arr,int StartIndex,int x){
        if(arr.length == 0){
            return -1;
        }
        if(x == arr[StartIndex]){
            return StartIndex;
        }
        return check(arr,StartIndex+1,x);


    }
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10};
        System.out.println(check(arr,0,10));

    }
}
