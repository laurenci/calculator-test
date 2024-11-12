package com.epam.training.student_maksym_mishchuk.calculator_test_task.tests.basic;

import com.epam.tat.module4.Calculator;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Slf4j
public class CalculatorSumTest {
    private static Calculator calculator;

    @BeforeAll
    public static void setUp() {
        calculator = new Calculator();
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/csv/basic/sum/sumLong.csv")
    public void testSumLong(long a, long b, long expected) {
        log.debug("Testing sum(long, long) with a={}, b={}, expected={}", a, b, expected);
        assertEquals(expected, calculator.sum(a, b),
                String.format("Failed: sum(%d, %d) did not return expected result %d", a, b, expected));
        log.debug("sum(long, long) result matched expected value for a={}, b={}", a, b);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/csv/basic/sum/sumDouble.csv")
    public void testSumDouble(double a, double b, double expected) {
        log.debug("Testing sum(double, double) with a={}, b={}, expected={}", a, b, expected);
        assertEquals(expected, calculator.sum(a, b), 0.001,
                String.format("Failed: sum(%.2f, %.2f) did not return expected result %.2f within tolerance", a, b, expected));
        log.debug("sum(double, double) result matched expected value for a={}, b={}", a, b);
    }
}