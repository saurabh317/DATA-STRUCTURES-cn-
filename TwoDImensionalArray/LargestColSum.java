package TwoDImensionalArray;

public class LargestColSum {
    public static int[] largesColSum(int[][] arr2D) {
        int[] arr1 = new int[arr2D[0].length];

        for (int i = 0; i < arr2D.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr2D[0].length; j++) {
                sum += arr2D[j][i];
            }
            System.out.println("sum of " + (i + 1) + " column : " + sum);
            for (int p = 0; p <= i; p++) {
                arr1[p] = sum;
            }
        }
        return arr1;


    }
    public static int Max(int[] arr1){
        int max =arr1[0];
        for( int i = 0; i < arr1.length; i++){
            if(arr1[0]<arr1[i]){
                arr1[i] = max;
            }
        }
        return max;

}

    public static void main(String[] args) {
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
         int[] z = largesColSum(arr);
         int t = Max(z);
        System.out.println("largest sum :" +t);


    }
}
