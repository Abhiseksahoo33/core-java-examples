package org.example.array;

public class Employee2DArray {
    public static void main(String[] args) {
        Employee[][] employees = new Employee[2][]; // row size must be defined

        Employee e1 = new Employee();
        Employee e2 = new Employee();
        Employee e3 = new Employee();
        Employee e4 = new SubEmployee();
        employees[0] = new Employee[]{e1,e2,e3};
        employees[1] = new Employee[]{e2,e3,e4};

        for(Employee[] employee1dArray: employees)
        {
            for(Employee employee: employee1dArray)
            {
                System.out.println(employee.getClass());
            }
        }
    }
}

