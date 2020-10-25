package org.example.interfaceExample.calculatorExample;


public class CalculatorMain {
    public static void main(String[] args) {
        CalculatorInterface calculator = new Calculator1();
        // calculator = new PrintableCalculatorImpl();
        calculator = new Calculatorconcrete();
        System.out.println(calculator.getClass());
        System.out.println(calculator.sum(10,20));
        System.out.println(calculator.diff(10,20));
    }
}