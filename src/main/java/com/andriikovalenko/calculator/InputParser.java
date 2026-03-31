package com.andriikovalenko.calculator;

public class InputParser {

    public OperationType parseOperation(String input) {
        String normalizedInput = input.trim().toLowerCase();

        return switch (normalizedInput) {
            case "+", "add", "addition" -> OperationType.ADD;
            case "-", "subtract", "subtraction" -> OperationType.SUBTRACT;
            case "*", "multiply", "multiplication" -> OperationType.MULTIPLY;
            case "/", "divide", "division" -> OperationType.DIVIDE;
            default -> throw new IllegalArgumentException("Unsupported operation: " + input);
        };
    }

    public double parseNumber(String input) {
        try {
            return Double.parseDouble(input.trim());
        } catch (NumberFormatException exception) {
            throw new IllegalArgumentException("Invalid number: " + input);
        }
    }
}