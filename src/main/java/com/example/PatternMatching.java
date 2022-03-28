package com.example;

public class PatternMatching {
    public static String retrieveDirection(String directionAbbreviation) {
        return switch (directionAbbreviation) {
            case "N" -> "North";
            case "E" -> "East";
            case "S" -> "South";
            case "W" -> "West";
            default -> "Unknown direction";
        };
    }
}
