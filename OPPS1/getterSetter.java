package OPPS1;

 public class getterSetter {
     private String name;
     private int Roll_no;

   public int getData(){

       return Roll_no;
   }
   public void setData(int num){
       if(num < 50){
           return;
       }
       Roll_no = num;
   }



     public static void main(String[] args) {
         getterSetter g1 = new getterSetter();
         getterSetter g2 = new getterSetter();
         g1.setData(10);
         System.out.println(g1.getData());


     }
 }
