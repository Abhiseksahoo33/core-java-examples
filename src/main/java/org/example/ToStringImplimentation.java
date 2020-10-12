package org.example;

public class ToStringImplimentation {
    private int enrollment_no;
    private String name;
    private int year;

    public ToStringImplimentation(int enrollment_no, String name, int year) {
        this.enrollment_no = enrollment_no;
        this.name = name;
        this.year = year;

        System.out.println(this);
        System.out.println("to string with this  : " +this);
    }

      /*public String toString() {
          return getClass().getName() + "@" + Integer.toHexString(hashCode());}
          /**
           * Returns a string representation of the object. In general, the
           * {@code toString} method returns a string that
           * "textually represents" this object. The result should
           * be a concise but informative representation that is easy for a
           * person to read.
           */


        public String toString() {
        return "Student info{" +
                "enrollment ='" + enrollment_no + '\'' +
                ", name='" + name + '\'' +
                ", year=" + year +
                '}';
           /* String info =" enrollment"+ enrollment_no + ",name "+ name +",year "+year;
            return info;*/
        }

    public static void main(String[] args) {
        ToStringImplimentation var2=new ToStringImplimentation(10001254,"Abhisek sahoo",2022);
        System.out.println("student info.");
        System.out.println("Name : "+ var2.name+"\nEnrollment no :  "+ var2.enrollment_no+"\nPassout year "+ var2.year);
    }
}
/*
* output
* Student info{enrollment ='10001254', name='Abhisek sahoo', year=2022}
to string with this  : Student info{enrollment ='10001254', name='Abhisek sahoo', year=2022}
student info.
Name : Abhisek sahoo
Enrollment no :  10001254
Passout year 2022
* */