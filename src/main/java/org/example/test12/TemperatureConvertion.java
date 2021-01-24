package org.example.test12;

import java.util.Scanner;

public class TemperatureConvertion {
    public static void main(String arg[])
    {
        double f,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Menu driven Program for Temperature conversion");
        System.out.println("_______________________________________");
        System.out.println("Choose type of conversion \n 1.Fahrenheit to Celsius  \n 2.Celsius to Fahrenheit");
        int ch=sc.nextInt();
        switch(ch)
        {
            case 1:  System.out.println("Enter temperature in  Fahrenheit ");
                f=sc.nextDouble();
                c=5/9*(f-32);
                System.out.println("Celsius temperature is = "+c);
                break;
            case 2:  System.out.println("Enter temperature in  Celsius ");
                c=sc.nextDouble();
                f=1.8*c+32;
                System.out.println("Fahrenheit temperature is = "+f);
                break;
            default:  System.out.println("Invalid choice  | please choose a valid choice");
        }
    }
}
//output
//Menu driven Program for Temperature conversion
//        _______________________________________
//        Choose type of conversion
//        1.Fahrenheit to Celsius
//        2.Celsius to Fahrenheit
//        2
//        Enter temperature in  Celsius
//        32
//        Fahrenheit temperature is = 89.6
//
