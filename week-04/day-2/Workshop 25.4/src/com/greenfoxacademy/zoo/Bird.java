package com.greenfoxacademy.zoo;

public class Bird extends Animals{
    public Bird(String name) {
        super.name=name;
    }

    @Override
    public String breed() {
            return "laying eggs.";
    }
}
