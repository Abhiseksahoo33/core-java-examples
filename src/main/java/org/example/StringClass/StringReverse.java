package org.example.StringClass;

public class StringReverse{
    public static void main(String args[]) {
        String str, rev="";
        str="Abhisek";
        int length=str.length();
        for(int i=length-1;i>=0;i--)
            rev=rev+str.charAt(i);
        System.out.println("Reversed string is : "+rev);// output --  kesihbA
    }
}