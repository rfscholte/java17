package com.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class RecordsTest {

    @Test
    public void record() {
        Student student = new Student("James", "Gosling");
        Training training = new Training("Core Java", List.of(student));
        assertEquals("Gosling", training.studentList().get(0).lastName());
    }

    @Test
    public void immutable() {
        Training training = new Training( "twilight", new ArrayList<>() );
        assertEquals(0, training.studentList().size());
        assertThrows( UnsupportedOperationException.class, () ->
                training.studentList().add( new Student("Hi", "Jack") )
        );
        assertEquals(0, training.studentList().size());
    }
}
