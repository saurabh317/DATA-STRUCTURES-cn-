package OPPS1.Inheritance;


public class inheritance {
    public static class vehicle{
        String color;
        int modal_no;
    }
    public static class car extends vehicle{
        int no_of_doors;
    }
    public  static class cycle extends vehicle{
        int no_of_scopes;
    }

    public static void main(String[] args) {
        vehicle v = new vehicle();
        v.color="red";
        System.out.println(v.color);
        car c = new car();
        c.color = "blue";
        c.modal_no = 20003;
        c.no_of_doors=4;
        System.out.println(c.color + " " +c.modal_no+" "+c.no_of_doors);
        cycle cy = new cycle();
        cy.color = "green ";
        cy.modal_no = 244;
        cy.no_of_scopes = 200;
        System.out.println(cy.color + " " +cy.modal_no + " "+cy.no_of_scopes);


    }

}
