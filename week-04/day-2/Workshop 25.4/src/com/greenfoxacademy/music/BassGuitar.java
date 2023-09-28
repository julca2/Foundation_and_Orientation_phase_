package com.greenfoxacademy.music;

public class BassGuitar extends StringedInstrument {


    public BassGuitar() {
        name = "Bass guitar";
        this.name = name;
        this.numberOfStrings = 4;

    }

    public BassGuitar(int numberOfStrings) {
        name = "Bass guitar";
        this.name = name;
        this.numberOfStrings = numberOfStrings;
    }
    @Override
    public void sound() {
        super.sound();
        System.out.println("Duum-duum-duum");
    }
}
