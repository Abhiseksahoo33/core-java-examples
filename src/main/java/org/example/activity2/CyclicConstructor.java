package org.example.activity2;

public class CyclicConstructor {


        private int addhar_no;
        private int Dl;



    private CyclicConstructor(int addhar_no) { // one  paramiterized constructor
           // this(addhar_no, 64942 ); // if we enable this line the warning will be
                               //  java: recursive constructor invocation
            this.addhar_no = addhar_no;      // this(addhar_no, 64942 ) will call the two param constructor
        }

        private CyclicConstructor(int addhar_no, int Dl) { // two-param constructor
            this(addhar_no); // first line in your constructor , it calls the single param constructor
            this.addhar_no = addhar_no;
            this.Dl = Dl;
            System.out.println("Adhhar no : "+addhar_no+ " Dl : "+Dl);
        }

    public static void main(String[] args) {
        CyclicConstructor var1= new CyclicConstructor(64946,6464);
    }
}
