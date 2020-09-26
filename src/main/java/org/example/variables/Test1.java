package org.example.variables;

public class Test1 {
    public static int ageOfStudent;
    public static String nameOfStudent;
    static void m1()
    {
        ageOfStudent = 22;
        System.out.println("init of x inside static method: "+ageOfStudent);
    }
    static void m2()
    {
        nameOfStudent = "Abhisek sahoo";
        System.out.println("init of x inside static method: "+nameOfStudent);
    }
static {
        String blockstatic="inside class";
    System.out.println("Static block" +blockstatic);
    m1();
}

    public static void main(String[] args) {
        Test1 obj2=new Test1();
      m1();
       obj2.m2();
    }


}
/*
output

Static blockinside class
init of x inside static method: 22
init of x inside static method: 22
init of x inside static method: Abhisek sahoo
*/