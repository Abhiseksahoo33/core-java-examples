package org.example.activity05;

class Person
{
    Person()
    {
        System.out.println("Person(parent ) class Constructor");
    }
}

/* subclass Student extending the Person class */
class Student extends Person
{
    Student()
    {

        super(); // invoke  parent class constructor

        System.out.println("Student (child) class Constructor");
    }
}


class SuperConstructor
{
    public static void main(String[] args)
    {
        Student var = new Student(); // called the student constructor
    }
}
/*output
Person(parent ) class Constructor
Student (child) class Constructor
*/