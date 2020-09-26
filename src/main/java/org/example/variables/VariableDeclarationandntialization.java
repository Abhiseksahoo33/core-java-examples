package org.example.variables;

public class VariableDeclarationandntialization {
    static int x=07;
    String y=" abhisek sahoo  ";
    static {
        x=20;
        System.out.println("inside static block  ="+x);   // we can change it as it is a static block
    }
    static  void m1(){
        x=30;
        System.out.println("inside static method  ="+x);
    }
    {
        y="hello";
        System.out.println("value of y inside non static block"+y);
    }
    void m2()
    {
        y="bye";
        System.out.println("value of y inside non static method "+y);
    }
    public static void main(String[] args) {
        VariableDeclarationandntialization o3=new VariableDeclarationandntialization();
m1();
o3.m2();
    }
}