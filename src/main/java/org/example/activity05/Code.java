package org.example.activity05;
class Code
{
    public static void main(String[] args) {
        Upperclass parvar=new Upperclass();
        parvar.m1(); //parent class STATIC  method
        parvar.m2(); //parent class non stATIC METHOD
        Upperclass chivar = new Subclass();
        chivar.m1(); //parent class STATIC  method
        chivar.m2();//child class non static method

    }
}
class Upperclass{
    static void  m1()
    {
        System.out.println("parent class STATIC  method ");
    }
    void m2()
    {
        System.out.println("parent class non stATIC METHOD ");
    }


}
class Subclass extends  Upperclass
{
    static void m1()  // method hidding
    {
        System.out.println("child class  static method ");
    }
    void m2()
    {
        System.out.println("child class non static method");
    }
}