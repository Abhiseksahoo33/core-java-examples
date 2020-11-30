package org.example.array;

import java.util.Arrays;
import java.util.Comparator;
// shorting of array according to company name (string )
public class SortingOfArray2 {

    public static void main(String[] args) {
            Employee e1 = new Employee(1, "prasad", "TCS");
            Employee e2 = new Employee(2, "abhisek", "Campgemin");
            Employee e3 = new Employee(3, "sambit", "ISRO");
            Employee e4 = new Employee(4, "ritesh", "MIndtree");

            // sort employee array by company name

            Employee[] employees = {e1, e2, e3, e4};

            Arrays.sort(employees, Comparator.comparing(Employee::getName)); // JAVA 8 Style
            System.out.println(Arrays.toString(employees));
        }


    }


