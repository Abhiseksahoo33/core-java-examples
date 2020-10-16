package org.example.activity_constructor.pkg2;

import org.example.activity_constructor.pkg1.A;

class B
{
    public static void main(String[] args)
    {
        A a = new A();
        System.out.println(a.i);
        System.out.println(a.j);
        System.out.println(a.k); // why this is not accessible?
    }
}