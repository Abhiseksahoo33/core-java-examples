package org.example.StringClass;

import java.util.Arrays;

public class StringClassMethodsExamples3 {
    public static void main(String[] args) {
        m11();
        m12();
        m13();
        m14();
        m15();
        m16();
        m17();
        m18();
        m19();
        m20();m21();
    }
    public static void m11() {
        String s1 = new String("abc"); // object reference from heap (scp + heap)
        String s2 = "abc"; // scp

        System.out.println(s1.hashCode() + " " + System.identityHashCode(s1));
        System.out.println(s2.hashCode() + " " + System.identityHashCode(s2)); //object for which the hashCode is to be calculated

        System.out.println(System.identityHashCode(s1)); // heap hashcode
        System.out.println(System.identityHashCode(s1.intern())); // scp hashcode

        String s3 = s1; // assigning heap object refernce to s3
        String s4 = s1.intern(); // assigning scp object reference to s4

        System.out.println(s3.hashCode());
        System.out.println(s4.hashCode());
    }
    public static void m12() {
        String s1 = "abhisek";
        //String s2 = null;  null pointor exception
        String s = new String(s1); //new String();  "";
        System.out.println(s.isEmpty());
    }


    public static void m13() {
        String s = "hii everyone ";
        int x = s.length();
        System.out.println(x);
    }
    // KMP algorithm : string comparison
    public static void m14() {
        String s = "we are from india";
        boolean flag = s.matches(s);
        System.out.println(flag);
    }

    public static void m15() {
        String s = "welcome to india";
        s = s.replace('l', 'k');
        System.out.println(s);
    }


    public static void m17() {
        String s = "welcome to india";
        String[] array = s.split("t");
        System.out.println(Arrays.toString(array)); //[welcome , o india]
    }

    public static void m16() {
        String s = "welcome welcome";
        s = s.replaceFirst("welcome", "hi"); // hi hi
        System.out.println(s);
    }
    // startsWith, endsWith, substring, subsequence
    public static void m18() {
        String s = "welcome to india";
        boolean flag = s.startsWith("welcome");
        boolean flag1 = s.endsWith("india");
        System.out.println(flag);  // true
        System.out.println(flag1); //true
        CharSequence result = s.subSequence(1, 4);
        System.out.println(result);
        String s1 = s.substring(1, 4);
        System.out.println(s1);//elc


        s1 = s.substring(4); // from the 4 th array index it will start collecting
        System.out.println(s1); //ome to india
    }
    // lowerCase, upperCase, trim
    public static void m19() {
        String s = " Welcome to india "; // string are constant, immutable
        String result = s.toLowerCase();
        System.out.println(result);
        System.out.println(s);

        result = s.toUpperCase();
        System.out.println(result);
        System.out.println(s);
        System.out.println(s.length());
        result = s.trim();
        System.out.println("trim "+result.length()); // remove the white spaces
    }
    public static void m21()
    {
        String s = " Welcome ";

        for(int i = 0; i <s.length(); i++ )
        {
            System.out.println(s.charAt(i));//[ , W, e, l, c, o, m, e,  , t, o,  , i, n, d, i, a,  ]
        }
    }
    public static void m20()
    {
        String s = " Welcome to india ";
        char ch[] = s.toCharArray();
        System.out.println(Arrays.toString(ch));
    }
 //W
    //e
    //l
    //c
    //o
    //m
    //e

}
