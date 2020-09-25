package org.example;

public class Static {

    void m()
    {
        System.out.println("Abhiek sahoo");
    }
    static {
        System.out.println("hello");
        System.out.println("this is upadted");
    }


    public static void main(String[] args) {
        Static obj =new Static();
        obj.m();

    }
}
