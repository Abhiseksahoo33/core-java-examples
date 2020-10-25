package org.example.inheritancescenarios;

public class Test23 {

    public static void main(String[] args) {

        A a = new B();
    }

    private static abstract class A
    {
        protected int i;

        // constructor is not meant object creation here in abstract class.
        // initializing the variables. or executing some initialization logic.
        public A(int i) {
            this.i = i;
            System.out.println(this.getClass());  // depends on object which we created. same in parenet & child class
            System.out.println(this.hashCode()); // same everywhere parent & child class.
        }

        public void m1()
        {
            System.out.println("super class m1");
        }
    }

    private static class  B extends A{

        protected  int i = 100;
        public B() {
            super(10); // invoking super constructor
            System.out.println(i);
            System.out.println(this.i);
            System.out.println(super.i);
            m1();
            this.m1();
            super.m1();

            System.out.println(this.getClass());
            System.out.println(this.hashCode());
        }


        public void m1()
        {
            System.out.println("child class m1");
        }

    }
}
/*output
* "E:\core java\java-1.8.0-openjdk-1.8.0.265-3.b01.redhat.windows.x86_64\bin\java.exe" "-javaagent:E:\core java\lib\idea_rt.jar=52704:E:\core java\bin" -Dfile.encoding=UTF-8 -classpath "E:\core java\java-1.8.0-openjdk-1.8.0.265-3.b01.redhat.windows.x86_64\jre\lib\charsets.jar;E:\core java\java-1.8.0-openjdk-1.8.0.265-3.b01.redhat.windows.x86_64\jre\lib\ext\access-bridge-64.jar;E:\core java\java-1.8.0-openjdk-1.8.0.265-3.b01.redhat.windows.x86_64\jre\lib\ext\cldrdata.jar;E:\core java\java-1.8.0-openjdk-1.8.0.265-3.b01.redhat.windows.x86_64\jre\lib\ext\dnsns.jar;E:\core java\java-1.8.0-openjdk-1.8.0.265-3.b01.redhat.windows.x86_64\jre\lib\ext\jaccess.jar;E:\core java\java-1.8.0-openjdk-1.8.0.265-3.b01.redhat.windows.x86_64\jre\lib\ext\localedata.jar;E:\core java\java-1.8.0-openjdk-1.8.0.265-3.b01.redhat.windows.x86_64\jre\lib\ext\nashorn.jar;E:\core java\java-1.8.0-openjdk-1.8.0.265-3.b01.redhat.windows.x86_64\jre\lib\ext\sunec.jar;E:\core java\java-1.8.0-openjdk-1.8.0.265-3.b01.redhat.windows.x86_64\jre\lib\ext\sunjce_provider.jar;E:\core java\java-1.8.0-openjdk-1.8.0.265-3.b01.redhat.windows.x86_64\jre\lib\ext\sunmscapi.jar;E:\core java\java-1.8.0-openjdk-1.8.0.265-3.b01.redhat.windows.x86_64\jre\lib\ext\sunpkcs11.jar;E:\core java\java-1.8.0-openjdk-1.8.0.265-3.b01.redhat.windows.x86_64\jre\lib\ext\zipfs.jar;E:\core java\java-1.8.0-openjdk-1.8.0.265-3.b01.redhat.windows.x86_64\jre\lib\jce.jar;E:\core java\java-1.8.0-openjdk-1.8.0.265-3.b01.redhat.windows.x86_64\jre\lib\jfr.jar;E:\core java\java-1.8.0-openjdk-1.8.0.265-3.b01.redhat.windows.x86_64\jre\lib\jsse.jar;E:\core java\java-1.8.0-openjdk-1.8.0.265-3.b01.redhat.windows.x86_64\jre\lib\management-agent.jar;E:\core java\java-1.8.0-openjdk-1.8.0.265-3.b01.redhat.windows.x86_64\jre\lib\resources.jar;E:\core java\java-1.8.0-openjdk-1.8.0.265-3.b01.redhat.windows.x86_64\jre\lib\rt.jar;E:\code\core\core-java-examples\target\classes" org.example.inheritancescenarios.Test23
class org.example.inheritancescenarios.Test23$B
1975012498
100
100
10
child class m1
child class m1
super class m1
class org.example.inheritancescenarios.Test23$B
1975012498

Process finished with exit code 0

* */