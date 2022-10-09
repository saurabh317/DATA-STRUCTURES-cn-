//    Write a program that takes a character as input and prints either 1, 0 or -1 according to the following rules.
//        1, if the character is an uppercase alphabet (A - Z)
//        0, if the character is a lowercase alphabet (a - z)
//        -1, if the character is not an alphabet
import java.util.*;
public class CharCter {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char str=sc.next().charAt(0);
        int z=(int)str;
        if((65<=z)&&(90>=z)){
            System.out.print(1);
        }else if((97<=z)&&(122>=z)){
            System.out.print(0);

        }else{
            System.out.print(-1);

        }

    }
}
