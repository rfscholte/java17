package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InstanceOfTest {

    @Test
    public void instanceOfBird() {
        Animal animal = new Bird();
        if (animal instanceof Bird bird) {
            assertEquals(true, bird.canFly());
        }
    }

    @Test
    public void instanceOfCat() {
        Animal animal = new Cat();
        if (animal instanceof Cat cat) {
            assertEquals(true, cat.canWalk());
        }
    }
}
