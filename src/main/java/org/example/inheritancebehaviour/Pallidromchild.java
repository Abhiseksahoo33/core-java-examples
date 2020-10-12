package org.example.inheritancebehaviour;

public class Pallidromchild extends PallindromParent {
    public void checkpallindrom()
    {
        int r,sum=0,temp;

// it will access the variable n from parent class
        temp=n; // to check if the number is equals with the reversed no.
        while(n>0)
        {
            r=n%10;  // remainder calculation
            sum=(sum*10)+r;// sum of reminders
            n=n/10; // next divident calculation
        }
        if(temp==sum)
            System.out.println("palindrome number ");
        else
            System.out.println("not palindrome");
    }
}
