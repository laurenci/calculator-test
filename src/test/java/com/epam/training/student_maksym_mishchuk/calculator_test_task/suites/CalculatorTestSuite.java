package com.epam.training.student_maksym_mishchuk.calculator_test_task.suites;

import lombok.extern.slf4j.Slf4j;
import org.junit.platform.suite.api.*;

@Suite
@SuiteDisplayName("Calculator Test Suite")
@SelectPackages("com.epam.training.student_maksym_mishchuk.calculator_test_task.tests")
@IncludeClassNamePatterns(".*Calculator?[\\w]+Test?")
@Slf4j
public class CalculatorTestSuite {
    @BeforeSuite
    public static void before() {
        log.info("Calculator Test Suite starting");
    }

    @AfterSuite
    public static void after() {
        log.info("Calculator Test Suite finished");
    }
}