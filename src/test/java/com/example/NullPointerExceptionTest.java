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
        String expectedExceptionMessage = """
                Cannot invoke "java.util.List.get(int)" because the return value of "com.example.Training.studentList()" is null""";
        assertEquals(expectedExceptionMessage, expectedException.getMessage());
    }

    @Test
    public void nullPointerExceptionForTraining() {
        Training nullTraining = null;

        Exception expectedException = assertThrows(NullPointerException.class, () ->
                nullTraining.studentList().get(0).lastName()
        );
        String expectedExceptionMessage = """
                Cannot invoke "com.example.Training.studentList()" because "nullTraining" is null""";
        assertEquals(expectedExceptionMessage, expectedException.getMessage());
    }
}
