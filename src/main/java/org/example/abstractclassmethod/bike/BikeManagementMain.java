package org.example.abstractclassmethod.bike;

public class BikeManagementMain {
    public static void main(String[] args) {
        BikeManagment bike = new HondaBike() ;

bike.manage();
        System.out.println("---------------------");
        bike=new HeroBike();
        bike.manage();


    }
}
/*output
* bike booked
test driving done
Honda Bikes on  Porcess
sold bike
---------------------
bike booked
test driving done
Hero Bikes on process
sold bike
* */
