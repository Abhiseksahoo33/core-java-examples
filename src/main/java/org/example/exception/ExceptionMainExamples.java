package org.example.exception;


import com.sun.media.sound.InvalidDataException;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ExceptionMainExamples {

/*m9()
/

 */
    // ClassNotFoundException(checked), NoClassDefError : Error or Exception always comes at runtime. Only compilation error is at compile time

    public static void main2(String[] args) throws ClassNotFoundException {
        String className = "java.lang.String";
       // String className= "new delhi";  - Exception in thread "main" java.lang.ClassNotFoundException
        Class.forName(className);

    }
    public static void main1(String[] args) {

        List<String> list = new ArrayList<>();
        while(true)
        {
            try {
                list.add("data");
            } catch (Error e) {
                System.out.println(e.getCause());

                System.out.println(list.size()); //java.lang.OutOfMemoryError
                System.out.println("======================");
                e.printStackTrace();
            }
        }
    }



    /**
     * m8
     */
    private static void m8()
    {
        m81();
    }

    private static void m81()
    {
        m8();
    }

    public static void main_m8(String[] args) {
      // m8(); - Exception in thread "main" java.lang.StackOverflowError
        try {
            m8();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("exception occured");
        }
        catch (StackOverflowError e)
        {
            System.out.println("stack overflow error");
        }
        catch (Error e)
        {
            System.out.println("error occured");
        }
    }
    // unchecked exception wont be detected by the compiler
    // checked excdeptions are detected by the compiler
/*m7()
/

 */
    private static void m7() //throws Exception
    {
        int x = 11;
        if( x > 10)
            throw new RuntimeException("invalid data");
        System.out.println("wont execute");
    }

    public static void main_m7(String[] args) {
        try {
            m7();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
        try {
            m7();
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
        try {
            m7();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            m7();
            throw new SQLException();// with out this line it will show exception .
        } catch (SQLException e) { // detected: a child checked exception which is not thrown from try block
            e.printStackTrace();
        }

    }

   /* public static void main_m72(String[] args) {
        try {
            m7();
        } catch (IOException e) { // detected: a child checked exception which is not thrown from try block
            e.printStackTrace();
        }

    }*/

    public static void main_m71(String[] args) {
        try {
            m7();
            throw new IOException("ioe");
        } catch (IOException e) { // detected: a child checked exception which is thrown from try block
            e.printStackTrace();
        }

    }

/*m6()
/throws Exception
 */

    private static void m6() throws Exception
    {
        int x = 11;
        if( x > 10)
            throw new Exception("checked");

        System.out.println("wont execute");
    }

    public static void main_m6(String[] args) throws Exception {

        // try - catch, try - catch - catch - finally, try - finally
        try {
            System.out.println("calling m6");
            m6();
        } finally {

            System.out.println("finally");
        }

    }


    /*m5()
    /
     */
    private static void m5() throws InvalidDataException
    {
        int x = 11;
        if(x > 10)
        {
            try {
                System.out.println("try");
                throw new InvalidDataException("invalid data");
            } catch (InvalidDataException e) {
                System.out.println("inside catch1 block");
                throw e;
            }
            finally {
                System.out.println("finally1");
            }
            // System.out.println("bye"); // wont execute unreachable statement
        }
        System.out.println("hello"); // wont execute
    }
    public static void main_m5(String[] args) throws InvalidDataException {
        try {
            m5();
            System.out.println("try2");
        } catch (InvalidDataException e) {
            System.out.println("catch2");
            //   System.exit(0); // if JVM terminated then finally block wont execute
            throw e;
        }
        finally {
            System.out.println("finally2");
        }

        System.out.println("ok");
    }

    /*m4()
    /

     */

    private static void m4() throws InvalidDataException , SQLException {
        System.out.println("m4()");
        int x = 11;
        if (x > 10) {
            throw new InvalidDataException("invalid data");
        }
        if (x > 0) {
            throw new SQLException("invalid data between 0 and 10");
        }
    }
    public static void main_m4(String[] args) {
        // multi catch using pipe and it is used when exceptions are siblings instead they are subclasses.

        try {
            m4();
        } catch (InvalidDataException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        try {
            m4();
        } catch (InvalidDataException | SQLException e) {
            e.printStackTrace();
        }
    }
/* m3()
/
 */
private static void m3() throws InvalidDataException /*(this is no use now)*/, Exception {
    System.out.println("m3()");
    int x = 11;
    if (x > 10) {
        throw new InvalidDataException("invalid data");
    }
    if (x > 0) {
        throw new Exception("invalid data between 0 and 10");
    }
}


    public static void main_m32(String[] args) {
        try {
            m3();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main_m31(String[] args) {

        try {
            m3();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            m3();
        } catch (InvalidDataException e) {
            e.printStackTrace();
            System.out.println("**"+e.getClass()); // child class should be at first
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getClass());
        }
    }




    /* m2()
/
 */
    private static void m22() {
        int x = 11;
        if (x > 10) {
            throw new InvalidDataRuntimeException("invalid data");
        }
    }

    private static void m2() throws InvalidDataException {
        int x = 11;
        if (x > 10) {
            throw new InvalidDataException("invalid data");
        }
    }

    private static class InvalidDataException extends Exception {
        public InvalidDataException(String message) {
            super(message);
            // custom logic
        }
    }
    // for reference see SQLException class
    private static class InvalidDataRuntimeException extends RuntimeException {
        public InvalidDataRuntimeException(String message) {
            // problem
            super(message);
            // custom logic
        }
    }
    public static void main_m23(String[] args) {
        try {
            m2();
        } catch (InvalidDataException e) {
            e.printStackTrace();
        }
        System.out.println("bye");
    }
    public static void main_m22(String[] args) {
        try {
            m2();
        } catch (Exception e) { // parent of ExceptionMain$InvalidDataException
            e.printStackTrace();
            System.out.println("bye");
        }
        System.out.println("bye");
    }

    public static void main_m22_1(String[] args) {
        m22();
    }
    public static void main_m2(String[] args) throws Exception {
        m2();
    }

    /* m1()
    /
     */
    private static void m1() throws Exception {
        System.out.println("m1()");
        int x = 11;
        if (x > 10)
            throw new Exception("invalid data"); // handle with try and catch for all exceptions

        System.out.println("hi");
    }

    public static void main_16(String[] args) throws Throwable {
        try {
            m1();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("================");
            throw e;
        }
    }

    public static void main_15(String[] args) throws Exception {
        try {
            m1();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("================");
            throw new Exception(e);
        }
    }


    public static void main_m14(String[] args) throws Exception {
        try {
            m1();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("================");
            throw e;
        }
        System.out.println("bye"); // this will not execute
    }

    public static void main_m13(String[] args) {
        try {
            m1();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e); // throwing a uncheked exception (converted checked exception to unchecked): no throws statement need to add main method signature
        }
        System.out.println("bye"); // this will not execute
    }
    public static void main_m12(String[] args) throws Exception {
        try {
            m1();
        } catch (Exception e) {
            e.printStackTrace();//[supressing] the exception or else convert the exception or throw the exception
        }
        System.out.println("bye");  // this line will execute
    }

    public static void main_m11(String[] args) throws Exception {
        m1();
        System.out.println("bye");  // this line wont execute
    }

    public static void main_m1(String[] args) throws Exception {
        m1(); // it is throwing checked exception so add to signature of main
    }      //output - Exception in thread "main" java.lang.Exception: invalid data
}
