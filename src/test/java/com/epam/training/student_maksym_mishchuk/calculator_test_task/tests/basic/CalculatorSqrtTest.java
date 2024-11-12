package com.epam.training.student_maksym_mishchuk.calculator_test_task.tests.basic;

import com.epam.tat.module4.Calculator;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Slf4j
public class CalculatorSqrtTest {

    private static Calculator calculator;

    @BeforeAll
    public static void setUp() {
        calculator = new Calculator();
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/csv/basic/sqrt/sqrt.csv")
    void testSqrt(double a, double expected) {
        log.debug("Testing sqrt(double) with input={}, expected={}", a, expected);
        assertEquals(expected, calculator.sqrt(a), 0.001,
                String.format("Failed: sqrt(%.2f) did not return expected result %.2f within tolerance", a, expected));
        log.debug("sqrt(double) result matched expected value for input={}", a);
    }
}