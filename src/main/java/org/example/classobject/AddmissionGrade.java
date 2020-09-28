package org.example.classobject;

public abstract class AddmissionGrade {
   public static String studentname;

    public static int markofstudent;
    public  static int grade;

    public static String getstudentgrade(int markofstudent)
    {

        if(markofstudent >90)
        {
            return ("A+");
        }
       else if(markofstudent >80)
        {
            return ("A");
        }
       else if(markofstudent >70)
        {
            return ("b+");
        }
       else if(markofstudent >60)
        {
            return ("b");
        }
        else
        {
            return ("low grade");
        }
    }

}
