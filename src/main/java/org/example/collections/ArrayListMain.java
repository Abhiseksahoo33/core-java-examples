package org.example.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListMain {
    public static void m1(String[] args) {
        int[] arr = {10, 20, 30};
        arr[2] = 50;// runtime memory allocation
        System.out.println(Arrays.toString(arr));//[10, 20, 50]
    }


    //public class ArrayList<E> extends AbstractList<E>
    //        implements List<E>, RandomAccess, Cloneable, java.io.Serializable

    public static void m2(String[] args) {
ArrayList<String> a1 = new ArrayList<>();
        System.out.println(a1.isEmpty()); // true - returns   boolean type
        System.out.println(a1.size()); // 0
        a1.add("abhisek");
        a1.add("Prasad");
        System.out.println(a1);    //[abhisek, Prasad]
        System.out.println(a1.isEmpty());// false
        System.out.println(a1.size()); // 2
        System.out.println(a1.contains("abhisek")); // true // search
        System.out.println(a1.remove("Prasad")); // true // delete
        System.out.println(a1.remove("Sambit")); // false // not available in th array list
        a1.set(0, "alex"); // update by index
        System.out.println(a1);   //[alex] -- deleted the previous data
        System.out.println(a1.remove("alex")); // true
        System.out.println(a1); // [  ]
        a1.add("john");
        a1.add("doe");
        a1.add("doe");
        a1.add("doe");
        System.out.println(a1.indexOf("john")); // 0
        System.out.println(a1.lastIndexOf("doe"));  // 3
        System.out.println(a1.indexOf("doe")); // 1

    }

    public static void m3(String[] args) {
        // array list overrides equals and hashcode methods
        ArrayList<String> al = new ArrayList<>();
        al.add("john");
        al.add("doe");
        al.add("doe");
        al.add("john");
        al.remove("john");
        System.out.println(al); //[doe, doe, john]
        al.remove(1); // remove element at index 1
        System.out.println(al); //[doe, john]

    }
    public static void main(String[] args) {

        // ArrayList<String> al = new ArrayList<>();
        List<String> al = new ArrayList();
        al.add("john");
        al.add("doe");
        al.add("doe");
        al.add("john");
        System.out.println(al.get(2));
        Object[] arrayAsObject = al.toArray();
        System.out.println(Arrays.toString(arrayAsObject));
        int size = al.size();
        String[] strArray = al.toArray(new String[size]);
        System.out.println(Arrays.toString(strArray));
    }


}
