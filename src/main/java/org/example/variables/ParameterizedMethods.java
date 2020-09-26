package org.example.variables;

public class ParameterizedMethods {
    static int sum(int x,int y)
    {
        int z=x+y;
        return z;

    }
    public static void main(String[] args) {
int result=sum(10,20);
        System.out.println("sum of two numbers is = "+result);
    }
}
/**
 * output
 * sum of two numbers is = 30
 */
/