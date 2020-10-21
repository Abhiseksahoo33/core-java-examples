package org.example.abstractclassmethod;

public class Abstract {
    public static void main(String[] args) {

        Parent p = new Child();//new Parent();
        p.m1(10);
    }

    // everything same as a concrete class.
    // you cant create object of abstrcat class
    // you can declare an abstract method
    // abstract class always defined with abstract keyword
    // abstract class may not have a abstrcat method ( dont want to create object)
    // abstract class cant be final
    // a class having abstract method must be declared as abstract
    // abstract method cant be final (not private)
    // abstract method should not have body
    // child class must implement abstrcat method
    private abstract static class Parent
    {
        public abstract void m1();

        public void m1(int x)
        {
            System.out.println("value of x: "+x);
            m1();
        }
    }

    private static class Child extends Parent
    {
        @Override
        public void m1() {
            System.out.println("in child class");
        }
    }
}