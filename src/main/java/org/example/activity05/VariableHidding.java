package org.example.activity05;

public class VariableHidding {
    public static void main(String[] args) {
        Variable var=new Variable();
        var.method();
    }

}
class Variable{
     int i=10;
     void method()
    {
        int i=20;  // variable hidding , hides the instance variable
        System.out.println("instance variable: "+this.i); //10
        System.out.println("local variable: "+i);  //20

    }
}
