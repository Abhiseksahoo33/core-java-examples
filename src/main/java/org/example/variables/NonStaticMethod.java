package org.example.variables;

public class NonStaticMethod {

    void m1(){

        int subject1=21,subject2=20;
        int mark=subject1+subject2;
        System.out.println("full mark  =" +mark );
    }
    void m2()
    {
 String fname="Abhisek";
 String lname="Sahoo";
        System.out.println(" full name= "+fname   +lname);
        m1();
    }
    {
        m1();
        System.out.println("non static block");
    }
    public static void main(String[] args) {
        NonStaticMethod var=new NonStaticMethod();
        var.m1();
        var.m2();

    }
}

/*output
*
* full mark  =41
non static block
full mark  =41
 full name= AbhisekSahoo
full mark  =41       */
