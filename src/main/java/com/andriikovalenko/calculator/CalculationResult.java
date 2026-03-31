package com.andriikovalenko.calculator;

public class CalculationResult {
    private final double firstNumber;
    private final double secondNumber;
    private final OperationType operationType;
    private final double result;

    public CalculationResult(double firstNumber, double secondNumber, OperationType operationType, double result) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.operationType = operationType;
        this.result = result;
    }

    public double getFirstNumber() {
        return firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public OperationType getOperationType() {
        return operationType;
    }

    public double getResult() {
        return result;
    }

    @Override
    public String toString() {
        return firstNumber + " " + operationType + " " + secondNumber + " = " + result;
    }
}