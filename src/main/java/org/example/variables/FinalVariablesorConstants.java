package org.example.variables;

public class FinalVariablesorConstants {
    final static int x=20;
    final  int y=30;

 static {
     int x=34; // x will nt change  bcause x is static variable
 }
    {
        int y=34;
        System.out.println("value of y = "+y); //  value of y will change because y is nonstatic
    }

    public static void main(String[] args) {
        System.out.println("value of x = "+x);
        FinalVariablesorConstants o4=new FinalVariablesorConstants();
    }
}

/**
 * 
 * output
 * value of x = 20
 * value of y = 34
 */
/