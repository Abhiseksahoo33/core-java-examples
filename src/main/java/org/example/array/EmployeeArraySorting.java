package org.example.array;

import java.util.Arrays;
import java.util.Comparator;

public class EmployeeArraySorting {
    public static void main(String[] args) {

        Employee e1 = new Employee(1, "prasad", "TCS");
        Employee e2 = new Employee(2, "abhisek", "Campgemin");
        Employee e3 = new Employee(3, "ritesh", "ISRO");
        Employee e4 = new Employee(4, "ritesh", "MIndtree");
        Employee e5 = new Employee(5, "bikash", "MIndtree");

        Employee[] employees = {e1, e2, e3, e4, e5};
        Comparator nameComparator = new NameComparator();
        Comparator nameReverseCompanyNameComparator = new NameReverseCompanyNameComparator();

        Arrays.sort(employees, nameReverseCompanyNameComparator);
        System.out.println(Arrays.toString(employees));
        //Arrays.sort(employees, nameComparator);
        //System.out.println(Arrays.toString(employees));
    }
        static class NameComparator implements Comparator<Employee> {
            @Override
            public int compare(Employee o1, Employee o2) {
                String c1 = o1.getName();
                String c2 = o2.getName();
                int result = -c1.compareTo(c2); // reverseOrder -
                return result;
            }
        }
        

        // if name is same then sort in reverse order of company name
        static class NameReverseCompanyNameComparator implements Comparator<Employee> {
            @Override
            public int compare(Employee o1, Employee o2) {
                String c1 = o1.getName();
                String c2 = o2.getName();
                int result = -c1.compareTo(c2);
                if (result == 0) {
                    String companyName1 = o1.getCompanyName();
                    String companyName2 = o2.getCompanyName();

                    result = -companyName1.compareTo(companyName2);
                }
                return result;
            }
        }    }


