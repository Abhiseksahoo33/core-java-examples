package org.example.interfaceExample.calculatorExample;


public class Calculator1 implements CalculatorInterface {

    @Override
    public int sum(int x, int y) {
        return x + y;
    }

    @Override
    public int diff(int x, int y) {
        return  x - y;
    }

    @Override
    public int mul(int x, int y) {
        return x * y;
    }
}