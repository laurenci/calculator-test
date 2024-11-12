package com.epam.training.student_maksym_mishchuk.calculator_test_task.tests.sign;

import com.epam.tat.module4.Calculator;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorIsNegativeTest {
    private static Calculator calculator;

    @BeforeAll
    public static void setUp() {
        calculator = new Calculator();
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/csv/sign/isNegative.csv")
    void testIsNegative(long val, boolean expected) {
        assertEquals(expected, calculator.isNegative(val));
    }
}
