package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InstanceOfTest {

    @Test
    public void instanceOfBird() {
        Animal animal = new Bird();
        
        // original style
        if (animal instanceof Bird) {
           Bird bird = (Bird) animal;
           assertEquals(true, bird.canFly());
        }
        
        // enhanced style
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
    
    boolean instanceOfFlyingBird() {
        Animal animal = null;
        boolean flyingBird = animal instanceof Bird b && b.canFly();

        if (animal instanceof Bird b && b.canFly()) {}

        while (animal instanceof Bird b && b.canFly()) {}

        for (;animal instanceof Bird b && b.canFly();) {}

        return animal instanceof Bird b && b.canFly();
    }
}
