package com.greenfoxacademy.zoo;

public class Mammal extends Animals{

    public Mammal(String name) {
        super.name=name;
    }


    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String breed() {
        super.breed();
        return "pushing miniature versions out.";
    }
}
