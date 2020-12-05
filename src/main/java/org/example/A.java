package org.example;

class A     //parent class / superclass inherited by B
{
   public int x=10;
   public static int y=20;
   public void m1()
   {
      System.out.println("parent class method ");
   }
   public static void m2()
   {
      System.out.println("parent class static method");
   }

}
class B extends A  // child class / subclass
{
   public int a = 15;
   public static int b = 25;

   public void m3() {
      System.out.println("chaild class method ");
   }

   public static void m4() {
      System.out.println("child class static method");
   }


   public static void main(String[] args) {
      A var = new B();
      B var1 = new B();
      var.m1();
      var.m2();
      var1.m3();
      var1.m4();// reference type of var is A
     var1.m1();
     var1.m2();
      System.out.println("parent   y : "+A.y);
     // System.out.println("parent  x  : "+A.x); // x is not static it can't access by a static method main
      System.out.println("parent   x , y: "+var.x+" "+var.y);
      System.out.println("child a ,b : "+var1.a+" "+var1.b);

   }
}
/*output
parent class method
parent class static method
chaild class method
child class static method
parent class method
parent class static method
parent   y : 20
parent   x , y: 10 20
child a ,b : 15 25
*/