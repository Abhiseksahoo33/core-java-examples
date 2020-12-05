package org.example.StringClass;

public class DivisibilityTestOf3 {
    public static void main(String[] args) {
        String s="013";
        //int n=Integer.parseInt(s);
       int sum=0;
       for (int i=0;i<s.length();i++)
       {
           sum+= s.charAt(i)-'0';//ascii value of 0 is 48 so and it added to the sum so we need to discard this
       }
       if (sum%3==0)
           System.out.println("divisable");
       else
       {
           System.out.println("not divisible");
           System.out.println(sum);

       }
    }
}
