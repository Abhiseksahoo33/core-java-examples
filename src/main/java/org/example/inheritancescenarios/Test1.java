package org.example.inheritancescenarios;

public class Test1 {
    public static void main(String[] args) {
    child c=new child();
c.m2();
c.m1(); // can invoke parent method
    }
  public  static class parent
    {
        public int i =10;//will be access with in the same class as well as any class
        private int j =20; //will be access with in the same class
        protected int k = 30; //will be access with in the same class as well as any class, subclass  in the same package
        int z=40; // default (by-default)  can be access by any class in same package but not subclass not globally
       void  m1()
        {
            System.out.println("----------------inside parent --------------");
            System.out.println("inside parent class m1()");
           //m2();//
           // System.out.println("child a: "+a); can't access child field
        }
    }
    public static class child extends parent
    {
        public int a=50;
        private  int b =60;
        protected  int c =70;
        void m2()
        {
            System.out.println("-----------inside child ------------------");
            System.out.println("inside the child class m2():");
           m1();
            System.out.println(" parent i : "+i);
            //System.out.println(" parent j : "+j); // j is private in parent class
            System.out.println(" parent k : "+k); // k can be access by any class in same package
            System.out.println(" parent z : "+z); // k can be access by any class in same package but not subclass not globally
        }
    }
}
/*output
* -----------inside child ------------------
inside the child class m2():
----------------inside parent --------------
inside parent class m1()
 parent i : 10
 parent k : 30
 parent z : 40
----------------inside parent --------------
inside parent class m1()
* */