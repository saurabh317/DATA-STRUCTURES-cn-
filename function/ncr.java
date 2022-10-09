package function;

import java.util.Scanner;

public class ncr {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
//            for calcualting n!
        int nFact=1;

        for (int i = (n); i > 0; i--) {

            nFact=nFact*i;

        }
        System.out.println(nFact);
//        for calculating r!
        int rFact=1;
        for(int i = r; i > 0; i--){
            rFact=rFact*i;



        }
        System.out.println(rFact);
//        for calculating (n-r)!
        int nrFact=1;
        for(int i=(n-r);i>0;i--){
            nrFact=nrFact*i;


        }
        System.out.println(nrFact);
        System.out.println("the value = "+((nFact)/(rFact)*(nrFact)) );
    }

}
