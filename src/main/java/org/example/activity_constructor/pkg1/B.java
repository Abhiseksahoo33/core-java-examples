package org.example.activity_constructor.pkg1;

class B
{
    public static void main(String[] args)
    {
        A a = new A();
        System.out.println(a.i); // we have to declare i as protected or public not private (cam't access outside the class )
        System.out.println(a.j);
        System.out.println(a.k); // why this is accessible?
    }
}