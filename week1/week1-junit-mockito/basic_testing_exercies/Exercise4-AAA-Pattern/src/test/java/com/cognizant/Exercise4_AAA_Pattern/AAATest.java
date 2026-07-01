package com.cognizant.Exercise4_AAA_Pattern;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AAATest {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
        System.out.println("Setup executed");
    }

    @AfterEach
    void tearDown() {
        System.out.println("Teardown executed");
    }

    @Test
    void testAddition() {

        // Arrange
        int a = 5;
        int b = 5;

        // Act
        int result = calculator.add(a, b);

        // Assert
        assertEquals(10, result);
    }
}