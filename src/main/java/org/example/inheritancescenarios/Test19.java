package org.example.inheritancescenarios;


// polymerphsm


// overloading : possible between 2 classes (inheritance) or in the same class
// name of method must be same. signature must be different. compile time polymorphism. based on reference type
// overrriding : non-static methods only. runtime polymorphism based on objecttype
public class Test19 {

    public static void main(String[] args) {

        // A a = new B(); can't access methof of class B
        B a = new B();
        a.m1(10);
        a.m1();
        a.m1(10, 20); // method of B
    }

    private static class  A
    {
        public void m1(int x){

        }

        public static void m1(){

        }
    }

    private static class B extends  A{

        public void m1(int x, int y){

        }
    }
}