package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void twoPlusTwoShouldEqualsFour() {
        Calculator calculator = new Calculator();
        assertEquals(4, calculator.add(2, 2));
    }

    @Test
    void threePlusSevenShouldEqualsTen() {
        Calculator calculator = new Calculator();
        assertEquals(10, calculator.add(3, 7));
    }
}