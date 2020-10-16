package org.example.inheritancescenarios;
public class Test14 {

    // class cast exception
    // refVar is pointing to a different object type with which we are doing the casting
    public static void main(String[] args) {


        Object RefVar = new Employee();    // parent refvariable  = child object
        System.out.println(RefVar.getClass());

// object class refvar is greater than child class employee so we need typecast
        Employee obj2 = (Employee) RefVar;    // typecasting child ref = parent ref
        System.out.println(obj2.getClass());

       // String obj3 = (String) RefVar;         // string is not the child of parent (object)
        //System.out.println(obj3.getClass()); //    ClassCastException


        Object obj1 = new Object();    // reference var obj1 don't know about Employee object
        Employee e = (Employee) obj1;//    ClassCastException
        System.out.println(obj1.getClass());

    }

    private static class Employee
    {

    }
}