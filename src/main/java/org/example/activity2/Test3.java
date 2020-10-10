package org.example.activity2;

public class Test3 {

        int x;
        String y;

        public Test3(int x, String y) {
            this.x = x;
            this.y = y;
            m1(this);
        }

        public static void main(String[] args) {
            Test3 t = new Test3(10,"john");
            System.out.println(t.x);
            System.out.println(t.y);
        }

        public void m1(Test3 t1)
        {
            t1.x = 100;
            t1.y = "Doe";

    }
}
