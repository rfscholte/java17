package com.example;

public class Cat implements Animal {
    @Override
    public String retrieveName() {
        return "Cat";
    }

    public boolean canWalk() {
        return true;
    }
}
