package org.example.StringClass;

public class StringMethodsExamples4 {
    public static void main(String[] args) {

        m23();
        m22();
    }

    // string constructors
    public static void m23() {
        String s = new String("abc");
        byte[] bytes = s.getBytes();
        s = new String(bytes);
        char[] ch = {'a', 'b', 'c'};
        s = new String(ch);

        System.out.println(s);
    }

    // static methods
    public static void m22() {
        char[] ch = {'a', 'b', 'c'};
        String result = String.copyValueOf(ch);
        System.out.println(result);

        String message = "Today is %s day and on %d. You will get salary of %f only if you study";

        result = String.format(message, "children's day", 14, 80000.7f);
        System.out.println(result); //Today is children's day day and on 14. You will get salary of 80000.703125 only if you study

        result = String.join("#", "xy", "ab", "lm");
        System.out.println(result);

        result = String.valueOf(10);
        System.out.println(result);
        result = String.valueOf(true);
        System.out.println(result);
        result = String.valueOf(ch);
        System.out.println(result);

        Object object = new String("abcd");
        System.out.println(object);
    }
}
