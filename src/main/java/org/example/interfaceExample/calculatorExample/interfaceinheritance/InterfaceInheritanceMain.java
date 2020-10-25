package org.example.interfaceExample.calculatorExample.interfaceinheritance;

public class InterfaceInheritanceMain {

    public static void main(String[] args) {

        IA a = new ClassImpl();
        a.m1();
        a.m2();
        //a.m3(); // m3 is not declared inside a  , classiml didn't extends IA
        System.out.println("-----------------------------");
        IB b = new ClassImpl();
        b.m1();
        b.m2();
        b.m3();
    }

    private static interface IA
    {
        void m1();
        void m2();
    }

    private static interface IB extends IA // only can extend other interface(s) only
    {
        void m1();
        void m3();
    }

    private static class ClassImpl implements IB
    {
        @Override
        public void m1() {
            System.out.println("classimpl m1()");
        }

        @Override
        public void m2() {
            System.out.println("classimpl m2()");
        }

        @Override
        public void m3() {
            System.out.println("classimpl m3()");
        }
    }
}