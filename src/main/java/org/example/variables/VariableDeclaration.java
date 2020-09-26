package org.example.variables;

public class VariableDeclaration {
    static int x=10;
    String y=" abhisek ";
    static{
        System.out.println("value of static variable  x in static block is "+x);
        //System.out.println("value of y"+y);// y is non static variable
    }
    {
        System.out.println("value of static variable in non static block  x is "+x);
        System.out.println("value of non static variable  y is "+y); // object is needed to execute
    }
    static void m1()
    {
        System.out.println("--------------------------------------------------");
        System.out.println("value of static variable in static method m1()  x is "+x);
       // System.out.println("value of non static variable  y in static method m1() is "+y);
// can't access a nonstatic variable
    }
     void m2()
    {
        System.out.println("------------------------------------------------------");
        System.out.println("value of static variable in non static method m1()  x is "+x);
         System.out.println("value of non static variable  y in non static method m1() is "+y);

    }
    public static void main(String[] args) {
  VariableDeclaration o2=new VariableDeclaration();
  m1();
  o2.m2();
        System.out.println("-----------------main--------------------");
        System.out.println("value of x inside main() "+x);
        System.out.println("value of y inside main() "+o2.y);

    }
}
/*
*
* output
* value of static variable  x in static block is 10
value of static variable in non static block  x is 10
value of non static variable  y is  abhisek
--------------------------------------------------
value of static variable in static method m1()  x is 10
------------------------------------------------------
value of static variable in non static method m1()  x is 10
value of non static variable  y in non static method m1() is  abhisek
-----------------main--------------------
value of x inside main() 10
value of y inside main()  abhisek
* */