package com.greenfoxacademy.music;

public class Violin extends StringedInstrument{
    public Violin() {
        name = "Violin";
        this.name = name;
        this.numberOfStrings = 4;
    }

    @Override
    public void sound() {
        super.sound();
        System.out.println("Screech");
    }
}
