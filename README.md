# Calculator Test Task

As a basis for this home task, use `Calculator-1.0.jar`.

## Instructions

1. **Write unit tests for the calculator jar library (`Calculator-1.0.jar`)**
    - Add `Calculator-1.0.jar` to your project reference.
    - Write tests using any testing framework (JUnit or TestNG).
    - Each class should test only one method of the library.
    - Implement tests with pre-conditions and post-conditions using appropriate annotations.
    - Run tests in your IDE.

2. **For TestNG only**
    - Create an `.xml` configuration file to run tests.
    - Create at least one test group. Some tests can depend on this group, or this group can be used to exclude/include tests from launch using the XML suite.

3. **Additional Requirements**
    - Create parameterized tests (data-driven approach).
    - Configure and execute tests in parallel mode.

## Acceptance Criteria

1. A separate Unit Test class exists for each method of `Calculator-1.0.jar`.
2. JUnit or TestNG is used in the home task.
3. Tests have pre-conditions and post-conditions.
4. Screenshots with results of running in the IDE are available.
5. For TestNG only: XML configuration exists for the suite, allowing the use/run of a group of tests.
6. Data-driven approach is demonstrated with test framework features.
7. Parallel execution of tests is demonstrated with test framework features.

## Bonus Task

1. `Calculator-1.0.jar` contains a couple of defects. Each found and reported defect gives you +0.1 as a bonus.
