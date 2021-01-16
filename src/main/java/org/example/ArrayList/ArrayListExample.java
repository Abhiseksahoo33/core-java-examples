package org.example.ArrayList;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String args[]){
        ArrayList<String> list=new ArrayList<String>();  //Creating arraylist
        list.add("Mango");  //Adding object in arraylist
        list.add("Apple");
        list.add("Banana");
        list.add("Grapes");

        //Printing the arraylist

        System.out.println(list);  //[Mango, Apple, Banana, Grapes]
    }

}
