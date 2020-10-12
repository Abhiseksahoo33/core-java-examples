package org.example.inheritance.singleinheritance;

public class ParentChildMain {
    public static void main(String[] args) {
        child childvar=new child();

        /*childvar: a reference variable of type Child class.
         it can access all public fields/methods.
         default fields/methods in the same package*/

        System.out.println("calling child method ");
        System.out.println("percentage of student : "+childvar.childmethod());
        System.out.println("calling parent method ");
        childvar.ParentMethod();
    }
}
/*output
* inside parent constructor : 87
in child class mark : 87
name of the student : abhisek sahoo
calling child method
inside child method
mark of student (parent method)  : 87
87
percentage of student : 87.0%
calling parent method
mark of student (parent method)  : 87
* */