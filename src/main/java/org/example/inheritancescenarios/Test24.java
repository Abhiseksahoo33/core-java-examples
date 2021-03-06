package org.example.inheritancescenarios;

// main method can be inherited to child class. If child class not defining the main method then parent class main will be invoked while executing child class.
// main method cant be overridden in child class.
public class Test24 {
    public static void main(String[] args) {
        System.out.println("Test24");

        Test24 t24 = new Test25();
        t24.main(null);
    }

    // main method overloading is allowed. but compiler wont call this. user has to call this.
    public static void main(String[] args, Object object) {
        System.out.println("Test24");

        Test24 t24 = new Test25();
        t24.main(null);
    }
}

class Test25 extends Test24
{
    public static void main(String[] args) {
        System.out.println("Test25");
    }
}
/*recurssion
*
	at org.example.inheritancescenarios.Test24.main(Test24.java:10)
	at org.example.inheritancescenarios.Test24.main(Test24.java:10)
	at org.example.inheritancescenarios.Test24.main(Test24.java:10)
	at org.example.inheritancescenarios.Test24.main(Test24.java:1
* */