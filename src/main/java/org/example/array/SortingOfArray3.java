package org.example.array;

import java.util.Arrays;
import java.util.Comparator;

public class SortingOfArray3 {
    public static void main(String[] args) {


        Employee e1 = new Employee(1, "prasad", "TCS");
        Employee e2 = new Employee(2, "abhisek", "Campgemin");
        Employee e3 = new Employee(3, "sambit", "ISRO");
        Employee e4 = new Employee(4, "ritesh", "MIndtree");
        Employee e5= new Employee(5, "bikash", "MIndtree");

            // sort employee array by company name

            Employee[] employees = {e1, e2, e3, e4,e5};

            CompanyNameComparator companyNameComparator = new CompanyNameComparator();
            Arrays.sort(employees, companyNameComparator);
            System.out.println(Arrays.toString(employees));

        }
        //logic of comparator
        private static class CompanyNameComparator implements Comparator<Employee>
        {
            @Override
            public int compare(Employee o1, Employee o2) {
                String c1 = o1.getCompanyName();
                String c2 = o2.getCompanyName();
                return c1.compareTo(c2);
            }
        }
    }

