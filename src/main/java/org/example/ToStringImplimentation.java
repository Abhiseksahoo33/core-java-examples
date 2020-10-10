package org.example;

public class ToStringImplimentation {
    private int enrollment_no;
    private String name;
    private int year;

    public String ToStringImplimentation(int enrollment_no, String name, int year) {
        this.enrollment_no = enrollment_no;
        this.name = name;
        this.year = year;

        System.out.println(this);
        System.out.println("to string with this  : " + this);
    }

      /*public String toString(this) {
            return getClass().getName() + "@" + Integer.toHexString(hashCode());
        }
    }*/
        public String toString() {
//        return "UserAccount{" +
//                "id='" + id + '\'' +
//                ", name='" + name + '\'' +
//                ", balance=" + balance +
//                '}';
            String info = enrollment_no + ", "+ name +", "+year;
            return info;
        }

    public static void main(String[] args) {
        ToStringImplimentation var2=new ToStringImplimentation(10001254,"Abhisek sahoo",2022);
        System.out.println("student info.");
        System.out.println("Name : "+ var2.name+"\nEnrollment no :  "+ var2.enrollment_no+"\nPassout year "+ var2.year);
    }
}
