package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NullPointerExceptionTest {

    @Test
    public void nullPointerExceptionForStudentList() {
        Training training = new Training("Core Java", null);

        Exception expectedException = assertThrows(NullPointerException.class, () ->
                training.studentList().get(0).lastName()
        );
        assertEquals("Cannot invoke \"java.util.List.get(int)\" because the return value of \"com.example.Training.studentList()\" is null", expectedException.getMessage());
    }

    @Test
    public void nullPointerExceptionForTraining() {
        Training nullTraining = null;

        Exception expectedException = assertThrows(NullPointerException.class, () ->
                nullTraining.studentList().get(0).lastName()
        );
        assertEquals("Cannot invoke \"com.example.Training.studentList()\" because \"nullTraining\" is null", expectedException.getMessage());
    }
}
