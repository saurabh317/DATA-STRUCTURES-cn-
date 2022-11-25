package OPPS1.Inheritance;

public class overriding {
    public  static class vehicle{
        public void print(){
            System.out.println("vehicle");
        }
    }
    public  static class car extends vehicle{
        public void print()
        {
            super.print();//here if we want to call that print function of the super class we can do that by using super keyword//

            System.out.println("car");
        }
    }
    public  static class honda extends car{
        public void print(){
            System.out.println("honda");
        }

    }

    public static void main(String[] args) {
        vehicle v = new vehicle();
        car c = new car();
        honda h = new honda();
        c.print();
        h.print();
        v.print();
    }
}
