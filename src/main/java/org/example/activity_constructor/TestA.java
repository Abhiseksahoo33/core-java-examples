package org.example.activity_constructor;

public class TestA {


        public TestA()
        {
            new TestA();
        }

    public static void main(String[] args) {
        TestA v=new TestA();
    }
}
