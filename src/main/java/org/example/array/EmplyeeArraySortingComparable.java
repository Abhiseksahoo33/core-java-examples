package org.example.array;

import java.util.Arrays;
import java.util.Comparator;

public class EmplyeeArraySortingComparable {
    public static void main(String[] args) {

        Employee e1 = new Employee(1, "John", "FICO");
        Employee e2 = new Employee(2, "Doe", "TCS");
        Employee e3 = new Employee(3, "Alex", "FICO");
        Employee e4 = new Employee(4, "Carrey", "ACCENTURE");
        Employee e5 = new Employee(5, "John", "GOOGLE");

        Employee[] employees = {e1, e2, e3, e4, e5};
        Arrays.sort(employees); // sortByName: depends on comparable defined inside Employee class.
        Arrays.sort(employees, new CompanyNameComparator());// sorting: external to Employee class

//        Comparator comparator = (Comparator) e1; // runtime ClassCastException
        Comparable comparable = (Comparable) e1; // no error as it has implemented Comparable
        System.out.println(Arrays.toString(employees)); // sort object by comparable by default
        // if your employee object has not implemented comparable?
        // AT runtime ClassCastException: because trying to assign to a comparable(by doing typecast) even though your employee object has not implemented comparable
    }
    // Comparator: to sort the objects: logic
    private static class CompanyNameComparator implements Comparator<Employee> {
        @Override
        public int compare(Employee o1, Employee o2) {
            String c1 = o1.getCompanyName();
            String c2 = o2.getCompanyName();
            return c1.compareTo(c2);
        }
    }

}
