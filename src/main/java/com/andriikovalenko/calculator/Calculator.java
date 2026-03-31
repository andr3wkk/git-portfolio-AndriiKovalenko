package com.andriikovalenko.calculator;

public class Calculator {

    public double add(double firstNumber, double secondNumber) {
        return firstNumber + secondNumber;
    }

    public double subtract(double firstNumber, double secondNumber) {
        return firstNumber - secondNumber;
    }

    public double multiply(double firstNumber, double secondNumber) {
        return firstNumber * secondNumber;
    }

    public double divide(double firstNumber, double secondNumber) {
        if (secondNumber == 0) {
            throw new IllegalArgumentException("Cannot divide by zero.");
        }
        return firstNumber / secondNumber;
    }

    public double calculate(double firstNumber, double secondNumber, OperationType operationType) {
        return switch (operationType) {
            case ADD -> add(firstNumber, secondNumber);
            case SUBTRACT -> subtract(firstNumber, secondNumber);
            case MULTIPLY -> multiply(firstNumber, secondNumber);
            case DIVIDE -> divide(firstNumber, secondNumber);
        };
    }
}