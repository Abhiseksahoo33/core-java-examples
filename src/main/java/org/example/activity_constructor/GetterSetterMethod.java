package org.example.activity_constructor;

public class GetterSetterMethod {
    private String color;


    private String getColor()   // Getter method
    {
        return color;
    }


    private void setColor(String c)// Setter method
    {
        this.color = c;
    }

    public static void main(String[] args) {
        GetterSetterMethod var=new GetterSetterMethod();
        var.setColor("red");
        System.out.println("color : "+ var.getColor());
    }
}