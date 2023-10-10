package com.example;

public class PatternMatching {
    
    sealed interface CardClassification permits Suit, Tarot {}
    enum Suit implements CardClassification { CLUBS, DIAMONDS, HEARTS, SPADES }
    static final class Tarot implements CardClassification {}
    
    
    static String describeCard(CardClassification c) {
        return switch (c) {
            case Suit s when s == Suit.CLUBS ->     "It's clubs"; // notice the 'when'
            case Suit.DIAMONDS ->                   { String d = "diamonds";
                                                      yield "It's " + d; }
            case Suit.HEARTS ->                     "It's hearts";
            case Suit s ->                          "It's spades"; // all others
            case Tarot t ->                         "It's a tarot";
            case null ->                            "You idiot";
        };
    }
}
