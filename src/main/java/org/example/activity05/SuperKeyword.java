package org.example.activity05;

public class SuperKeyword {
    public static void main(String[] args) {
   Parent var=new Parent();
   var.m1();
   // var.m2();     can't call m2();  reference variable var is of Parent type
   Child var1=new Child();
   var1.m2();
   var1.m1();
    }
}
class Parent{
    int i=10;
    int j=20;
    void m1()
    {
        System.out.println("method of parent ");
        System.out.println("  parent i,j "+i+" "+j);
    }
}
class Child extends Parent{
    int i=30;
    int k=40;
    void m2()
    {

        System.out.println("inside child ");
        System.out.println(" super keyword  i ,k  "+super.i+" "+k);
        System.out.println(" child i ,j  "+i+" "+k);

    }
}
