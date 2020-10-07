package org.example.activity2;
public class Test {
   int x;
   Test()
   {
       x=10;
       System.out.println(x);
   }
   void m()
   {
       x=12;
   }

    public static void main(String[] args) {
      Test var=null;
      var.x=100;  //java.lang.NullPointerException
var.m();    // java.lang.NullPointerException

    }
}