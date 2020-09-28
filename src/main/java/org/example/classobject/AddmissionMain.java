package org.example.classobject;
import java.util.*;
public class AddmissionMain {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the name of student: ");
        String name= sc.nextLine();
        System.out.print("Enter the mark of "+name);
        int mark= sc.nextInt();


        System.out.println("grade"+AddmissionGrade.getstudentgrade(mark));
    }


}
