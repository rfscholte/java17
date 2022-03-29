package com.example;

public class Bird implements Animal {
    @Override
    public String retrieveName() {
        return "Bird";
    }

    public boolean canFly() {
        return true;
    }
}
