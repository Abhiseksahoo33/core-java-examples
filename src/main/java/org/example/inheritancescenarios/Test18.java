package org.example.inheritancescenarios;

// inheritance initialization flow
public class Test18 {
    public static void main(String[] args) {
        A a = new B();
    }

    private static class A {
        public static int i = getI(); // 1
        public int ii = getII(); // 7

        static {
            System.out.println("static-block-1-A"); // 2
        }

        static {
            System.out.println("static-block-2-A");// 3
        }

        {
            System.out.println("non-static-block-1-A"); // 8
        }

        {
            System.out.println("non-static-block-2-A"); // 9
        }

        public A() {
            System.out.println("default constructor of A"); // 10
        }

        public static int getI() {
            System.out.println("static method (variable) for A");
            return 100;
        }

        public int getII()
        {
            System.out.println("non static method(variable) for A");
            return 1000;
        }
    }


    private static class B extends A {
        public static int j = getJ(); // 4
        public int jj = getJJ(); // 11

        static {
            System.out.println("static-block-1-B"); // 5
        }

        static {
            System.out.println("static-block-2-B"); // 6
        }

        {
            System.out.println("non-static-block-1-B"); // 12
        }

        {
            System.out.println("non-static-block-2-B"); // 13
        }

        public B() {
            System.out.println("default constructor of B"); // 14
        }

        public static int getJ() {
            System.out.println("static method(variable) for B");
            return 100;
        }

        public int getJJ() {
            System.out.println("non-static method (variable) for B");
            return 1000;
        }
    }


}

/*output
* "E:\core java\java-1.8.0-openjdk-1.8.0.265-3.b01.redhat.windows.x86_64\bin\java.exe" "-javaagent:E:\core java\lib\idea_rt.jar=51876:E:\core java\bin" -Dfile.encoding=UTF-8 -classpath "E:\core java\java-1.8.0-openjdk-1.8.0.265-3.b01.redhat.windows.x86_64\jre\lib\charsets.jar;E:\core java\java-1.8.0-openjdk-1.8.0.265-3.b01.redhat.windows.x86_64\jre\lib\ext\access-bridge-64.jar;E:\core java\java-1.8.0-openjdk-1.8.0.265-3.b01.redhat.windows.x86_64\jre\lib\ext\cldrdata.jar;E:\core java\java-1.8.0-openjdk-1.8.0.265-3.b01.redhat.windows.x86_64\jre\lib\ext\dnsns.jar;E:\core java\java-1.8.0-openjdk-1.8.0.265-3.b01.redhat.windows.x86_64\jre\lib\ext\jaccess.jar;E:\core java\java-1.8.0-openjdk-1.8.0.265-3.b01.redhat.windows.x86_64\jre\lib\ext\localedata.jar;E:\core java\java-1.8.0-openjdk-1.8.0.265-3.b01.redhat.windows.x86_64\jre\lib\ext\nashorn.jar;E:\core java\java-1.8.0-openjdk-1.8.0.265-3.b01.redhat.windows.x86_64\jre\lib\ext\sunec.jar;E:\core java\java-1.8.0-openjdk-1.8.0.265-3.b01.redhat.windows.x86_64\jre\lib\ext\sunjce_provider.jar;E:\core java\java-1.8.0-openjdk-1.8.0.265-3.b01.redhat.windows.x86_64\jre\lib\ext\sunmscapi.jar;E:\core java\java-1.8.0-openjdk-1.8.0.265-3.b01.redhat.windows.x86_64\jre\lib\ext\sunpkcs11.jar;E:\core java\java-1.8.0-openjdk-1.8.0.265-3.b01.redhat.windows.x86_64\jre\lib\ext\zipfs.jar;E:\core java\java-1.8.0-openjdk-1.8.0.265-3.b01.redhat.windows.x86_64\jre\lib\jce.jar;E:\core java\java-1.8.0-openjdk-1.8.0.265-3.b01.redhat.windows.x86_64\jre\lib\jfr.jar;E:\core java\java-1.8.0-openjdk-1.8.0.265-3.b01.redhat.windows.x86_64\jre\lib\jsse.jar;E:\core java\java-1.8.0-openjdk-1.8.0.265-3.b01.redhat.windows.x86_64\jre\lib\management-agent.jar;E:\core java\java-1.8.0-openjdk-1.8.0.265-3.b01.redhat.windows.x86_64\jre\lib\resources.jar;E:\core java\java-1.8.0-openjdk-1.8.0.265-3.b01.redhat.windows.x86_64\jre\lib\rt.jar;E:\code\core\core-java-examples\target\classes" org.example.inheritancescenarios.Test18
static method (variable) for A
static-block-1-A
static-block-2-A
static method(variable) for B
static-block-1-B
static-block-2-B
non static method(variable) for A
non-static-block-1-A
non-static-block-2-A
default constructor of A
non-static method (variable) for B
non-static-block-1-B
non-static-block-2-B
default constructor of B

Process finished with exit code 0
*/