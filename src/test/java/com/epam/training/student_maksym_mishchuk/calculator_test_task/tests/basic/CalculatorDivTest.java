package com.epam.training.student_maksym_mishchuk.calculator_test_task.tests.basic;

import com.epam.tat.module4.Calculator;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@Slf4j
public class CalculatorDivTest {
    private static Calculator calculator;

    @BeforeAll
    public static void setUp() {
        calculator = new Calculator();
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/csv/basic/div/divLong.csv")
    void testDivLong(long a, long b, long expected) {
        log.debug("Testing div(long, long) with a={}, b={}, expected={}", a, b, expected);
        assertEquals(expected, calculator.div(a, b),
                String.format("Failed: div(%d, %d) did not return expected result %d", a, b, expected));
        log.debug("div(long, long) result matched expected value for a={}, b={}", a, b);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/csv/basic/div/divLongException.csv")
    void testDivLongException(long a, long b) {
        log.debug("Testing div(long, long) for exception with a={}, b={}", a, b);
        assertThrows(NumberFormatException.class, () -> calculator.div(a, b),
                String.format("Failed: div(%d, %d) did not throw NumberFormatException as expected", a, b));
        log.debug("Expected exception thrown for div(long, long) with a={}, b={}", a, b);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/csv/basic/div/divDouble.csv")
    void testDivDouble(double a, double b, double expected) {
        log.debug("Testing div(double, double) with a={}, b={}, expected={}", a, b, expected);
        assertEquals(expected, calculator.div(a, b), 0.001,
                String.format("Failed: div(%.2f, %.2f) did not return expected result %.2f within tolerance", a, b, expected));
        log.debug("div(double, double) result matched expected value for a={}, b={}", a, b);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/csv/basic/div/divDoubleException.csv")
    void testDivDoubleException(double a, double b) {
        log.debug("Testing div(double, double) for exception with a={}, b={}", a, b);
        assertThrows(NumberFormatException.class, () -> calculator.div(a, b),
                String.format("Failed: div(%.2f, %.2f) did not throw NumberFormatException as expected", a, b));
        log.debug("Expected exception thrown for div(double, double) with");
    }
}