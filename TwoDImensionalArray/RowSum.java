package TwoDImensionalArray;

public class RowSum {
    public static void rSum(int[][]arr2D){
        for(int i = 0; i < arr2D.length; i++){
            int sum = 0;
            for (int j = 0; j < arr2D[0].length; j++){
                sum+= arr2D[i][j];
            }
            System.out.println(sum+" ");
        }

    }
    public static void main(String[] args) {
        int [][] arr = {{1,2,3,4},{4,5,6,7},{8,9,10,11}};
        rSum(arr);

    }
}
