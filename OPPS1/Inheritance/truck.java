package OPPS1.Inheritance;

public class truck extends vehicle{
//    public truck(){
//        System.out.println("i am the truck class constructure");
//    }
    public truck(int doors,int door){
        super(door);
        this.doors = doors;
        System.out.println("hello i am the truck class constructure " + doors);
    }

    public static void main(String[] args) {
//        vehicle v = new vehicle();
        truck t = new truck(10,100);
    }
}
