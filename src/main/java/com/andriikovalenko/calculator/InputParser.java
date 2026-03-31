package com.andriikovalenko.calculator;

public class InputParser {

    public OperationType parseOperation(String input) {
        return switch (input.trim().toLowerCase()) {
            case "+", "add" -> OperationType.ADD;
            case "-", "subtract" -> OperationType.SUBTRACT;
            case "*", "multiply" -> OperationType.MULTIPLY;
            case "/", "divide" -> OperationType.DIVIDE;
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