package org.example.activity2;

public class Test2 {
    int x;
    String y;

    public Test2(int x, String y) {
        this.x = x;
        this.y = y;
        this.m1(this);
    }

    public static void main(String[] args) {
        Test2 t = new Test2(10,"john");
        System.out.println(t.x );
        System.out.println(t.y );
        System.out.println(t.x == 100);
        System.out.println(t.y == "john");
    }

    public void m1(Test2 t1)
    {
        t1.x = 100;
        t1.y = "Doe";
    }
}