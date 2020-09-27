package org.example.debugging;

public class DebuggingMain {
public int serialno=3252425;                 // we can't use break point here cz its not in the block
static String projectno="pa-34-524";                      // debugging is the process of executing code and knowing its implimention
    public static void main(String[] args) {                // while debugging the break points inform jvm about the debug line from ide
        DebuggingMain o2=new DebuggingMain(25.32f, 15.22f); // we can add break point or watch point by left click side to the line no.
//DebuggingMain o1= new DebuggingMain(12,52);   // for integer value pass the constructor //calling ()
        System.out.println("debugging main");
        System.out.println("debugging line 9");
        System.out.println("debugging line 10");
        System.out.println("debugging line 11");     // click step over for line by line debugging
        System.out.println("debugging line 12");

                                                       // click step into for ( calling () -> called())
    }                                                   //click step out for ( called()->  calling () )
    DebuggingMain(float x,float y)
    {                                     // called ()
        float sum =x+y;
        System.out.println("inside contructor - sum of x and y = "+sum);  // this will execute first
    }
}
/* output
inside contructor - sum of x and y = 40.54
debugging main
debugging line 9
debugging line 10
debugging line 11
debugging line 12
*
* */