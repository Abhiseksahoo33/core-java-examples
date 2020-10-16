package org.example.inheritancescenarios;

public class Test2 {

    public static void main(String[] args) {

        Child c = new Child();
        c.m1(); //inside child class overridden m1()

        Parent p = new Parent();
        p.m1(); //inside parent class m1()

        p = new Child();
        System.out.println(p.getClass());//class org.example.inheritancescenarios.Test2$Parent
        p.m1(); //inside child class overridden m1()
        Child c1 = new Child();
        c1.m2(); //inside child class m2()

    }

    public static class Parent {
        public void m1() {
            System.out.println(" parent class m1()");
        }
    }

    public static class Child extends Parent {
        //overridden method m1()
        public void m1() {
            System.out.println("child class overridden m1()");
        }

        public void m2() {
            System.out.println("inside child class m2()");
        }
    }
}
