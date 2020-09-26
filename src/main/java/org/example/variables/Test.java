package org.example.variables;

public class Test {

    static {

        int roll = 01;
        System.out.println(" 1st static block: "+roll);

    }


    static {

        String name = "static block";
        System.out.println("2nd static block here: "+name);

    }
    public static void main(String[] args) {
        System.out.println("sout inside main ()");
        Test obj1=new Test();
    }


}

/*  output -   1st static block: 1
2nd static block here: static block
sout inside main ()
*/
