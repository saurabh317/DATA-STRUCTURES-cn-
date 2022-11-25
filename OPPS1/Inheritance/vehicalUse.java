package OPPS1.Inheritance;

public class vehicalUse {
    private String color;
    int modal_no;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;

    }
    public void print(){
        System.out.println(getColor());
    }
}
//here we will not be able to use the color because  it is declared as private so we will mAKE gettera and setters for access that
