package org.example.test12;

import java.util.Scanner;

public class Discount {

        public static void main(String args[])
        {

            Double  dis,amount,Printedprice,gst;

            Scanner sc=new Scanner(System.in);

            System.out.println("Enter Printed price of camera ");

           Printedprice=sc.nextDouble();

            dis=10.00;

            dis= (Printedprice*dis)/100;
            amount=Printedprice- dis;
            gst=6.00;
            gst= (amount*gst)/100;
            amount=amount+gst;

            System.out.println("amount to be paid="+amount);


    }
}
//output
//Enter Printed price of camera
//        100
//        amount to be paid=95.4