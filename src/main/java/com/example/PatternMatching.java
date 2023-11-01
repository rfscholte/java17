package com.example;

public class PatternMatching {

    static String describeCard(CardClassification c) {
        return switch (c) {
            case Suit s
                when s.name().startsWith("C") ->    "It's clubs"; // notice the 'when'
            case Suit.DIAMONDS ->                   { String d = "diamonds";
                                                      yield "It's " + d; }
            case Suit.HEARTS ->                     "It's hearts";
            case Suit s ->                          "It's spades"; // all others, like default, BAD!!
            case Tarot t ->                         "It's a tarot";
            case null /*, default */ ->             "You idiot";
        };
    }
}
