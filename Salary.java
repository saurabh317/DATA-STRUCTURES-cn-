import java.util.*;
public class Salary {

    public static void main(String[] args) {
         System.out.print("enter your basic salary and grade");

        Scanner sc=new Scanner(System.in);
        int Basic=sc.nextInt();
        char grade=sc.next().charAt(0);
        float hra=(float) 20/100*Basic;
        float da=(float) 50/100*Basic;
        float pf=(float) 11/100*Basic;
        float allow;

        if(grade=='A'){
            allow=1700;
        }
        else if(grade=='B'){
            allow=1500;
        }
        else {
            allow=1300;
        }
        double totalSalary=((Basic+hra+da+allow)-pf);
        System.out.print(Math.round(totalSalary));


    }
}
