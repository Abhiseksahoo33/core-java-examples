package org.example.constructor;

public class ConstructorExample {
    int first_number;
    int second_number;
    int third_number;
    int sum;


    ConstructorExample()
    {
        System.out.println("default constructor");
        System.out.println("first number= "+first_number);
        System.out.println("second number ="+second_number);
        System.out.println("third number = "+third_number);
        System.out.println("--------------------------------");
    }
    ConstructorExample(int x)
    {
        first_number=x;
        System.out.println("paramiterized ( one arg ) constructor");
        System.out.println("first number= "+first_number);
        System.out.println("second number ="+second_number);
        System.out.println("third number = "+third_number);
        System.out.println("--------------------------------");
    }
    ConstructorExample(float x,float y)
    {

       float first_number=x;
       float second_number=y;
        System.out.println("paramiterized ( two arg ) constructor");
        System.out.println("first number= "+first_number);
        System.out.println("second number ="+second_number);
        System.out.println("third number = "+third_number);
        System.out.println("--------------------------------");

    }
    ConstructorExample(double d1,double d2,double d3)
    {

        double first_number=d1;
        double second_number=d2;
        double third_number=d3;
        System.out.println("paramiterized ( two  arg(double) ) constructor");
        System.out.println("first number= "+first_number);
        System.out.println("second number ="+second_number);
        System.out.println("third number = "+third_number);
        System.out.println("--------------------------------");

    }
}
/*
* output
* default constructor
first number= 0
second number =0
third number = 0
--------------------------------
paramiterized ( one arg ) constructor
first number= 24
second number =0
third number = 0
--------------------------------
paramiterized ( two arg ) constructor
first number= 2.5
second number =5.6
third number = 0
--------------------------------
paramiterized ( two  arg(double) ) constructor
first number= 25.68464
second number =48.65544
third number = 482.2875
* */
