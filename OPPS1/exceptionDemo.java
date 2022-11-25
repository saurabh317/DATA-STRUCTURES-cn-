package OPPS1;

public class exceptionDemo {
//    public static  int  divide(int a,int b) throws ArithmeticException{
//        if(b == 0){
//            throw new ArithmeticException();
//        }
//        int c = a/b;
//        return c;
//
//    }
    public static  int  divide(int a,int b){

        int c = a/b;
        return c;

    }

    public static void main(String[] args) {
//        int result = divide(10,0);
//        System.out.println(result);
        try {
             int result = divide(10,0);
            System.out.println(result);
        }catch (ArithmeticException e){
            System.out.println("u cannot divide b by zero");

        }

    }
}
