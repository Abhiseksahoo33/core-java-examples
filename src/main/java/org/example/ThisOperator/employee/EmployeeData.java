package org.example.ThisOperator.employee;

public class EmployeeData {
    private String employee_name;
   private  int Registration_no;
   private int joining_year;
   private String status;

    public EmployeeData(String employee_name,int registration_no,int joining_year,String status) {
   this.employee_name=employee_name;
   this.status=status;
   this.Registration_no=registration_no;
   this.joining_year=joining_year;
   display(); // displays informations of employee

    }
    public EmployeeData() {
    }
    public String getEmployee_name() {
        return employee_name;
    }

    public void setEmployee_name(String employee_name) {
        this.employee_name = employee_name;
    }

    public int getRegistration_no() {
        return Registration_no;
    }

    public void setRegistration_no(int registration_no) {
        Registration_no = registration_no;
    }

    public int getJoining_year() {
        return joining_year;
    }

    public void setJoining_year(int joining_year) {
        this.joining_year = joining_year;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
       if(status==null)
       {
           this.status="single";
       }
       else
           this.status=status;
    }

 public void display()
 {
     System.out.println("name : "+this.employee_name);
     System.out.println("joining year: "+this.joining_year);
     System.out.println("registration no : "+this.Registration_no);
     System.out.println("maretal status : "+this.status);
 }
}
