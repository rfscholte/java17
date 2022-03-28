package com.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PatternMatchingTest {
    
    @ParameterizedTest()
    @MethodSource
    public void directions(String letter, String direction) {
        assertEquals(direction, PatternMatching.retrieveDirection(letter));
    }
    
    static String[][] directions() {
        // String letter, String direction
        return new String[][] {
            {"N", "North"},
            {"E", "East"},
            {"S", "South"},
            {"W", "West"},
            {"U", "Unknown direction"}
        };
    }
}
