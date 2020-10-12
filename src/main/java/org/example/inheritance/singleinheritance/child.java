package org.example.inheritance.singleinheritance;

public class child extends Parent // extend the parent class can use all the data member and methods of parent
{
    protected String name;

    protected child()
    {

       // super();// calles parent constructor and must be the first line .
        name ="abhisek sahoo " ;
        System.out.println("in child class mark : "+mark );
        System.out.println("name of the student : "+name);

    }
    public String childmethod()
    {
        System.out.println("inside child method ");
        ParentMethod(); // calling parent method
        float percentage = ((float)mark/100)*100; // explicite conversion int to float of mark
        System.out.println(+mark);
        return percentage+"%";

    }
}

