package org.example.activity05;


public class A {
    public static A super_var;

    public A() {
        super_var = this;
        System.out.println("Constrcutor of A invoked");
    }
}



class B extends A {
    public static A sub_var;

    public B() {
        sub_var = this;
        System.out.println("Constructor of B invoked");
    }

    public void checkmultiobject() {
        if (sub_var == A.super_var)
            System.out.println("There is only one object is created");
        else
            System.out.println("There are more than one object created");
    }

    public static void main(String Args[]) {
        B x = new B();
        x.checkmultiobject();
    }
}

/*output
* Constrcutor of A invoked
Constructor of B invoked
There is only one object is created
* */