package com.greenfoxacademy.zoo;

public class Reptile extends Animals{

    public Reptile(String name) {
        super.name=name;
    }

    @Override
    public String breed() {
        return "laying eggs.";
    }
}
