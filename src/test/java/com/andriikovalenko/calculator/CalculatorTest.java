package com.andriikovalenko.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    void shouldAddTwoNumbers() {
        double result = calculator.add(5, 3);
        assertEquals(8, result);
    }

    @Test
    void shouldSubtractTwoNumbers() {
        double result = calculator.subtract(10, 4);
        assertEquals(6, result);
    }

    @Test
    void shouldMultiplyTwoNumbers() {
        double result = calculator.multiply(6, 7);
        assertEquals(42, result);
    }

    @Test
    void shouldThrowExceptionWhenDividingByZero() {
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(10, 0));
    }

    @Test
    void shouldCalculateDivision() {
        double result = calculator.divide(20, 5);
        assertEquals(4, result);
    }
}