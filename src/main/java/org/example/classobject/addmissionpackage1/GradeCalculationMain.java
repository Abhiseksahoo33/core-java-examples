package org.example.classobject.addmissionpackage1;
 class GradecalCulationMain
{
    public static void main(String[] args) {
        GradeCalculation var1 =new GradeCalculation();
        var1.nameofstudent="Abhisek";
        var1.passoutyear=2022;
        var1.markinpercentage=75;
        System.out.println("scholarship amount for "+var1.nameofstudent+" is " +var1.scholarshipcalculation());

        GradeCalculation var2 =new GradeCalculation();
        var2.nameofstudent="prasad";
        var2.passoutyear=2022;
        var2.markinpercentage=45;
        System.out.println("scholarship amount for "+var2.nameofstudent+" is " +var2.scholarshipcalculation());

        GradeCalculation var3 =new GradeCalculation();
        var3.nameofstudent="sambit";
        var3.passoutyear=2022;
        var3.markinpercentage=145;
        System.out.println("scholarship amount for "+var3.nameofstudent+" is " +var3.scholarshipcalculation());


        System.out.println(var3);
        System.out.println(var2);
        System.out.println(var1==var2);
        System.out.println(var1.hashCode());
        System.out.println(var1.hashCode()==var2.hashCode());

    }
}