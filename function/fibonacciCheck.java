package function;
import java.util.*;

public class fibonacciCheck {
    public static boolean Fun(int num) { //here we have used boolean becoz this function is going to return thr bollena value
        int a = 0;
        int b = 1;
        int c;
        while (a < num) {
            c = a + b;
            a = b;
            b = c;
        }
        if (a == num) {
            return true;

        }


        return false;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean Result=Fun(num);
        System.out.println(Result);

    }
}
