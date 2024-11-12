package com.epam.training.student_maksym_mishchuk.calculator_test_task.tests.trigonometry;

import com.epam.tat.module4.Calculator;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorCtgTest {
    private static Calculator calculator;

    @BeforeAll
    public static void setUp() {
        calculator = new Calculator();
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/csv/trigonometry/ctg.csv")
    void testCtg(double a, double expected) {
        assertEquals(expected, calculator.ctg(a), 0.001);
    }
}
