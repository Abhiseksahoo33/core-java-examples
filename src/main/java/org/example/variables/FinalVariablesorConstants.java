package org.example.variables;

public class FinalVariablesorConstants {
    final static int x=20;
    final  int y=30;

 static {
     int x=34; // x will nt change  bcause x is final  static variable
 }
    {
        int y=34;
        System.out.println("value of y (local) = "+y); //  value of y will change because y is local
    }

    public static void main(String[] args) {
        System.out.println("value of x = "+x);
        FinalVariablesorConstants o4=new FinalVariablesorConstants();
        System.out.println("value of y (global and final/constant = "+o4.y); // y is final variable
    }
}

/**
 *
 * output
 value of x = 20
 value of y (local) = 34
 value of y (global and final/constant = 30
 */
