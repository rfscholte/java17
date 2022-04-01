package com.example;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RecordsTest {

    @Test
    public void record() {
        Student student = new Student("James", "Gosling");
        Training training = new Training("Core Java", List.of(student));
        assertEquals("Gosling", training.studentList().get(0).lastName());
    }
}
