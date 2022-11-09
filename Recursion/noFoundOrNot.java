package Recursion;

public class noFoundOrNot {
    public static boolean FoundOrNot(int[] arr,int startIndex,int lastIndex,int x){
        if(lastIndex < startIndex){
            return false;
        }
        if(x == arr[startIndex]){
            return true;
        }if(x == arr[lastIndex]){
            return true;
        }
        return FoundOrNot(arr,startIndex+1,lastIndex-1,x);
    }
    public static void main(String[] args) {
        int[] arr = {2,4,5,6,7};
        System.out.println(FoundOrNot(arr,0,4,8));

    }
}
