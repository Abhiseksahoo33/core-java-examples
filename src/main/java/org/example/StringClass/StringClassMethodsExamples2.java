package org.example.StringClass;

public class StringClassMethodsExamples2 {
    public static void main(String[] args) {
        m4();// intern method
        m5();//equalsIgnoreCase
        m6();//toString()
        m7();
    }
    public static void m4() {
        String s = new String("abc"); // heap
        String s1 = s.intern(); // is abc present in scp ? no. then add it to scp.
        String s2 = s.intern(); // is abc present in scp ? yes. then dont add it to scp. just return existing refrence from scp.

        System.out.println(s1 == s2); // true
        System.out.println(s == s2); // false
        System.out.println(s == s1); // false
    }
    // using equalIgnoreCase
    public static void m5() {
        String s = "Abc";
        String s1 = "ABC";
        System.out.println(s1.equals(s)); // false
        System.out.println(s1.equalsIgnoreCase(s)); // true
    }
    // toString() from object class overidden in string class
    public static void m6() {
        String s = new String("abc");
        System.out.println(s.toString());//Converts this string to a new character array.
    }
    public static void m7() {
        String s = new String("india is our country");
        System.out.println(s.charAt(0));//i
        System.out.println(s.charAt(19));//y

        String s1 = "Abc";
        String s2 = "ADef";
        System.out.println(s1.compareTo(s2)); // 30

        String s3 = "ABF";
        System.out.println(s1.compareToIgnoreCase(s3)); // c - f

        String s4 = "Abcdefghi";
        System.out.println(s1.compareToIgnoreCase(s4)); // s1.length() - s2.length()


        String s5 = "Abfdefghi";
        System.out.println(s1.compareToIgnoreCase(s5)); // c - f
    }
}
