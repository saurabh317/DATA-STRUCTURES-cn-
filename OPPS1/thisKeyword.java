package OPPS1;

public class thisKeyword {
    private String name;
    private int Roll_no;

    public int getData(){
        return Roll_no;
    }
    public void setData(int Roll_no){
        if(Roll_no < 50){
            return;
        }
        this.Roll_no = Roll_no;
    }



    public static void main(String[] args) {
        getterSetter g1 = new getterSetter();
        getterSetter g2 = new getterSetter();
        g1.setData(100);
        System.out.println(g1.getData());


    }

}
