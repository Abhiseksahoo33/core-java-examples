package org.example.exception;

public class ExceptionMain {
    // Throwable: Checked in nature
    // Error: uncheck in nature
    // Exception : Anything Exception or child of Exception is called checked Exception
    // RuntimeException
    // anything RuntimeException or child of RuntimeException is called unchecked exception (defined to compiler)
    public static void main(String[] args) {
        //  throw new RuntimeException(""); // unchecked
        //   throw new ArrayIndexOutOfBoundsException(""); // unchecked
        // throw new Exception(""); // checked
        // throw new IOException(""); // checked
        // throw new Throwable(""); // checked
        throw new Error(""); // unchecked
    }
}
