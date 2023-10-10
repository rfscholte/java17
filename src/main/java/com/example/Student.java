package com.example;

import java.util.Locale;

public record Student(String firstName, String lastName) {
    
    public String toString() {
        return lastName.toUpperCase( Locale.ENGLISH ) + ", " + firstName;
    }
}
