package org.example.inheritancescenarios;

public class Test3 {

    // understanding the reference variable in inheritance.
    public static void main(String[] args) {

        Child child = new Child(); // inherited member + own member

        child.m2();
        child.m1();

        Parent parent = new Parent(); // own member only
        parent.m1();

        parent = new Child(); // will check m1() if it is present in child or parent
        parent.m1();

    }

    public static class Parent
    {
        public void m1()
        {
            System.out.println("inside parent class m1()");
        }
    }

    public static class Child extends Parent
    {
        public void m2()
        {
            System.out.println("inside child class m2()");
        }
    }
}
/* inside child class m2()
inside parent class m1()
inside parent class m1()
inside parent class m1()
*/