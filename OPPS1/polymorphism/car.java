package OPPS1.polymorphism;

public class car extends vehicle {
    public void print(){
        System.out.println("hello i am a car ");
    }
    public static void main(String[] args) {
        vehicle v =  new car();
        v.no = 1080;
        v.color="black";
        v.print();
        System.out.println("number of car is "+v.no+ " and it is of "+v.color+" color");



    }
}
