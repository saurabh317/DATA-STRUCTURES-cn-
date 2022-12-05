package OPPS1;
import java.util.*;

//this is the great program that will demonstrate what exactly the abstract clas and method is

public abstract class Area {
    int measure;
    double area;
    public abstract void print(int p);
    public static class circleArea extends Area{
        public circleArea(int measure){
            area = 3.14 * (measure*measure);
            System.out.println(area);
            }

        @Override
        public void print(int measure) {
            System.out.println("area of circle  using printFun= "+area);
        }
    }
    public  static class squareArea extends Area{


        @Override
        public void print(int measure) {
            area = 4*measure;
            System.out.println("area of square is "+ area);
        }
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 1 for finding the area of the circle and 2 for square");
        int n = sc.nextInt();
        switch (n) {
            case 1 -> {
                System.out.println("enter the radius of the circle");
                int measure = sc.nextInt();
                circleArea obj = new circleArea(measure);
                obj.print(measure);
            }
            case 2 -> {
                System.out.println("enter the side of the square");
                int side = sc.nextInt();
                squareArea obj1 = new squareArea();
                obj1.print(side);
            }
        }
    }
}
