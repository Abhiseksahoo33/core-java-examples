package org.example.abstractclassmethod.bike;

public abstract  class BikeManagment {

    public  void manage()
    {
        booking();;
        testdrive();
        model();
        sell();
    }


    public void booking()
    {
        System.out.println("bike booked ");
    }
    public void testdrive()
    {
        System.out.println("test driving done");
    }
    public abstract void model();
 public void sell()
 {
     System.out.println("sold bike ");
 }
}
