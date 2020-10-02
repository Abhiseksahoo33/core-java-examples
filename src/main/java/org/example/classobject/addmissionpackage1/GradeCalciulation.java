package org.example.classobject.addmissionpackage1;


class GradeCalculation {
    String nameofstudent;
    int passoutyear;
    int markinpercentage;
    int grade;
    int scholarshipamount;


    int scholarshipcalculation( ) {
        if (markinpercentage>100) {
            System.out.println("invalid calculation of percentage");
            return markinpercentage;
        }
        if (markinpercentage > 90 && markinpercentage <= 100)
           return 6000;
        if (markinpercentage >= 60 && markinpercentage < 90)
            return 4000;
        if (markinpercentage >= 50 && markinpercentage <60)
            return 2000;
        if (markinpercentage > 0 && markinpercentage < 50)
            return 0;
        return 0;
    }
}
