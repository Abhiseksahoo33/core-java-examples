package org.example.ThisOperator.employee;

public class EmployeeMain {
    public static void main(String[] args) {

EmployeeData employee=new EmployeeData("abhisek",5487546,2018,"single");
       // System.out.println("information of employee 1 : ",EmployeeData.display()); // this is a static method we can't call nonstatic display()
   employee.setStatus("married");
        System.out.println(employee.getStatus());
       employee.setStatus(null); // will print single
        System.out.println(employee.getStatus());

    }
}
/*
* output
* name : abhisek
joining year: 2018
registration no : 5487546
maretal status : single
married
single
* */