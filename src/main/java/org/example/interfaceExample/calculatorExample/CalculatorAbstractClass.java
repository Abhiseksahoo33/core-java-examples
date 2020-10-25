package org.example.interfaceExample.calculatorExample;

public abstract class CalculatorAbstractClass implements CalculatorInterface {
    @Override
    public int sum(int x, int y) {
        System.out.println("from abstract class sum");
        return x + y;
    }
}