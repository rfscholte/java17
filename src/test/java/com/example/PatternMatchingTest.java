package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PatternMatchingTest {
    @Test
    public void testDirection() {
        assertEquals("North", PatternMatching.retrieveDirection("N"));
        assertEquals("East", PatternMatching.retrieveDirection("E"));
        assertEquals("South", PatternMatching.retrieveDirection("S"));
        assertEquals("West", PatternMatching.retrieveDirection("W"));
        assertEquals("Unknown direction", PatternMatching.retrieveDirection("U"));
    }
}
