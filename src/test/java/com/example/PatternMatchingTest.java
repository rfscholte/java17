package com.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import com.example.PatternMatching.CardClassification;
import com.example.PatternMatching.Suit;
import com.example.PatternMatching.Tarot;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

import java.util.stream.Stream;

public class PatternMatchingTest {
    
    @ParameterizedTest()
    @MethodSource
    public void cardDescription(CardClassification card, String description) {
        assertEquals(description, PatternMatching.describeCard(card));
    }
    
    static Stream<Arguments> cardDescription() {
        // String letter, String direction
        return Stream.of(
            arguments(Suit.CLUBS, "It's clubs"),
            arguments(Suit.DIAMONDS, "It's diamonds"),
            arguments(Suit.HEARTS, "It's hearts"),
            arguments(Suit.SPADES, "It's spades"),
            arguments(new Tarot(), "It's a tarot"),
            arguments(null, "You idiot" )
         );
    }
    

    @ParameterizedTest()
    @MethodSource
    public void studentName(Object student) {
        if(student instanceof Student s) {
            assertEquals("JANE, Patrick", s.toString());
          }
        
        if(student instanceof Student(var firstName, var lastName)) {
          assertEquals("Patrick", firstName);
          assertEquals("Jane", lastName);
        }
    }
    
    static Stream<Arguments> studentName() {
        // String letter, String direction
        return Stream.of(
            arguments(new Student( "Patrick", "Jane" ))
         );
    }
}
