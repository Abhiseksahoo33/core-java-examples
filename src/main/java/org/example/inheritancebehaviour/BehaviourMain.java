package org.example.inheritancebehaviour;
//main  method
public class BehaviourMain {
    public static void main(String[] args) {
        BehaviourParent varp = new BehaviourParent();
        varp.m1();
        System.out.println("------------------------------------------");
        m1();
        System.out.println("------------------------------------------");
        m2();
        System.out.println("------------------------------------------");
        m3();
        System.out.println("------------------------------------------");
    }
        private static void m1 ()
        {
            BehaviourParent var1 = new BehaviourChild(); // parent refVariable is aware about child object
            BehaviourChild var2 = new BehaviourChild(); // child refVariable is aware about child object
            System.out.println(var1.getClass()); // object is of which type class
            System.out.println(var2.getClass()); // object is of which type class

            System.out.println(var1 instanceof BehaviourChild); // true
            System.out.println(var1 instanceof BehaviourParent); // true
            System.out.println(var2 instanceof BehaviourChild); // true
            System.out.println(var2 instanceof BehaviourParent); // true
        }
        private static void m2 ()
        {
            BehaviourParent p1 = new BehaviourChild();
            System.out.println("m2() in main(parent ) :"+p1.a); // 10
           // System.out.println("m2() in main(parent ) :" +p1.b); // b is not in parent class
           p1. m1();
           p1. m2();
           p1. m3();
        }
        private static void m3 ()
        {
            BehaviourParent c1 = new BehaviourChild();
            System.out.println("m2() in main( child ) :" +c1.a); // no 50 output =10 depends upon the type of class of c1
             //System.out.println("m2() in main(child  ) :" +c1.b); // 100
           // c1.m4();
           c1. m2();
            c1.m3();
        }

    }

/*
* output
* parent class m1()
------------------------------------------
class org.example.inheritancebehaviour.BehaviourChild
class org.example.inheritancebehaviour.BehaviourChild
true
true
true
true
------------------------------------------
m2() in main(parent ) :10
parent class m1()
 parent static m2()
child m3()
parent class m1()
------------------------------------------
m2() in main( child ) :10
 parent static m2()
child m3()
parent class m1()
------------------------------------------
*
* */