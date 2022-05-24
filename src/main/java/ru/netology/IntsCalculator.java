package ru.netology;

import static ru.netology.Calculator.Operation.*;

public class IntsCalculator implements Ints {
    protected final Calculator target;

    public IntsCalculator() {
        this.target = new Calculator();
    }

    @Override
    public int sum(int arg0, int arg1) {
        return calculate(arg0, arg1, SUM);
    }

    @Override
    public int mult(int arg0, int arg1) {
        return calculate(arg0, arg1, MULT);
    }

    @Override
    public int pow(int a, int b) {
        return calculate(a, b, POW);
    }

    private int calculate(int a, int b, Calculator.Operation operation){
        return (int) target.newFormula()
                .addOperand(a)
                .addOperand(b)
                .calculate(operation)
                .result();
    }
}