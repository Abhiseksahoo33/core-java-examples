package org.example.activity2;


    public class Test1
    {
        public static void main(String[] args)
        {
            Object obj1 = new Object();
            Object obj2 = new Object();
            System.out.println(obj1.hashCode() == obj2.hashCode());
            System.out.println(obj1.getClass());
            System.out.println(obj1 == obj2);
        }
    }

/*
* output
* false
class java.lang.Object
false
* */