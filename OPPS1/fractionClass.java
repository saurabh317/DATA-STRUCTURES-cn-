//write a program which accept the fraction and then add some functionality to it
//1. simplify the fraction
//2. increment the fraction by 1
//3. take the another input fraction then add both the fractional values


package OPPS1;

public class fractionClass {
   int numerator;
   int denominator;
    public fractionClass(int numerator,int denominator){
        this.numerator = numerator;
        this.denominator = denominator;
        simplifyFun();
        incrementFun();
    }
    public void printFun(){

        System.out.println(numerator+"/"+denominator);
    }
    public void simplifyFun(){
        int gcd = 1;
        int minValue = Math.min(numerator,denominator);
        for( int i = 1; i <=minValue; i++ ){
            if(numerator % i ==0 && denominator % i ==0) {
                gcd = i;
            }
        }
        numerator= numerator/gcd;
        denominator= denominator/gcd;
//        System.out.println(numerator+" /"+denominator);

    }
    public void returnSum(fractionClass obj2){
        this.numerator = ((this.numerator * obj2.denominator) + (this.denominator * obj2.numerator));
        this.denominator = (this.denominator * obj2.denominator);
        simplifyFun();
        printFun();

    }
    public void incrementFun(){
        numerator = numerator + denominator;
    }
    public static void main(String[] args) {
        fractionClass obj1 = new fractionClass(2,24);
        fractionClass obj2 = new fractionClass(4,24);
        obj1.printFun();
        obj2.printFun();
        obj1.returnSum(obj2);

    }
}
