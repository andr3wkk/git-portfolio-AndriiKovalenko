package com.andriikovalenko.calculator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        InputParser inputParser = new InputParser();
        HistoryManager historyManager = new HistoryManager();
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Calculator CLI");
            System.out.println("Enter first number:");
            double firstNumber = inputParser.parseNumber(scanner.nextLine());

            System.out.println("Enter operation (+, -, *, /, add, subtract, multiply, divide):");
            OperationType operationType = inputParser.parseOperation(scanner.nextLine());

            System.out.println("Enter second number:");
            double secondNumber = inputParser.parseNumber(scanner.nextLine());

            double result = calculator.calculate(firstNumber, secondNumber, operationType);
            CalculationResult calculationResult =
                    new CalculationResult(firstNumber, secondNumber, operationType, result);

            historyManager.addResult(calculationResult);

            System.out.println("Result: " + result);
            System.out.println("Calculation summary:");
            System.out.println(calculationResult);
            System.out.println("History as JSON:");
            System.out.println(historyManager.exportHistoryAsJson());
        } catch (IllegalArgumentException exception) {
            System.out.println("Error: " + exception.getMessage());
        } finally {
            scanner.close();
        }
    }
}