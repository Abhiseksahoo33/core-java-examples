package org.example.test12;

import java.util.Scanner;

public class GreatestAndSmallestNumber {

        public static void main (String [] args)
        {
            Scanner sc=new Scanner(System.in);

            int a,b,c;

            System.out.println("Enter first number:");

            a=sc.nextInt();

            System.out.println("Enter second number:");

            b=sc.nextInt();

            System.out.println("Enter third number:");

            c=sc.nextInt();

            int MAX=Math.max (a,Math.max(b,c ));

            int MIN=Math.min (a, Math.min(b,c));

            System.out.println("Greatest number:"+MAX);

            System.out.println("Smallest number:"+MIN);

        }

    }

