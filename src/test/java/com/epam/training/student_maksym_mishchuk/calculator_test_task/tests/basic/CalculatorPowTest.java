package com.epam.training.student_maksym_mishchuk.calculator_test_task.tests.basic;

import com.epam.tat.module4.Calculator;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Slf4j
public class CalculatorPowTest {

    private static Calculator calculator;

    @BeforeAll
    public static void setUp() {
        calculator = new Calculator();
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/csv/basic/pow/pow.csv")
    void testPow(double a, double b, double expected) {
        log.debug("Testing pow(double, double) with base={}, exponent={}, expected={}", a, b, expected);
        assertEquals(expected, calculator.pow(a, b), 0.001,
                String.format("Failed: pow(%.2f, %.2f) did not return expected result %.2f within tolerance", a, b, expected));
        log.debug("pow(double, double) result matched expected value for base={}, exponent={}", a, b);
    }
}