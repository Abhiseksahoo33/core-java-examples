package org.example.inheritance.singleinheritance;

public class Parent {
    protected int mark ; // it can be access by any class inside package

    public Parent() {

        mark=87;
        System.out.println("inside parent constructor : "+mark); // called by super()

    }
    protected void ParentMethod()
    {
        System.out.println("mark of student (parent method)  : "+mark);

    }
}
